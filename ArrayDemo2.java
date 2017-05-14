
public class ArrayDemo2 {
	public static void main(String args[]){
		int a[] = new int[10];
		int b[] = new int[53];
		int c[];
		for(int i=0;i<10;i++)
			a[i]=i;
		for(int i=0;i<b.length;i++)
			b[i]=i;
		
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		
		for(int x:b)
			System.out.print(x+" ");
		
		c=a;
		System.out.println("\n\n"+c.length);
		
		a=b;
		System.out.println(a.length);
		
		System.out.println();
		for(int x:a)
			System.out.print(x+" ");
	}
}
