public class NestedTryMethodDemo {
	static void one(int a){
		try{
			if(a==1) a=a/(a-a);
			if(a==2){
				int c[] = {1};
				c[45]=99;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("It's Out of Bound Baby!!!");
		}
	}
	public static void main(String args[]){
		try{
			int a=args.length;
			int b = 42/a;
			one(a);
			System.out.println("Hi Babe B is:"+b);
		}catch(ArithmeticException e){
			System.out.println("It Division by 0***");
		}
	}
}