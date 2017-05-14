class ExceptionDemo {
	public static void main(String args[]){
		try{
			int d,a;
			d=0;
			a=42/d;
			System.out.println("rrk A is:"+a);	//This will not be printed.
		}catch(ArithmeticException e){
			System.out.println("Division by zero "+e);
		}
		System.out.println("This Exception example");
	}
}