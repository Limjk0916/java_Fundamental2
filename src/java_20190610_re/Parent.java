package java_20190610_re;

public abstract class Parent {
	String name;
	String cphone;
	
	//부모의 기능이 아무것도 없기 때문에 abstract(추상)를 쓴다.
	//public void insert(){}; -> 이것도 가능
	public abstract void insert();
	public abstract void delete(int i);

}
