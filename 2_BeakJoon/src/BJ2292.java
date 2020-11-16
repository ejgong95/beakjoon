import java.util.Scanner;

public class BJ2292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int min = 1 , next;
		for (int i = 1; i <= N; i++) {
			next = min + (6 * i);
			if (next >= N ) {
				System.out.println(i + 1);
				break;
			}
			min = next;
		}

	}

}
