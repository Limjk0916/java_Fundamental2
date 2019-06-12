package java_20190610_re;

import java.util.ArrayList;

public class Alba extends Parent{
	String address;
	ArrayList<Alba> list = new ArrayList<Alba>();
	
	public Alba(String name, String cphon, String address) {
		super();
		this.name = name;
		this.cphone = cphon;
		this.address = address;
	}
	
	public void insert(){
		list.add(new Alba(name, cphone, address));
	}
	
	public void delete(int i){
		list.remove(i);
		
	}

	

}
