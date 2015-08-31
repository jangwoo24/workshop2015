import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIRobot
{
	JFrame window;
	JPanel panel;
	JButton button;
	JTextField sides;
	JTextField sidelength;
	JTextField pensize;
	JTextField pencolor;
	JTextField speed;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;

	public static void main(String[] args)
	{
		GUIRobot GR = new GUIRobot();
	}

	public GUIRobot()
	{
		window = new JFrame();
		window.setVisible(true);
		window.setResizable(true);
		panel = new JPanel();
		panel.setLayout(null);

		label1 = new JLabel("# sides");
		label1.setBounds(50, 50, 100, 30);
		sides = new JTextField("");
		sides.setBounds(200, 50, 100, 30);

		label2 = new JLabel("Side length");
		label2.setBounds(50, 100, 100, 30);
		sidelength = new JTextField("");
		sidelength.setBounds(200, 100, 100, 30);

		label3 = new JLabel("Pen width");
		label3.setBounds(50, 150, 100, 30);
		pensize = new JTextField("");
		pensize.setBounds(200, 150, 100, 30);

		label4 = new JLabel("Pen color");
		label4.setBounds(50, 200, 100, 30);
		pencolor = new JTextField("");
		pencolor.setBounds(200, 200, 100, 30);

		label5 = new JLabel("Speed");
		label5.setBounds(50, 250, 100, 30);
		speed = new JTextField("");
		speed.setBounds(200, 250, 100, 30);

		button = new JButton("Generate");
		button.setBounds(50, 300, 100, 30);

		panel.add(label1);
		panel.add(sides);

		panel.add(label2);
		panel.add(sidelength);

		panel.add(label3);
		panel.add(pensize);

		panel.add(label4);
		panel.add(pencolor);

		panel.add(label5);
		panel.add(speed);

		panel.add(button);

		window.add(panel);

		window.setSize(1024, 768);
	}
}
