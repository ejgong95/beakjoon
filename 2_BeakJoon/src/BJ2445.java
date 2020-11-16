import java.util.Scanner;

public class BJ2445 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			for (int k = i; k < 2 * n - i - 2; k++) {
				System.out.print(" ");
			}
			for (int z = 0; z < i + 1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n - 1; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < 2 * i + 2; k++) {
				System.out.print(" ");
			}
			for (int z = i; z < n - 1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
