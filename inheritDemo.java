class inA{
	int i,j;
	void showij(){
		System.out.println("i is:"+i+" j is:"+j);
	}
}
class inB extends inA{
	int k;
	void showk(){
		System.out.println("k is:"+k);
	}
	void sum(){
		System.out.println("Sum of i,j,k is:"+(i+j+k));
	}
}
public class inheritDemo {
	public static void main(String args[]){
		inA obj1 = new inA();
		inB obj2 = new inB();
		obj2.sum();
		//Observe this i.e super set is not visible throw sub
		obj1.i=10;
		obj1.j=9;
		
		obj2.k=9;
		
		obj1.showij();
		obj2.showij();
		obj2.sum();
		
		//Observe this i.e we need set throw sub method
		obj2.i=5;
		obj2.j=6;
		
		obj2.k=9;
		
		obj1.showij();
		obj2.showij();
		obj2.sum();
		
	}
}
