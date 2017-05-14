
public class MultiCatchDemo {
	public static void main(String args[]){
		try{
			int a=args.length;
			System.out.println("A length:"+a);
			int b=42/a;
			int c[]=new int[b];
			c[43]=3;
		}catch(ArithmeticException e){
			System.out.println("Divide by 0"+e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("RRK It is Array index out of bound:----->"+e);
		}
	}
}
