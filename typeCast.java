
class typeCast {
	public static void main(String args[]){
		byte b;
		int i=128;
		double d = 323.142;
		
		System.out.println("\nConversion of int to byte:");
		b = (byte) i;	//byte range is -128 <-> 127
		System.out.println("i is :"+ i +" b is:"+b );
		
		System.out.println("\nConversion of double to int:");
		i = (int)d;
		System.out.println("d is :"+d+" i is:"+i);
		
		System.out.println("\nConversion of byte to double");
		d=(double)b;
		System.out.println("b is:" +b+" d is:"+d);
		
		System.out.println("\nConversion of double to byte");
		d=323.142;
		b=(byte)d;
		System.out.println("d is:"+d+" b is:"+b);
	}
}
