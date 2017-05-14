
public class passVarlenDemo {
	static void printObj(int ...v){
		System.out.print("Number of args:"+v.length+" Contents:");
		for(int x:v)
			System.out.print(x);
		System.out.println();
	}
	public static void main(String args[]){
		printObj(4,2,5);
		printObj(5,1);
		printObj(4);
		printObj();
	}
}
