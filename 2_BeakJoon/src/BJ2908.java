import java.util.Scanner;

public class BJ2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String a;
		String b;

		a = sc.next();
		b = sc.next();
		sc.close();

		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);

//		System.out.println(num1);
//		System.out.println(num2);
		
		// int sangsu = 0;
		if (num1 > num2) {
			// num2 = sangsu;
			System.out.println("" + b.charAt(2) + b.charAt(1) + b.charAt(0));
		} else {
			// num1 = sangsu;
			System.out.println("" + a.charAt(2) + a.charAt(1) + a.charAt(0));
		}

	}

}
