
public class passArrayDemo {
	static void printArray(int a[]){
		System.out.print("No of args:"+a.length+" Contents:");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
	}
	
	public static void main(String args[]){
		int n1[] = {1,2,3,4};
		int n2[] = {3,2};
		int n3[] = {};
		printArray(n1);
		printArray(n2);
		printArray(n3);
		
	}
}
