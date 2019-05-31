package java_20190531;


public class Constructor {
	private String name;
	private String email;
	private int age;
	
	//����Ʈ ������ : Ŭ�������� �����ڰ� ���� ��� compiler�� �ڵ����� �������ش�.
	//Ŭ���� ���� �����ڰ� 1����� �ִ� ���� compiler�� ���������� �ʴ´�.
	//�����ڴ� Ŭ���� �̸��� ����, ��ȯ���� ���� ���¸� ������ �ִ�.
	public Constructor(){
		
	}
	
	
	public Constructor(String name, String email){
		// �Ű����� 3��¥�� ������ ȣ��
		this(name, email,0);
		//this.name =name;
		//this.email = email;
	}
	//�Ű� ���� 3���� ������
	//�޼ҵ��� overloadingó�� �����ڵ� overloading�� ������
	
	
	
	public Constructor (String name, String email, int age) {
		//this�� ���ú����� instance������ �����ϱ� ���� �����
		this.name = name;
		this.email = email;
		this.age = age;
	}
		
	public static void main(String[] args) {
		//c = new Constructor();
		//c. name = "�����"
		//c. email = "slslsle@naver.com"
		//c. age = "10"
		//�� ������ �ؿ� ���ٷ� ������ �� ����
		//�� �̻� �������� �ʴ� ��ü�� "Garbage collector"
	
		Constructor c = new Constructor("�����", "slslsle@naver.com",10);
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);
		}
	
		
	}


