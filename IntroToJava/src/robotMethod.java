import org.jointheleague.graphical.robot.Robot;

public class robotMethod
{
	Robot Bob;
	int Sides;
	int Length;

	public static void main(String[] args)
	{
		robotMethod RM = new robotMethod();
	}

	void BobSquare(Robot r)
	{
		for (int i = 0; i < 4; i++)
		{
			r.penDown();
			r.setSpeed(10);
			r.move(100);
			r.turn(90);

		}
	}

	void BobTriangle(Robot r)
	{
		for (int i = 0; i < 3; i++)
		{
			r.penDown();
			r.setSpeed(10);
			r.move(100);
			r.turn(120);
		}
	}

	void BobShape(Robot r, int Sides, int Length)
	{
		for (int i = 0; i < Sides; i++)
		{
			r.penDown();
			r.setSpeed(10);
			r.move(Length);
			r.turn(-360 / Sides);
		}
	}

	robotMethod()
	{
		Robot Steve = new Robot(200, 200);
		Robot Bob = new Robot();
		BobSquare(Bob);
		BobTriangle(Steve);
		BobShape(Bob, 30, 10);
	}
}
