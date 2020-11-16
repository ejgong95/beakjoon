import java.util.Scanner;

public class BJ2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];

		int max = 1;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

			if (arr[i] > max) {
				max = arr[i];
				cnt = i + 1;
			}

		}
		sc.close();

		System.out.println(max);
		System.out.println(cnt);

	}

}
