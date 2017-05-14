public class ThrowsDemo {
	static void demo() throws IllegalAccessException{
		System.out.println("Inside Demo Method throwing exception");
		throw new IllegalAccessException("demo");
	}
	public static void main(String args[]){
		try{
			demo();
		}catch(IllegalAccessException e){
			System.out.println("Caught in main:"+e);
		}
	}
}
