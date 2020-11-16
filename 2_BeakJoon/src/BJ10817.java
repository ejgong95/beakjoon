import java.util.Scanner;

public class BJ10817 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		int mid = 0;
		if (A > B && A > C) { // max A		
			if (B > C) {
				mid = B;
			} else {
				mid = C;
			}
		} else if (B > A && B > C) { // max B
			if (A > C) {
				mid = A;
			} else {
				mid = C;
			}

		} else { // max = c
			if (A > B) {
				mid = A;
			} else {
				mid = B;
			}
		}
		System.out.println(mid);
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		scanner.close();
		
		boolean a2 = b <= a  && a <= c || c <= a && a <= b;
		boolean b2 = a <= b  && b <= c || c <= b && b <= a;
		boolean c2 = a <= c  && c <= b || b <= c && c <= a;
		
		int ans = 0;
		
		if (a2) { ans = a; }
		else if (b2) { ans = b; }
		else if (c2) { ans = c; }
		
		System.out.print(ans);

	}
}
