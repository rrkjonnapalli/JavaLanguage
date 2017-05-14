class outer1{
	int x;
	
	void test(){
		for(int i=0;i<10;i++){
			
			x=i;
			
			class inner{
				
				void display(){
					System.out.println("outer x is:"+x);
				}
				
			}
			
			inner obj = new inner();
			obj.display();
		}
	}
	
}
public class NestedClassDemo2 {
	public static void main(String args[]){
		outer1 obj = new outer1();
		obj.test();
	}
}
