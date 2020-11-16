import java.util.Scanner;

public class BJ10994 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int Z = (2 * n) + 2 * (n - 1) - 1;
		if (n == 1) {
			System.out.print("*");
		} else {
			for (int i = 0; i < (2 * n) + 2 * (n - 1) - 1; i++) {
				for (int j = 0; j < (2 * n) + 2 * (n - 1) - 1; j++) {
					if (i == 0 || i == Z - 1) {

						System.out.print("*");

					}

					else if (i == 1 || i == Z - 2) {
						if (j == 0 || j == Z - 1) {
							System.out.print("*");
						} else {
							System.out.print("0");
						}

					} else if (i == 2 || i == Z - 3) {
						if (j == 1 || j == Z - 2) {
							System.out.print("0");
						} else {
							System.out.print("*");
						}
					} else if (i == 3 || i == Z - 4) {
						if (j == 1 || j == Z - 2) {
							System.out.print("0");
						} else {
							System.out.print("*");
						}
					} else {
						System.out.print("*");
					}

				}

				System.out.println();
			}
		}

	}

}
