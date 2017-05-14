public class MultiExcCatchDemo {
	public static void main(String args[]){
		int a=5,b=0;
		int val[] = {1,2,3};
		try{
			System.out.println(a/b);
			val[9]=8;
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("Exception caught by multi-exception "+e);
		}
		System.out.println("Exiting Normally");
	}
}
