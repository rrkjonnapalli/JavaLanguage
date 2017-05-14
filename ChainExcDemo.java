
public class ChainExcDemo {
	static void excA(){
		NullPointerException e = new NullPointerException("excA");
		e.initCause(new ArithmeticException("Cause"));
		throw e;
	}
	public static void main(String args[]){
		try{
			excA();
		}catch(NullPointerException e){
			System.out.println("Caught in main: "+e);
			System.out.println("Original Cause: "+e.getCause());
		}
	}
}
