import javax.swing.JButton;
import javax.swing.JFrame;

public class PhotoBook
{
	JFrame window;
	ImagePanel IP;
	JButton button1;
	JButton button2;
	JButton button3;
	ImagePanel[] images = new ImagePanel[10];

	public static void main(String[] args)
	{
		PhotoBook PB = new PhotoBook();
	}

	PhotoBook()
	{
		images[0] = new ImagePanel("4570.jpg");
		images[1] = new ImagePanel("91.png");
		images[2] = new ImagePanel("hqdefault.jpg");
		images[3] = new ImagePanel("images-1.jpg");
		images[4] = new ImagePanel("images.jpg");
		images[5] = new ImagePanel("imgres-1.jpg");
		images[6] = new ImagePanel("imgres.jpg");
		images[7] = new ImagePanel("Random+button+well+that+s+cool+d_28b92a_3200114.png");
		images[8] = new ImagePanel("t6nzccykhzmr6tohcoel.jpg");
		images[9] = new ImagePanel("the-simpsons-bart-to-the-future-donald-trump-running-for-president-of-the-usa.jpg");
		window = new JFrame();
		IP = images[1];
		window.add(IP);
		window.setSize(1000, 1000);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("Next");
		button2 = new JButton("Prev");
		button3 = new JButton("Random");

		IP.add(button1);
		button1.setBounds(0, 0, 100, 50);

		IP.add(button2);
		button2.setBounds(0, 100, 100, 50);

		IP.add(button3);
		button3.setBounds(0, 200, 100, 50);

	}
}
