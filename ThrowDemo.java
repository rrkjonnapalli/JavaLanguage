public class ThrowDemo {
	static void demo(){
		try{
			throw new NullPointerException("ptr");
		}catch(NullPointerException e){
			System.out.println("Caught by demo catch");
			throw e;
		}
	}
	public static void main(String args[]){
		try{
			demo();
		}catch(NullPointerException e){
			System.out.println("Recaught in main :"+e);
		}
	}
}