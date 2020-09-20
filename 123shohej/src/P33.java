
import java.util.Scanner;

public class P33 {
	public static void main(String[] args) {
		
		int amount = 0;
		System.out.print("Mata in en följd av positiva heltal: ");
		Scanner scan = new Scanner(System.in);
		
		for (int nbr = 1; nbr != 0;) {
			nbr = scan.nextInt(); 
			if (nbr != 0) {
				amount++;
			}
			
		}
		System.out.print("Antal tal i talföljden: " + amount);
	}

}
