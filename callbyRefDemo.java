class Test2{
	int a,b;
	
	Test2(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	void meth(){
		int temp=a;
		a=b;
		b=temp;
	}
}
class callbyRefDemo {
	public static void main(String args[]){
		Test2 obj = new Test2(60,80);
		
		System.out.println("A is :"+obj.a+" B is: "+obj.b);
		obj.meth();
		System.out.println("A is :"+obj.a+" B is: "+obj.b);
	}
}