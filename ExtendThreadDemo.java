class extendThread extends Thread{
	extendThread(){
		super("Demo Thread");
		System.out.println("Child Thread:"+this);
		this.start();
	}
	public void run(){
		try{
			for(int i=5;i>=0;i--){
				System.out.println(this+"\t\t"+i);
				Thread.sleep(100);
			}
		}catch(InterruptedException e){
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Exiting Child Thread");
	}
}
public class ExtendThreadDemo {
	public static void main(String args[]){
		System.out.println("Main Thread:"+Thread.currentThread());
		new extendThread();
		try{
			for(int i=5;i>=0;i--){
				System.out.println(Thread.currentThread()+"\t\t\t"+i);
				Thread.sleep(100);
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting Main Thread");
	}
}
