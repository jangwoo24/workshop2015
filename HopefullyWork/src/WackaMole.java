import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WackaMole implements ActionListener {
	JFrame window;
	JPanel panel;
	int count;
	int miss;

	public static void main(String[] args) {
		WackaMole wm = new WackaMole();
	}

	WackaMole() {

		drawButtons(new Random().nextInt(24));
	}

	void drawButtons(int x) {

		window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1400, 400);

		panel = new JPanel();

		for (int i = 0; i < 24; i++) {
			JButton b = new JButton();
			b.addActionListener(this);
			if (i == x) {
				b.setText("mole!");
			}
			panel.add(b);
		}

		window.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton j = (JButton) e.getSource();
		if (j.getText().equals("mole!")) {
			count++;
			System.out.println(count);
			window.dispose();
			miss = 0;
			playSound("Slap-SoundMaster13-49669815.wav");
			if (count < 10) {
				drawButtons(new Random().nextInt(24));
			} else {
				endGame(Calendar.getInstance().getTime(), 10);
				System.exit(0);
			}
		} else {
			miss++;
			if (miss == 1) {
				speak("dork");
			} else if (miss == 2) {
				speak("idiot");
			} else if (miss == 3) {
				speak("moron");
			} else if (miss >= 4) {
				speak("kill yourself");
			}
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
