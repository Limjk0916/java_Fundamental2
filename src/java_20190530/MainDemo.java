package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		// 1. Customer c ���� Customer�� Reference Type, c�� Refernce
		// 3. new Customer�� Object
		/*Customer c = new Customer();
		c.name = "�����";
		c.cphone = "010-2231-5346";
		//static �����̱� ������ ��� ���� ����
		Customer.interestRate = 4.3;
		// Customer.BANKNAME ="��������";
		
		c.register();
		
		Customer c2 =new Customer();
		c2.name = "��ȣ��";
		c2.cphone = "101-01010-0010";
		Customer.interestRate = 4.5;
		
		c2.register();
		
		//c3 reference��  c2 reference�� ����Ű�� Object�� �����϶�� �ǹ�
		Customer c3 = c2;
		c2.name = "������";
		c2.cphone = "101-01010-0550";
		
		c3.register();
		c2.register();
		
		//reference �϶�
		//c1==c2 -> false, �ٸ� object ����
		//c2==c3 -> true, ���� object ����
*/
		Member m = new Member();
		m.setName("Lim");
		m.setCphone("101-020202-20202");
		m.setAdress("seoul");
		m.setZipcode("46780");
		
		System.out.println(m.getName());
		System.out.println(m.getAdress());
		System.out.println(m.getCphone());
		System.out.println(m.getZipcode());
		
		}

}
