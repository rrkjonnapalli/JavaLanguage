class useStatic{
	static int a=42;
	static int b=99;
	static void callme(){
		System.out.println("a :"+a);
	}
}

public class staticDemo2 {
	public static void main(String args[]){
		/*
		useStatic obj = new useStatic();
		obj.callme();
		*/
		useStatic.callme();
		System.out.println("b :"+useStatic.b);
	}
}
