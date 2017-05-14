class outer{
	int outerx = 100;
	class inner{
		int y=10;
		void display(){
			System.out.println("Outer x is:"+outerx);
		}
	}
	//System.out.println("Outer x is:"+outerx+"Inner y is:"+y);		
	//it is error coz y is not in scope
	
	void test(){
		inner obj = new inner();
		obj.display();
	}
}

public class NestedClassesDemo {
	public static void main(String args[]){
		outer obj = new outer();
		obj.test();
	}
}
