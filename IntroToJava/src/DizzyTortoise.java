import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		
		 // 1. Use the dance method to make the Tortoise spin.
		 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
		 String numberOfSpins = JOptionPane.showInputDialog("How dizzy should the Tortoise be on a scale of 1-10?");
int Spins = Integer.parseInt(numberOfSpins);
	}

	static void dance(Spins) {
		for (int i = 0; i < Spins; i++) {
			Tortoise.turn(-360);
		}
	}
}

