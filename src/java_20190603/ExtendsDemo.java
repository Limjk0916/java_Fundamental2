package java_20190603;

public class ExtendsDemo {
	
	public static void main(String[] args) {
		
		
		Customer c = new Customer();
		c.name = "�����";
		c.cphone = "010-2231-5346";
		System.out.println("�̸� : "+c.name);
		System.out.println("�ڵ��� : "+c.cphone);
		c.actionCustomer();
		
		Alba a = new Alba();
		a.name = "�˹ٻ�";
		a.cphone = "010-56565-5665";
		a.address = "����";
		System.out.println("�̸� : "+a.name);
		System.out.println("�ڵ��� : "+a.cphone);
		System.out.println("�ּ� : "+a.address);
		a.actionAlba();
		a.actionCustomer();

		
		//��� ���迡 �ִ� type�� �ٲ� �� �ִ�. (�θ� Ŭ������) ex) Manager -> Alba
		Manager m = new Manager();
		m.name = "�Ŵ���";
		m.cphone = "010-8989-898";
		m.address = "��⵵";
		m.id = "slslsle";
		m.password = "123123";
		System.out.println("�̸� : "+m.name);
		System.out.println("�ڵ��� : "+m.cphone);
		System.out.println("�ּ� : "+m.address);
		System.out.println("���̵� : "+m.id);
		System.out.println("��й�ȣ : "+m.password);
		m.actionCustomer();
		m.actionManager();
		m.actionAlba();
		
		//Super Ÿ��(Alba)���� Sub�� ��ü(new manager)�� ������ �� �ִ�.
		//��� ������ Super Ÿ��(Alba)�� ������ ���� Ŭ����(Customer) ���� ����.
		//�Ӽ��� Alba a = new Alba();�� ����.
		//actionManager�� �ҷ��� �� ����. ��ü�� alba�̱� ������
		Alba alba = new Manager();
		alba.name = "�Ŵ���";
		alba.cphone = "010-8989-898";
		alba.address = "��⵵";
		//alba.id = "slslsle";
		//alba.password = "123123";
		System.out.println("�̸� : "+m.name);
		System.out.println("�ڵ��� : "+m.cphone);
		System.out.println("�ּ� : "+m.address);
		System.out.println("���̵� : "+m.id);
		System.out.println("��й�ȣ : "+m.password);
		alba.actionAlba();
		alba.actionCustomer();
		
		
		
	}

}
