
public class ThreadDemo {
	public static void main(String args[]){
		Thread t = Thread.currentThread();
		System.out.println("Thread is:"+t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setName("RRK");
		System.out.println("Thread is:"+t);
		try{
			for(int n=5;n>=0;n--){
				System.out.println(n);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
