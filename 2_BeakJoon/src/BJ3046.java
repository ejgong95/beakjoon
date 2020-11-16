import java.util.Scanner;

public class BJ3046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// S=(R1+R2)/2
		Scanner sc = new Scanner(System.in);
		int R1 = 0, R2 = 0, S = 0;

		R1 = sc.nextInt();
		S = sc.nextInt();
		sc.close();
		
		R2 = (2 * S) - R1;
		System.out.println(R2);

	}

}
