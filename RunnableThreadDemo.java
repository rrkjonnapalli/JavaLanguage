class runnableThread implements Runnable{
	Thread t;
	runnableThread(){
		t = new Thread(this,"Demo Thread");
		System.out.println("Child Thread:"+t);;
		t.start();
	}
	public void run(){
		try{
			for(int i=5;i>=0;i--){
				System.out.println("Child Thread:"+i);
				Thread.sleep(10);
			}
		}catch(InterruptedException e){
			System.out.println("Child interruption");
		}
		System.out.println("Exiting Child Thread");
	}
}
public class RunnableThreadDemo {
	public static void main(String args[]){
		System.out.println("Main Thread:"+Thread.currentThread());
		new runnableThread();
		try{
			for(int i=5;i>=0;i--){
				System.out.println("Main Thread"+i);
				Thread.sleep(10);
			}
		}catch(InterruptedException e){
			System.out.println("Main interruption");
		}
		System.out.println("Exiting Main Thread");
	}
}
