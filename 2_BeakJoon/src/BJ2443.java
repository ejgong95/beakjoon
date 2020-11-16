import java.util.Scanner;

//º°Âï±â6
public class BJ2443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 2 * i + 1; j < 2 * n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
