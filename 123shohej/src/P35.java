
import java.util.Scanner;
public class P35 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Skriv in tal: ");
		int prenbr = 0;
		int amount = 0;
		for(int nbr = 1; nbr > 0;) {
			nbr = scan.nextInt();
			if(nbr == prenbr) {
				amount++;
			}
			prenbr = nbr;
		}
		System.out.print("Antal gånger: " + amount);
	}

}
