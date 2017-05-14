class Test1{
	void method(int a,int b){
		a*=2;
		b/=2;
		System.out.println("in method\nA is "+a+" B is "+b);
	}
}
class callbyValueDemo {
	public static void main(String args[]){
		Test1 obj = new Test1();
		
		int a=10,b=20;
		
		System.out.println("in main before calling method\nA is "+a+" B is "+b);
		
		obj.method(a, b);
		
		System.out.println("in main after calling method\nA is "+a+" B is "+b);
	}
}
