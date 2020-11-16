package BJ9012_Stack;

import java.util.Scanner;
import java.util.Stack;

public class BJ9012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack stk = new Stack(); // stack
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			stk.clear(); //stack 초기화
			String s = sc.next();
			//System.out.println(s);

			boolean c = true;
			// 짝이 완전히 다 맞지 않았는데 끝난경우 -> c= false

			for (int j = 0; j < s.length(); j++) {
				
				if (s.charAt(j) == '(') {
					stk.push(s.charAt(j));
				} else {
					if (stk.size() > 0) {
						stk.pop(); // ')' 꺼낸다
					} else {
						c = false;
						break;
					}
				}
			}
			if (stk.size() == 0 && c == true) {
				System.out.println("YES"); // push -pop이 딱딱 맞아 떨어지면 yes
			} else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

}
