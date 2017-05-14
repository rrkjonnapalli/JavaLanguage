import java.io.*;
class TwoDimArrayDemo2 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int a[][]=new int[n][];
		
		int k=0;
		for(int i=0;i<n;i++){
			
			/*
			int c = Integer.parseInt(br.readLine());
			a[i] = new int[c];		//Different size for each
			*/
			
			/*
			a[i] = new int[i+1];
			for(int j=0;j<=i;j++)
			a[i][j]=k++;
			*/
			
			
			a[i]=new int[i*i+1];
			for(int j=0;j<i*i+1;j++)
				a[i][j]=k++;
			
		}
		
		/*
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}
		*/
		
		for(int x[]:a){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
