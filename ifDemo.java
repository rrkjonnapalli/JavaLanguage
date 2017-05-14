import java.io.*;
class ifDemo {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}
}
