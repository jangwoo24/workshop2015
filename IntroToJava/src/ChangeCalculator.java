// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String x = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
double nickels = Double.parseDouble(x);
		// Ask the user how many dimes they have, and convert their answer
String y = JOptionPane.showInputDialog("How many dimes do you have?");
double dimes = Double.parseDouble(y);
		// Ask the user how many quarters they have, and convert their answer
String z = JOptionPane.showInputDialog("How many quarters do you have?");
double quarters = Double.parseDouble(z);
double money = nickels/20 + dimes/10 + quarters/4;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have $" + money);
if(money >= 5) {
	JOptionPane.showMessageDialog(null, "Congrats, you have enough for a sandwhich. Now get it yourself.");
}
else {
	JOptionPane.showMessageDialog(null, "Who do you think you are, trying to get a sandqhich for just $" + money + "0?!! Now stop being lazy and make a sandwhich.");
}
	}
}
