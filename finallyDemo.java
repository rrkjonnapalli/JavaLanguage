public class finallyDemo {
	static void finalA(){
		try{
			System.out.println("Inside A");
			throw new RuntimeException("demo");
		}finally{
			System.out.println("A's final");
		}
	}
	static void finalB(){
		try{
			System.out.println("Inside B");
			return;
		}finally{
			System.out.println("B's final");
		}
	}
	static void finalC(){
		try{
			System.out.println("Inside C");
		}finally{
			System.out.println("C's final");
		}
	}
	public static void main(String args[]){
		try{
			finalA();
		}catch(Exception e){
			System.out.println("Exception by A");
		}
//		finalA();
		finalB();
		finalC();
	}
}