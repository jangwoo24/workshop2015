import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener
{
	JFrame window;
	JPanel panel;
	JButton button1;
	JButton button2;

	public static void main(String[] args)
	{
		ChuckleClicker CC = new ChuckleClicker();
	}

	ChuckleClicker()
	{
		makeButtons();
	}

	private void makeButtons()
	{
		JFrame window = new JFrame();
		window.setVisible(true);

		JPanel panel = new JPanel();

		JButton button1 = new JButton("joke");
		button1.addActionListener(this);
		panel.add(button1);

		JButton button2 = new JButton("punchline");
		button2.addActionListener(this);
		panel.add(button2);

		window.add(panel);
		window.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null, "hi");
	}

}
