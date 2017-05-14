package MyPack;

public class PackageDemo {
	public static void main(String args[]){
//		Protection obj1 = new Protection();
		Derived obj2 = new Derived();
		System.out.println("This result is from:"+obj2.getClass());
		SamePackage obj3 = new SamePackage();
		System.out.println("This result is from:"+obj3.getClass());
	}
}
