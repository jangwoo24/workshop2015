import java.util.Random;

import javax.swing.JOptionPane;


public class SlotMachine
{
public static void main(String[] args)
{
	int var1 = new Random().nextInt(2);
	int var2 = new Random().nextInt(2);
	int var3 = new Random().nextInt(2);
	String Number = (var1+""+var2+""+var3);
	int ff = Integer.parseInt(Number);
	for (int i = 0; i < 1; i++)
	{
		String input = JOptionPane.showInputDialog("Guess three numbers, each between 0 and 1, with no commas or spaces between them");
		int x = Integer.parseInt(input);
		if (x == ff)
		{
			JOptionPane.showMessageDialog(null, "You win! See Jung Woo Seo for your $100 prize.");
		} else
		{
			JOptionPane.showMessageDialog(null, "You lose!");
		}
	}
}
}
