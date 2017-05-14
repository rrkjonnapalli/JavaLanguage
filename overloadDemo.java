class overLoad{
	void test(){
		System.out.println("No parameters!!!");
	}
	void test(int a){
		System.out.println(a);
	}
	void test(int a,int b){
		System.out.println("sum is"+a+b);
	}
	double test(double a){
		return a*a;
	}
	
}
class overloadDemo {
	public static void main(String args[]){
		overLoad obj = new overLoad();
		obj.test();
		
		obj.test(5);
		
		obj.test(5.0);
		
		obj.test(4,5);
		System.out.println(obj.test(1.732));
	}
}
