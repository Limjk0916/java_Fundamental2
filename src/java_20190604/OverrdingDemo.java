package java_20190604;

public class OverrdingDemo {
	public static void main(String[] args) {
		//Shape shape = new Shape();
		
		Triangle t = new Triangle();
		t.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
		
		
		Shape s = new Triangle();
		//Triangle(자식) draw 메소드가 호출 된다.
		s.name = "삼각형";
		s.degree = 60;
		s.drawline();
		s.draw();//Shape의 draw가 아닌 Triangle의 draw가 호출된다.
		//s.dot = "";
		//s.angleDegree = 180;
		//s.drawCoordinate();
	}

}
