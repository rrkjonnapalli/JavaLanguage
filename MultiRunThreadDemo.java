class runThread implements Runnable{
	String name;
	Thread t;
	runThread(String threadName){
		name = threadName;
		t= new Thread(this,name);
		System.out.println("New Thread:"+t);
		t.start();
	}
	public void run(){
		try{
			for(int i=5;i>=0;i--){
				System.out.println(i +" "+ t);
				Thread.sleep(10);
			}
		}catch(InterruptedException e){
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Child Thread Exited");
	}
}
public class MultiRunThreadDemo {
	public static void main(String args[]){
		new runThread("One");
		new runThread("Two");
		new runThread("Three");
		try{
			Thread.sleep(10);
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exited");
//		System.exit(0);
	}
}
