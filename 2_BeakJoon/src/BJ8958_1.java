import java.util.Scanner;

public class BJ8958_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		String str[] = new String[number];
		//int sum[] = new int[number];
		for (int i = 0; i < number; i++) {
			str[i] = sc.next();

		}
	 

		for (int i = 0; i < number; i++) {
			int sum = 0;
			if (str[i].charAt(i) == 'O') {
				sum++;
				if (str[i].charAt(i + 1) == 'O') {
					sum += 1;
				} else if (str[i].charAt(i + 1) == 'X') {
					sum += 0;
				}

			} else if (str[i].charAt(i) == 'X') {
				if (str[i].charAt(i + 1) == 'O') {
					sum += sum + 1;
				} else if (str[i].charAt(i + 1) == 'X') {
					sum += 0;
				}
			}
			
		}

//		for (int i = 0; i < number; i++) {
//			System.out.println(sum);
//		}

	}

}
