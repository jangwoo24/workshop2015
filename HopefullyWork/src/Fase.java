import org.jointheleague.graphical.robot.Robot;

public class Fase {
	public static void main(String[] args) {
		Fase F = new Fase();
	}

	Fase() {
		Robot r = new Robot();
		r.setSpeed(10);
		eye1(r);
		eye2(r);
		nose(r);
		moostach(r);
	}

	private void eye1(Robot r) {
		r.moveTo(200, 200);
		r.penDown();
		for (int i = 0; i < 360; i++) {
			r.move(2);
			r.turn(1);
		}
		r.penUp();
	}

	private void eye2(Robot r) {
		r.moveTo(430, 200);
		r.penDown();
		for (int i = 0; i < 360; i++) {
			r.move(2);
			r.turn(1);
		}
		r.penUp();
	}

	private void nose(Robot r) {
		r.moveTo(430, 230);
		r.penDown();
		r.turn(150);
		for (int i = 0; i < 3; i++) {
			r.move(200);
			r.turn(120);
		}
		r.penUp();
	}

	private void moostach(Robot r) {
		r.moveTo(370, 409);
		r.turn(30);
		r.penDown();
		r.setPenWidth(10);
		for (int i = 0; i < 6; i++) {
			r.move(100);
			r.turn(-90);
			r.move(10);
			r.turn(-90);
			r.move(100);
			r.turn(90);
			r.move(10);
			r.turn(90);
		}
		r.move(100);
		r.penUp();
		r.moveTo(100000, 0);
	}
}
