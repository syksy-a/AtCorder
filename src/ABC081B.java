import java.util.Scanner;

public class ABC081B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int count = 0;
		boolean even = true;

		int[] board = new int[n];

		for(int i = 0; i < n; i ++) {
			board[i] = Integer.parseInt(sc.next());
			if(board[i] %2 != 0) {
				even = false;
			}else {
				board[i] = board[i] / 2 ;
			}
		}

		if(even) {
			count ++;
		}

		while(isEven(board, n)) {
			count ++;
		}
		System.out.println(count);
	}

	static boolean isEven(int[] array, int n) {
		boolean flg = true;
		for(int i = 0; i < n; i ++) {
			if(array[i] %2 != 0) {
				flg = false;
			}else {
				array[i] = array[i] / 2;
			}
		}
		return flg;
	}
}
