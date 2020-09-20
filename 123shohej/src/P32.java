

public class P32 {
	public static void main(String[] args) {
		
		int sum = 0;
		int amount = 0;
		int term = 1;
		
		while (sum < 100000) {
			sum = sum + term;
			term = term + 2;
			amount++;
					
		}
		System.out.print(amount + " antal termer behövdes för att summan skulle bli större än 100000");
	}

}
