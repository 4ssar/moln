
import java .util.Scanner;

public class P34 {
	public static void main(String[] args) {
		
		System.out.print("Ange antal tal i talf�ljden:" );
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double nbr, m, s;
		double xi = 0;
		double xipow = 0;
		
		if (n <= 5) {
			System.out.print("F�r f� tal f�r standardavvikelse!");
		}
		else {
			System.out.print("Ange de " + n + " talen i talf�ljden: " );
			for (int amount = 0; amount < n; amount++) {
				nbr = scan.nextDouble();
				xi = xi + nbr;
				xipow = xipow + Math.pow(nbr, 2);
			}
			
			m = xi/n;
			s = Math.sqrt((xipow-Math.pow((n*m), 2))/(n-1));
			System.out.print("Medelv�rdet �r " + m + " och standardavvikelsen �r " + s);
			
		}


	}

}
