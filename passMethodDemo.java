class test{
	int a,b;
	test(int i,int j){
		a=i;
		b=j;
	}
	
	boolean equals( test king){
		if(king.a == a && king.b == b)
			return true;
		return false;
	}
	
}

class passMethodDemo {
	public static void main(String args[]){
		test obj1 = new test(4,5);
		test obj2 = new test(6,7);
		test obj3 = new test(6,7);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj2.equals(obj3));
	}
}