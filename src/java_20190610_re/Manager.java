package java_20190610_re;

import java.util.ArrayList;

public class Manager extends Parent{	
	String address;
	String id;
	String password;
	ArrayList<Manager> list = new ArrayList<Manager>();
	
	public Manager(String name, String cphon, String address, String id, String password) {
		super();
		this.name = name;
		this.cphone = cphon;
		this.address = address;
		this.id = id;
		this.password = password;
	}
	
	public void insert(){
		list.add(new Manager(name, cphone, address, id, password));
	}
	
	public void delete(int i){
		list.remove(i);
		
	}

	

}
