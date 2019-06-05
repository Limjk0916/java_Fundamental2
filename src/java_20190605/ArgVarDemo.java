package java_20190605;

public class ArgVarDemo {
	
	public int sum(int... temp){
		int sum = 0;
		
		/*for(int i=0;i<temp.length;i++){
			sum += temp[i];
		}
*/		
		
		for(int value : temp){
			sum += value;
		}
		
		
		
		return sum;
	}
	public static void main(String[] args) {
		ArgVarDemo d = new ArgVarDemo();
		
		//Integer만 받아줄 수 있음.
		
		int a = d.sum(1);
		System.out.println(a);
		
		int b = d.sum(1,2);
		System.out.println(b);
		
		int c = d.sum(10,20,30);
		System.out.println(c);
		
		int m = d.sum(10,20,30,40);
		System.out.println(m);
		
	}

}
