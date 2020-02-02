import java.util.Scanner;

public class ABC081A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char[] charArray = str.toCharArray();

		int sum = 0;

		for(int i = 0; i < 3; i ++) {
			if(charArray[i] == '1') {
				sum += 1;
			}
		}
		System.out.println(sum);
	}
}
