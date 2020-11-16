import java.util.Scanner;

public class BJ8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] strArr = new String[N];
		
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = sc.next();
		}
		sc.close();
//		for (int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
//		
		for (int i = 0; i < strArr.length; i++) { //테스트케이스의갯수
			//int num = Integer.parseInt(strArr[i]);
			int score = 0; // 초기화가 왜 여기서 선언? -> for문안에서 계속해서 초기화 해야 되기 때문에 밖에다 선언하면  총합?이도니다....,,,
			int p = 1;
			for (int j = 0; j < strArr[i].length(); j++) { //케이스하나하나
				if(strArr[i].charAt(j) == 'O') {
					score += p++; //p++는 연속된 O값을 출력하기위해 (ex)1 + 2 + 3...
				} else {
					p = 1;
				}
			}
			System.out.println(score);
		}
		
		

	}

}
