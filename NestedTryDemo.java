
public class NestedTryDemo {
	public static void main(String args[]){
		try{
			int a=args.length;
			int b=42/a;
			System.out.println("A is:"+a+" B is:"+b);
			try{
				if(a==1)	a=a/(a-a);
				else{
					int c[]={1};
					c[43]=5;
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array Out of Bound by rrk");
			}
		}catch(ArithmeticException e){
			System.out.println("Division by 0 by rrk");
		}
	}
}
