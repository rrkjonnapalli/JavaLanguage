//Nested interfaces
class interfaceA{
	public interface inA{
		boolean isNegative(int x);
	}
	class interfaceC implements inA{
		public boolean isNegative(int x){
			if(x*-1>=0)
				return true;
			return false;
		}
	}
}
class interfaceB implements interfaceA.inA{
	public boolean isNegative(int x){
		return x<0?true:false;
	}
}
public class InterfaceDemo {
	public static void main(String args[]){
		interfaceA.inA obj = new interfaceB();
//		interfaceA.inA obj2 = new interfaceC();
		if(obj.isNegative(8))
			System.out.println("8 is negative");
		else
			System.out.println("8 is positive");
		
	}
}
