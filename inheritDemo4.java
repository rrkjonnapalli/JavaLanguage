class inheritA{
	inheritA(){
		System.out.println("Inherit A Class");
	}
}
class inheritB extends inheritA{
	inheritB(){
		System.out.println("Inherit B Class");
	}
}
class inheritC extends inheritB{
	inheritC(){
		System.out.println("Inherit C Class");
	}
}
public class inheritDemo4 {
	public static void main(String args[]){
		inheritC obj = new inheritC();
		System.out.println("It is type of:"+obj.getClass());
	}
}
