package Ocean;

public class Protection2 extends MyPack.Protection{
	Protection2(){			//It is not visible outside file
//	public Protection2(){
		System.out.println("Derived other package constructor");
//		System.out.println(n);		//Accessed by class or package only 
//		System.out.println(n_pri);	//Accessed by class only
		System.out.println(n_pro);
		System.out.println(n_pub);
		
	}
}
class OtherPackage{
	OtherPackage(){
		MyPack.Protection p = new MyPack.Protection();	//Here OtherPackage is not subclass
														//It is just an object
		System.out.println("Other Package Constructor");
//		System.out.println(p.n);		//	above reason
//		System.out.println(p.n_pri);	//	above reason
//		System.out.println(p.n_pro);	//	Accessed only by class,package,subclass only
		System.out.println(p.n_pub);
		
	}
}