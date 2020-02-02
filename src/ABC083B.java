import java.util.Scanner;

public class ABC083B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int sum = 0;

		for(int i = 1; i <= n; i ++) {
			if((a <=sumDigits(i)) && (sumDigits(i) <= b)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static int sumDigits(int n) {
        int sum = 0;
        //自然数の各桁の和を計算
        while (n != 0) {
        	//sumDigitsは単独ではloopしないので、while loopを使う。
            sum += n % 10;
            //再右端の桁を得るために%10を利用する。
            n /= 10;
            //再右端の桁を取り除くためにn/=10を利用する。
        }
        return sum;//合計を返す
    }
}
