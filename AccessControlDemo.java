class acTest{
	
	int a;
	public int b;
	private int c;
	
	void setc(int i){
		c=i;
	}
	int getc(){
		return c;
	}
}

class AccessControlDemo {
	public static void main(String args[]){
		acTest obj = new acTest();
		obj.a = 10;
		obj.b = 20;
//		obj.c = 100;		//It gives error because c is private variable
		obj.setc(100);
		System.out.println(obj.a);
		System.out.println(obj.b);
		//We cannot get c directly so we need to use its methods
		System.out.println(obj.getc());
	}
}
