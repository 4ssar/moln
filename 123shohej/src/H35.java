
import java.util.Scanner;

public class H35 {
	public static void main(String[] args) {
		int a, b;
		double x;
		
		System.out.print("Ange heltalen a och b samt det reela talet x: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		x = scan.nextDouble();
		
		if ((a * b) > 0){
			x = 12.2;
		}
		else if ((a * b) == 0){
			x = x * 2;
		}
		else {
			x = x + 10;
		}
		System.out.print("x är " + x);
		
	}

	

}
