import java.util.Scanner;

public class BJ10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int N = sc.nextInt();
		
		
		int[] ar = new int[N];
		for(int i = 0; i < N; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		System.out.println(N);
		for(int i = 0; i < N; i++) {
			System.out.print(ar[i] + " ");
		}
		
		int min = 999;
		
		for (int i = 0; i < N; i ++) {
			if(min > ar[i]) {
				min = ar[i];
			}
		}
		System.out.println();
		System.out.println(min);
		
		int max = -999;
		
		for (int i = 0; i < N; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
		}
		System.out.println();
		System.out.println(max);
		
		
		
	}

}
