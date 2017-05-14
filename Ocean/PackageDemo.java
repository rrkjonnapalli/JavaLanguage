package Ocean;

public class PackageDemo {
	public static void main(String args[]){
		Protection2 obj = new Protection2();
		System.out.println("This result is from:"+obj.getClass());
		OtherPackage obj2 = new OtherPackage();
		System.out.println("This result is from:"+obj2.getClass());
	}
}
