
public class SuperSubCatchDemo {
	public static void main(String args[]){
		int a=0;
		try{
			int b=43/a;
			System.out.println(b);
		}catch(Exception e){
			System.out.println("It is Error");
		}//catch(ArithmeticException e){
//			System.out.println("It is an arithmetic error");	// It cannot be reached because
//		}														// arithmetic is subclass of errors
	}
}
