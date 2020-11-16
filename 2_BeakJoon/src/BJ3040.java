import java.util.Scanner;

public class BJ3040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		//System.out.println(sum);

		int num = sum - 100;

		//System.out.println(num);

		int a = 0;
		int b = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == num) {
					a = arr[i];
					b = arr[j];
					//System.out.println(arr[i] + " " + arr[j]);
					break;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				arr[i] = arr[7];
			}
			if (arr[i] == b) {
				arr[i] = arr[8];
			}
		}

		for (int i = 0; i < 7; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
