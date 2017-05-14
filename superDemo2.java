class superA{
	int i;
}
class superB extends superA{
	int i;
	superB(int a,int b){
		super.i = a;
		i=b;
	}
	void show(){
		System.out.println("i in super class:"+super.i);
		System.out.println("i in sub class:"+i);
	}
}
public class superDemo2 {
	public static void main(String args[]){
		superB obj = new superB(5,4);
		obj.show();
	}
}
