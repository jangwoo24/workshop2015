import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JFrame window;
	JPanel panel;
	JButton trick;
	JButton treat;

	public static void main(String[] args) {
		NastySuprise NS = new NastySuprise();
	}

	NastySuprise() {
		window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		trick = new JButton();
		trick.setText("Treat");
		trick.addActionListener(this);
		panel.add(trick);
		treat = new JButton();
		treat.setText("Trick");
		treat.addActionListener(this);
		panel.add(treat);
		window.add(panel);
		window.setSize(600, 600);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == treat) {
			showPictureFromTheInternet(
					"http://ak-hdl.buzzfed.com/static/2015-04/21/16/enhanced/webdr05/enhanced-31550-1429646952-7.jpg");
		}
		if (e.getSource() == trick) {
			showPictureFromTheInternet("http://www.pxleyes.com/blog/wp-content/uploads/clowns/5.jpg");
		}
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
