package java_20190604;

public class OverrdingDemo {
	public static void main(String[] args) {
		//Shape shape = new Shape();
		
		Triangle t = new Triangle();
		t.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
		
		
		Shape s = new Triangle();
		//Triangle(�ڽ�) draw �޼ҵ尡 ȣ�� �ȴ�.
		s.name = "�ﰢ��";
		s.degree = 60;
		s.drawline();
		s.draw();//Shape�� draw�� �ƴ� Triangle�� draw�� ȣ��ȴ�.
		//s.dot = "";
		//s.angleDegree = 180;
		//s.drawCoordinate();
	}

}
