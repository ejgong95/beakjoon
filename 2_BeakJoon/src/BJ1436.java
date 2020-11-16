import java.util.Scanner;

public class BJ1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String arr[] = new String[n];
		String six = "666";
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + six;
			if(i == 0) {
				arr[0] = six;
			}
			//System.out.println(arr[i]);
			if (arr[i].equals("6666")) {
				i = 0;
				arr[i] = six + i;
				break;
			}
			
			System.out.println(arr[i]);
			
		}
		
		
		
		
	}
}
