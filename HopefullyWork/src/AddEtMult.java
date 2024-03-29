import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddEtMult implements ActionListener {
	JFrame window;
	JPanel panel;
	JButton add;
	JButton mult;
	JTextField num1;
	JTextField num2;

	public static void main(String[] args) {
		AddEtMult AEM = new AddEtMult();
	}

	AddEtMult() {
		window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);

		num1 = new JTextField();
		num1.setBounds(50, 50, 100, 40);
		panel.add(num1);

		num2 = new JTextField();
		num2.setBounds(200, 50, 100, 40);
		panel.add(num2);

		add = new JButton("add");
		add.setBounds(50, 100, 100, 40);
		add.addActionListener(this);
		panel.add(add);

		mult = new JButton("mult");
		mult.setBounds(200, 100, 100, 40);
		mult.addActionListener(this);
		panel.add(mult);

		window.add(panel);
		window.setSize(400, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			String x = num1.getText();
			int xx = Integer.parseInt(x);
			String y = num2.getText();
			int yy = Integer.parseInt(y);
			JOptionPane.showMessageDialog(null, xx + yy);
		} else if (e.getSource() == mult) {
			String x = num1.getText();
			int xx = Integer.parseInt(x);
			String y = num2.getText();
			int yy = Integer.parseInt(y);
			JOptionPane.showMessageDialog(null, xx * yy);
		}
	}
}
