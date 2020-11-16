import java.util.Scanner;

//º°Âï±â 7
public class BJ2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * (i + 1) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// System.out.println("-----------------");

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 2 + i; k < (2 * n) - (i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
