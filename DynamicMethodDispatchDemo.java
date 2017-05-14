class DMD1{
	void showme(){
		System.out.println("Inside DMD1 class");
	}
}
class DMD2 extends DMD1{
	void showme(){
		System.out.println("Inside DMD2 class");
	}
}
public class DynamicMethodDispatchDemo {
	public static void main(String args[]){
		DMD1 a = new DMD1();
		DMD2 b = new DMD2();
		DMD1 r;DMD2 s;
		r=a;
		r.showme();
		r=b;
		r.showme();
//		s=a;				//It cannot be done because super method obj cannot
//		s.showme();			//assigned to sub method obj
		s=b;
		s.showme();
	}
}