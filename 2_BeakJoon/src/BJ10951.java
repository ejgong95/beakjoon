import java.util.Scanner;

public class BJ10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		while (sc.hasNextInt()) {
			A = sc.nextInt();
			B = sc.nextInt();		
			System.out.println(A+B);
		}
		
		
		sc.close();
		
	}

} 
