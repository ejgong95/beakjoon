import java.util.Scanner;

public class BJ2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		int num = (A * B * C);
		int[] cnt = new int[10];
		String s = Integer.toString(num);
		// System.out.println(num);

		for (int i = 0; i < s.length(); i++) {
			// System.out.println(s.charAt(i)); // 해당인덱스에있는 값을 뽑아온다
			cnt[s.charAt(i) - '0']++;
		}

		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}

	}

}
