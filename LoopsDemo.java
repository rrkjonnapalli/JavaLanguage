import java.util.Scanner;
public class LoopsDemo {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int s[][] = new int[q][];
		for(int k=0;k<q;k++){
			int a,b,n;
			a=sc.nextInt();
			b=sc.nextInt();
			n=sc.nextInt();
			s[k]=new int[n];
			for(int i=0;i<n;i++){
				int res = a;
				for(int j=0;j<=i;j++)
					res+=(Math.pow(2, j)*b);
				s[k][i]=res;
			}
		}
		for(int x[]:s){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
