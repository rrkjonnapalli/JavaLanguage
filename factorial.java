import java.io.*;
public class factorial {
	static int fact(int b,int n){
		if(n==0)
			return b;
		else
			return fact(b*n,n-1);
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println("Factorial of "+n+":"+fact(1,n));
	}
}
