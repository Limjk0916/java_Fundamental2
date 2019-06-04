package java_20190604;

public abstract class Shape {
	String name;
	double degree;
	
	//추상클래스에서 추상메소드는 무조건 자식이 상속 받아야한다.
	//추상메소드에는 {}가 없다.
	public abstract void draw();
	
	
	public void drawline(){
		System.out.println("Shape - drawline()");
	}

}
