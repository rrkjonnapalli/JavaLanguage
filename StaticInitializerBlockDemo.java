import java.util.Scanner;
class StaticInitializerBlockDemo {
	static Scanner sc = new Scanner(System.in);
	static int B=sc.nextInt(),H=sc.nextInt(),area;
	static boolean flag=true;
	static{
	    try{
	       if(B<=0 || H<=0)
	            throw new Exception("Breadth and height must be positive");
	    }catch(Exception e){
	        flag=false;
	        System.out.println(e);
	    }
	}
	public static void main(String args[]){
		area=B*H;
		if(flag)
		System.out.println(area);
	}
}
