
import java.util.Scanner;

public class Matematik {
	public static void main(String[] args) {
		
		double akatet, bkatet, hyp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange kateternas l�ngder: ");
		akatet = scan.nextDouble();
		bkatet = scan.nextDouble();
		hyp = Math.hypot(akatet, bkatet);
		System.out.print("Hypotenusan �r " + hyp);
				
	}

}
