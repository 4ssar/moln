import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;

public class H44 {

		public static void main(String[] args) {
			SimpleWindow w = new SimpleWindow(600, 600, "Kvadrat");
			while (true) {
				w.waitForMouseClick();
				int x = w.getMouseX();
				int y = w.getMouseY();
				Turtle t = new Turtle(w, x, y);
			    t.penDown();
			    for (int k = 1; k <= 4; k++) {
			      t.right(90);
			      t.forward(300);
			    }
				
				
			}
		}

	}



