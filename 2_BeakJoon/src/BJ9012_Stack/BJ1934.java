package BJ9012_Stack;

import java.util.Scanner;

public class BJ1934 {
	static int gcd_get(int A, int B) {
		int i, ans = 0;
		for(i = 1; i <= A; i++) {
			if(A % i == 0 && B % i == 0) {
				ans = i;
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int A = 0;
		int B = 0;
		int gcd = gcd_get(A, B);
		
		
		for (int i = 0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			int lcm = A * B / gcd;
			System.out.println(lcm);
		}
		
		sc.close();
		
		
		
	}

}
