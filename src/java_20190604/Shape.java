package java_20190604;

public abstract class Shape {
	String name;
	double degree;
	
	//�߻�Ŭ�������� �߻�޼ҵ�� ������ �ڽ��� ��� �޾ƾ��Ѵ�.
	//�߻�޼ҵ忡�� {}�� ����.
	public abstract void draw();
	
	
	public void drawline(){
		System.out.println("Shape - drawline()");
	}

}
