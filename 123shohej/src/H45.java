import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;
import java.util.Random;

public class H45 {
	public static void main(String[] args) {
		
		SimpleWindow w = new SimpleWindow(600, 600, "Kvadrat");
		Turtle t1 = new Turtle(w, 250, 250);
		Turtle t2 = new Turtle(w, 350, 350);
		double distance = Math.hypot(100, 100);
		
		while (distance >= 50) {
			
			Random rand = new Random();
			
			int t1Forward = 1 + rand.nextInt(10);
			int t1Turn = -179 + rand.nextInt(360);
			t1.penDown();
			t1.forward(t1Forward);
			t1.right(t1Turn);
			int t1x = t1.getX();
			int t1y = t1.getY();
			
			int t2Forward = 1 + rand.nextInt(10);
			int t2Turn = -179 + rand.nextInt(360);
			t2.penDown();
			t2.forward(t2Forward);
			t2.right(t2Turn);
			int t2x = t2.getX();
			int t2y = t2.getY();
			
			distance = Math.hypot(t1x - t2x, t1y - t2y);
			
			SimpleWindow.delay(10);
			
			
			
			
		}
			
	}

}
