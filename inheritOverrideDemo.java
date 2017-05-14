class a{
	int i,j;
	a(int a,int b){
		i=a;
		j=b;
	}
	void show(){
		System.out.println("I is:"+i+" J is:"+j);
	}
}
class b extends a{
	int k;
	b(int a,int b,int c){
		super(a,b);
		k=c;
	}
/*	
	void show(){			
		super.show();		// Using the method in class a i.e. It calls a class
		System.out.println("K is:"+k);
	}
*/	
	void show(String msg){		//overwriting the method in class a
		System.out.println("K is:"+k);
	}
}
public class inheritOverrideDemo {
	public static void main(String args[]){
		b obj = new b(4,3,5);
// if defined in b		obj.show();			// It shows only b class
		obj.show();
		obj.show("\b ");
	}
}
