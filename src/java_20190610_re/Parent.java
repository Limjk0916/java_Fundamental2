package java_20190610_re;

public abstract class Parent {
	String name;
	String cphone;
	
	//�θ��� ����� �ƹ��͵� ���� ������ abstract(�߻�)�� ����.
	//public void insert(){}; -> �̰͵� ����
	public abstract void insert();
	public abstract void delete(int i);

}
