package java_20190604;

public class Rectangle extends Shape{
	@Override
	//부모의 기능을 그대로 쓰면서, 자신의 기능을 추가하는 것
	public void draw() {
		
		System.out.println("Rectangle - draw()");

	}

}
