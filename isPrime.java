import java.io.*;
class isPrime {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		boolean isPrime=true;
		if(n%2==0 || n==1)
			isPrime=false;
		for(int i=3;i*i<=n;i+=2)
			if(n%i==0){
				isPrime=false;
				break;
			}
		if(isPrime)
			System.out.println(n+" is Prime");
		else
			System.out.println(n+" is not Prime");
	}

}
