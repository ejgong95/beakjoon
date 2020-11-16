import java.util.Scanner;

public class BJ2440_mini¹®Á¦ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
