import java.util.Scanner;

public class Bj2908Review2 {
	public static void printString(String p) {
		for (int i = p.length() - 1; i >= 0; i--) {
			System.out.print(p.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp1 = sc.next();
		String inp2 = sc.next();
		sc.close();
	//	printString(inp1);
	//	printString(inp2);

		for (int i = inp1.length() - 1; i >= 0; i--) {
			if (inp1.charAt(i) == inp2.charAt(i)) {
				continue;
			} else if (inp1.charAt(i) > inp2.charAt(i)) {
				printString(inp1);
				break;
			} else
				printString(inp2);
			break;

		}

	}

}
