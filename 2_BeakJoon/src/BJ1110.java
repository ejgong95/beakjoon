//도무지 모르겠다

import java.util.Scanner;

public class BJ1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();

		int F = N;
		int A, B, C, D;
		int cnt = 1;
		while (true) {
			A = N / 10;
			B = N % 10;
			
			C = A + B;
			
			D = (B * 10) + (C % 10);
			N = D;
			
			if (F==N) {
				break;
			}else {
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}

}
