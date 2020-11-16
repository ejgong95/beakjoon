import java.util.Scanner;

public class BJ2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

//		// 공백찍기
//		for (int j = 0; j < N - 1; j++) {
//			for (int i = 0; i < j; i++) {
//				System.out.print("?");
//			}
//			for (int i = 1; i < N; i++) {
//
//				for (int z = 0; z < (2 * z - 1); z++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

		for (int j = N - 1; j >= 0; j--) {
			// 1 공백찍기
			for (int i = 0; i < j; i++) {
				System.out.print(" ");
			}
			// 2 별찍기
			for (int k = j; k < N; k++) {
				System.out.print("*");
			}
			// 3 별찍기(나머지반)
			for (int m = j; m < N - 1; m++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
