import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CheapCalculator {
	JFrame window;
	JPanel panel;
	JTextField num1;
	JTextField num2;
	JButton button;
	int x;
	int y;
	public static void main(String[] args) {
		CheapCalculator CC = new CheapCalculator();
	}
	public CheapCalculator() {
		num1 = new JTextField(10);
		num2 = new JTextField(10);
		button = new JButton("equals");
		panel = new JPanel();
		window = new JFrame("Calculator");
		panel.add(num1);
		panel.add(num2);
		panel.add(button);
		window.add(panel);
		
		window.setVisible(true);
		window.setSize(500, 600);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			String num11 = num1.getText();
			String num22 = num2.getText();
			int x = Integer.parseInt(num11);
			int y = Integer.parseInt(num22);
			System.out.println(x+y);
		}
	}
}
