//Factorial
class myFact{
	int fact(int n){
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
}

class recurDemo {
	
	static int fact(int n){
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	
	public static void main(String args[]){
		myFact obj = new myFact();
		System.out.println(fact(5));
		System.out.println(obj.fact(10));
	}
}