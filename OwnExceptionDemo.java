@SuppressWarnings("serial")
class MyException extends Exception{
	
	private int detail;
	MyException(int a){
		detail = a;
	}
	public String toString(){
		return "My Exception [ "+detail+" ].";
	}
}
public class OwnExceptionDemo {
	static void compute(int a) throws MyException{
		System.out.println("For A="+a);
		if(a>10)
			throw new MyException(a);
		System.out.println("Exited Normally");
	}
	public static void main(String args[]){
		try{
			compute(1);
			compute(10);
			compute(20);
		}catch(MyException e){
			System.out.println("Caught "+e);
		}
	}
}
