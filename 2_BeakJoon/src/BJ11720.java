import java.util.Scanner;

public class BJ11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String inp = sc.next();
		sc.close();
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < N; i++) {
			sum += inp.charAt(i) - '0';
			Character c = inp.charAt(i);
			sum2 += Character.getNumericValue(c);
		}

		System.out.println("\n" + sum);
		System.out.println("\n" + sum2);

	}

}
