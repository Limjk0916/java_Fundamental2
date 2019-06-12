package java_20190611;

public class RunnableDemo implements Runnable{
	@Override
	//run 메소드는 꼭 오버라이드를  해야한다.
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " : "+i);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("**********start**********");
		RunnableDemo r1 = new RunnableDemo();
		//implements Runnable한 객체를 넣어주어야 한다. (implements Runnable 일때)
		//객체를 넣어주지 않으면 run 메소드를 호출해주지 않는다.
		Thread t1 = new Thread(r1, "첫번째 쓰레드");
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("첫번째 스레드 우선순위 : "+t1.getPriority());
		t1.start();
		
		
		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread(r2, "두번째 쓰레드");
		System.out.println("두번째 스레드 우선순위 : "+t2.getPriority());
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		System.out.println("**********end**********");
		
		
	}

}
