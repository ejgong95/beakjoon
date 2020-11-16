import java.util.Scanner;

//º°Âï±â13
public class BJ2523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}
		for (int i = 0; i < n; i++) {
			for (int k = i + 1; k < n; k++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
