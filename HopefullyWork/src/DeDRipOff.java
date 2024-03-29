import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeDRipOff implements ActionListener {
	JFrame window;
	JPanel panel;
	JTextField CR;
	JTextField T;
	JTextField Mod;
	JButton four;
	JButton six;
	JButton eight;
	JButton ten;
	JButton twelve;
	JButton twenty;
	JButton clear;
	int x;
	int y;
	int z;
	Random w;
	String zz;

	public static void main(String[] args) {
		new DeDRipOff();
	}

	DeDRipOff() {
		w = new Random();
		window = new JFrame("Dungeons and Dragons Ripoff");
		window.setVisible(true);
		panel = new JPanel();

		CR = new JTextField(6);
		CR.setText("roll: " + x);
		T = new JTextField(17);
		T.setText("total: " + y);
		Mod = new JTextField(5);
		Mod.setText("0");
		four = new JButton("4");
		four.addActionListener(this);
		six = new JButton("6");
		six.addActionListener(this);
		eight = new JButton("8");
		eight.addActionListener(this);
		ten = new JButton("10");
		ten.addActionListener(this);
		twelve = new JButton("12");
		twelve.addActionListener(this);
		twenty = new JButton("20");
		twenty.addActionListener(this);
		clear = new JButton("clear");
		clear.addActionListener(this);
		panel.add(four);
		panel.add(six);
		panel.add(eight);
		panel.add(ten);
		panel.add(twelve);
		panel.add(twenty);
		panel.add(clear);
		panel.add(CR);
		panel.add(T);
		panel.add(Mod);

		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == four) {
			zz = Mod.getText();
			z = Integer.parseInt(zz);
			x = w.nextInt(4) + 1;
			y = y + x + z;
			CR.setText("Roll: " + x);
			T.setText("Total: " + y);
		} else if (e.getSource() == six) {
			zz = Mod.getText();
			z = Integer.parseInt(zz);
			x = w.nextInt(6) + 1;
			y = y + x + z;
			CR.setText("Roll: " + x);
			T.setText("Total: " + y);
		} else if (e.getSource() == eight) {
			zz = Mod.getText();
			z = Integer.parseInt(zz);
			x = w.nextInt(8) + 1;
			y = y + x + z;
			CR.setText("Roll: " + x);
			T.setText("Total: " + y);
		} else if (e.getSource() == ten) {
			zz = Mod.getText();
			z = Integer.parseInt(zz);
			x = w.nextInt(10) + 1;
			y = y + x + z;
			CR.setText("Roll: " + x);
			T.setText("Total: " + y);
		} else if (e.getSource() == twelve) {
			zz = Mod.getText();
			z = Integer.parseInt(zz);
			x = w.nextInt(12) + 1;
			y = y + x + z;
			CR.setText("Roll: " + x);
			T.setText("Total: " + y);
		} else if (e.getSource() == twenty) {
			zz = Mod.getText();
			z = Integer.parseInt(zz);
			x = w.nextInt(20) + 1;
			y = y + x + z;
			CR.setText("Roll: " + x);
			T.setText("Total: " + y);
		} else if (e.getSource() == clear) {
			zz = Mod.getText();
			z = Integer.parseInt(zz);
			x = 0;
			y = 0;
			CR.setText("Roll: " + x);
			T.setText("Total: " + y);
		}
	}
}
