import org.jointheleague.graphical.robot.Robot;

public class Face
{
	public static void main(String[] args)
	{
		Face F = new Face();
	}

	Face()
	{
		Robot Dave = new Robot();
		face(Dave);
		eye1(Dave);
		eye2(Dave);
		mouth(Dave);
	}

	void face(Robot r)
	{
		r.moveTo(15, 15);
		r.setPenWidth(10);
		r.penDown();
		for (int i = 0; i < 4; i++)
		{
			r.turn(90);
			r.move(700);
		}
	}

	void eye1(Robot r)
	{

	}

	void eye2(Robot r)
	{

	}

	void mouth(Robot r)
	{

	}

}
