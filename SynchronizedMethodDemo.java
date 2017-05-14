class Callme{
	void call(String msg){
	//synchronized void call(String msg){	//Here i'm creating a synchronized shared method
		System.out.print("[" + msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Call me interrupted");
		}
		System.out.println("]");
	}
}
class Caller implements Runnable{
	String msg;
	Callme target;
	Thread t;
	public Caller(Callme targ,String s){
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
//		System.out.println(t);
	}
	public void run(){
		target.call(msg);
		/*
		 * Here i'm creating synchronized target;
		 *
		synchronized(target){
			target.call(msg);
		}
		/
		*/
	}
}
public class SynchronizedMethodDemo {
	public static void main(String args[]){
		Callme target = new Callme();
		Caller obj1 = new Caller(target,"Hello");
		Caller obj2 = new Caller(target,"Synchronized");
		Caller obj3 = new Caller(target,"World");
		
		try{
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exited normally");
	}
}