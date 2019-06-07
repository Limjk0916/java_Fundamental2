package java_20190607;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class SetDemo {
	public static void main(String[] args) {
		
		//자동 import : ctrl +shift+ o
		//Hashset데이터의 중복을 허용하지 않고, 순서 없음.
		//HashSet set1 = new HashSet();
		
		//Treeset은 데이터의 중복을 허용하지 않고, natural ordering(오름차순 정렬)
		//TreeSet<String> set1 = new TreeSet<String>();
		
		//LinkedHashSet은 데이터의 중복을 허용하지 않고, 입력한 순서대로 출력
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		
		
		
		
		
		//데이터 추가
		for(int i=0;i<20;i++){
			//ValueOf(int i) 메소드는 int i를 문자열로 변환
			set1.add(String.valueOf(i));
		}	
		
		//HashSet 크기
		System.out.println(set1.size());
		
		//데이터 출력
		Iterator<String> iterator = set1.iterator();
		while(iterator.hasNext()){
			String temp = iterator.next();
					System.out.println(temp);
			
		}
		
		Customer c1 = new Customer("홍길동", 10);
		Customer c2 = new Customer("홍길동", 10);
		Customer c3 = new Customer("홍길동", 10);
		Customer c4 = new Customer("홍길동", 10);
		
		//HashSet은 안의 내용으로 중복 내용 비교
		HashSet<Customer> set2 = new HashSet<Customer>();
		set2.add(c1);
		set2.add(c2);
		set2.add(c3);
		set2.add(c4);
		
		System.out.println(set2.size());
		
		
		//모두 지우기
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
