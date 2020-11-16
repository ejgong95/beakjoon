import java.util.Scanner;

// º° Âï±â 9
public class BJ2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = i + 1; j < 2 * n - (i * 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int k = 0; k < n - 2 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*(i+1)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
