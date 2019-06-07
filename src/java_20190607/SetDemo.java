package java_20190607;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class SetDemo {
	public static void main(String[] args) {
		
		//�ڵ� import : ctrl +shift+ o
		//Hashset�������� �ߺ��� ������� �ʰ�, ���� ����.
		//HashSet set1 = new HashSet();
		
		//Treeset�� �������� �ߺ��� ������� �ʰ�, natural ordering(�������� ����)
		//TreeSet<String> set1 = new TreeSet<String>();
		
		//LinkedHashSet�� �������� �ߺ��� ������� �ʰ�, �Է��� ������� ���
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		
		
		
		
		
		//������ �߰�
		for(int i=0;i<20;i++){
			//ValueOf(int i) �޼ҵ�� int i�� ���ڿ��� ��ȯ
			set1.add(String.valueOf(i));
		}	
		
		//HashSet ũ��
		System.out.println(set1.size());
		
		//������ ���
		Iterator<String> iterator = set1.iterator();
		while(iterator.hasNext()){
			String temp = iterator.next();
					System.out.println(temp);
			
		}
		
		Customer c1 = new Customer("ȫ�浿", 10);
		Customer c2 = new Customer("ȫ�浿", 10);
		Customer c3 = new Customer("ȫ�浿", 10);
		Customer c4 = new Customer("ȫ�浿", 10);
		
		//HashSet�� ���� �������� �ߺ� ���� ��
		HashSet<Customer> set2 = new HashSet<Customer>();
		set2.add(c1);
		set2.add(c2);
		set2.add(c3);
		set2.add(c4);
		
		System.out.println(set2.size());
		
		
		//��� �����
		//set1.clear();
		
		HashSet<Integer> set3 = new HashSet<Integer>();
	
		while(true){
			int random = (int)(Math.random()*45) + 1;
			set3.add(random);
			if(set3.size()==6) break;
		}
		System.out.println(set3.size());
		
		Iterator<Integer> i = set3.iterator();
		while(i.hasNext()){
			Integer temp = i.next();
			System.out.print(temp);
		}
		
		
		
		
		
		
		
	}

}
class Customer{
	private String name;
	private int age;
	public Customer(String name, int age){
		this.name = name;
		this.age = age;
		
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
