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
		for (int i = 0; i < strArr.length; i++) { //�׽�Ʈ���̽��ǰ���
			//int num = Integer.parseInt(strArr[i]);
			int score = 0; // �ʱ�ȭ�� �� ���⼭ ����? -> for���ȿ��� ����ؼ� �ʱ�ȭ �ؾ� �Ǳ� ������ �ۿ��� �����ϸ�  ����?�̵��ϴ�....,,,
			int p = 1;
			for (int j = 0; j < strArr[i].length(); j++) { //���̽��ϳ��ϳ�
				if(strArr[i].charAt(j) == 'O') {
					score += p++; //p++�� ���ӵ� O���� ����ϱ����� (ex)1 + 2 + 3...
				} else {
					p = 1;
				}
			}
			System.out.println(score);
		}
		
		

	}

}
