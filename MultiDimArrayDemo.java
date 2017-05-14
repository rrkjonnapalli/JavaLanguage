import java.io.*;
class MultiDimArrayDemo {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int a[][] = new int[r][c];
		
		int k=0;
		
		for(int i=0;i<r;i++)
		for(int j=0;j<c;j++)
			a[i][j]=k++;
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}
	}

}
