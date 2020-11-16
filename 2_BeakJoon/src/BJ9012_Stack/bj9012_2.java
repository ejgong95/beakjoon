package BJ9012_Stack;

import java.util.Scanner;

public class bj9012_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String s = sc.next();
			int sum = 0;
			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(j) == '(') {
					sum++;
				} else {
					sum--;
				}
				if (sum < 0) {
					break;
				}

			}
			if (sum == 0) {
				System.out.println("YES"); // push -popÀÌ µüµü ¸Â¾Æ ¶³¾îÁö¸é yes
			} else {
				System.out.println("NO");
			}

		}
		sc.close();
	}

}
