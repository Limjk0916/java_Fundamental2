package java_20190610_re;

import java.util.ArrayList;

public class Customer extends Parent{
	ArrayList<Customer> list = new ArrayList<Customer>();
	public Customer(String name, String cphon) {
		super();
		this.name = name;
		this.cphone = cphon;
	}
	
	public void insert(){
		list.add(new Customer(name, cphone));
		
	}
	public void delete(int i){
		list.remove(i);
		
	}

}
