
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class YouDied extends MouseAdapter {
	JFrame window;
	JPanel panel;
	int count;

	public static void main(String[] args) {
		YouDied yd = new YouDied();
	}

	YouDied() {
		window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		panel = new JPanel();
		panel.addMouseListener(this);
		window.add(panel);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		count++;
		if (new Random().nextInt(10) == 5) {
			JOptionPane.showMessageDialog(null, "You died! Your score is:" + count);
			count = 0;
		}

	}
}
