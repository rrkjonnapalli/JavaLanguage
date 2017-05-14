import java.io.*;
class AverageN {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(br.readLine());
			sum+=a[i];
		}
		System.out.println(sum/n);
	}
}
