
import java.util.Scanner;

public class H35b {
	public static void main(String[] args) {
		int a, b;
		
		System.out.print("Ange heltalen a och b: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		
		if (a >= 0 && a <= 10 || a % 2 > 0 && b % 2 == 0) {
			a = a - 1;
			b = b - 1;
		}else {
			
		}
		System.out.print("a = " + a + " och b = " + b);
	}
	

}
