import java.util.Scanner;

public class BJ2908Review {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inp1 = sc.next();
		String inp2 = sc.next();
		sc.close();
		
		/*정방향
		for (int i = 0; i < inp1.length(); i++) {
			System.out.print(inp1.charAt(i));
		}
		*/
		/*역방향
		for (int i = inp1.length()-1 ; i >= 0; i--) {
			System.out.print(inp1.charAt(i));
		}
		for (int i = inp1.length()-1 ; i >= 0; i--) {
			System.out.print(inp2.charAt(i));
		}
		*/
		
		for (int i = inp1.length()-1 ; i >= 0; i--) {
			if(inp1.charAt(i) == inp2.charAt(i)) {
				continue;
			} else if (inp1.charAt(i) > inp2.charAt(i)) {
				//print inp1 reserve string
				for (int j = inp1.length() - 1; j >= 0; j--) {
					System.out.print(inp1.charAt(j));
				}
				break; 
			} else {
				//print inp2 reserve string
				for (int j = inp2.length() - 1; j >= 0; j--) {
					System.out.print(inp2.charAt(j));
				}
			}
		
		
		}
		
	}

}
