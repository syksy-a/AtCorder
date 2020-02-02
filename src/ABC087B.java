import java.util.Scanner;

public class ABC087B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		int count = 0;

		for(int A = 0; A <= a; A++) {
			for(int B = 0; B <= b; B ++) {
				for(int C = 0; C <= c; C ++) {
					if((500*A + 100*B + 50*C) == x) {
						count ++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
