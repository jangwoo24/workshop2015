import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoreStringFun implements ActionListener
{
	JFrame window;
	JPanel panel;
	JButton button;
	JTextField jtf1;
	JTextField jtf2;
	String input;
	StringBuilder inputSB;

	public static void main(String[] args)
	{
		MoreStringFun MSF = new MoreStringFun();
	}

	MoreStringFun()
	{
		jtf1 = new JTextField(10);
		jtf2 = new JTextField(10);
		panel = new JPanel();
		button = new JButton("Translate");
		panel.add(jtf1);
		panel.add(button);
		panel.add(jtf2);
		window = new JFrame("Test");
		window.setVisible(true);
		window.setSize(500, 500); // sets size of thing
		window.add(panel);
		button.addActionListener(this);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates the
																// program as
																// soon as a
																// window is
																// closed

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button)
		{
			input = jtf1.getText();
			inputSB = new StringBuilder(input);
			inputSB.setCharAt(0, 'x');
			jtf2.setText(inputSB.toString());
		}

	}
}