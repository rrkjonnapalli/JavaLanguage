class staticDemo {
	static int a = 3;
	static int b;
	int c;
	
	static void meth(int x){
		System.out.println("x ="+x);
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		//System.out.println("c ="+c);	//gives error because it is not static
	}
	static{
		System.out.println("Static block is initialized!!");
		b=a*4;
	}

	public static void main(String args[]){
		meth(5);
	}
}
