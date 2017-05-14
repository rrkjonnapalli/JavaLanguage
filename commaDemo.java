class commaDemo {
	public static void main(String args[]){
		int a,b;
		for(a=1,b=4;a<b;a++,b--){
			System.out.println("Inside loop");
			System.out.println("A is:"+a);
			System.out.println("B is:"+b);
		}
		System.out.println("Outside loop");
		System.out.println("A is:"+a);
		System.out.println("B is:"+b);
	}

}
