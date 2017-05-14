class isAliveThread implements Runnable{
	String name;
	Thread t;
	isAliveThread(String threadName){
		name = threadName;
		t = new Thread(this,name);
		t.start();
	}
	public void run(){
		try{
			for(int i=5;i>=0;i--){
				System.out.println(t+" "+i);
				Thread.sleep(10);
			}
		}catch(InterruptedException e){
			System.out.println(t+" is Interrupted");
		}
		System.out.println(t +" Exited Normally");
	}
}
public class isAliveAndJoinDemo {
	public static void main(String args[]){
		isAliveThread obj1 = new isAliveThread("One");
		isAliveThread obj2 = new isAliveThread("Two");
		isAliveThread obj3 = new isAliveThread("Three");
		System.out.println(obj1.t + " is Alive:" + obj1.t.isAlive());
		System.out.println(obj2.t + " is Alive:" + obj2.t.isAlive());
		System.out.println(obj3.t + " is Alive:" + obj3.t.isAlive());
		try{
			System.out.println("Waiting for threads to finish");
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}catch(InterruptedException e){
			System.out.println("Main thread is interrupted");
		}
		System.out.println(obj1.t + " is Alive:" + obj1.t.isAlive());
		System.out.println(obj2.t + " is Alive:" + obj2.t.isAlive());
		System.out.println(obj3.t + " is Alive:" + obj3.t.isAlive());
		System.out.println("Main thread exited normally");
	}
}
