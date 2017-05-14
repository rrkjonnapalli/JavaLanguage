import java.io.*;
class switchDemo {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Integers:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		System.out.print("1.Add\t2.Sub\t3.Mul\t4.Div\t5.Mod\nChoose an Option:");
		int n=Integer.parseInt(br.readLine());
		
		switch(n){
		case 1:System.out.println(a+b);break;
		case 2:System.out.println(a-b);break;
		case 3:System.out.println(a*b);break;
		case 4:System.out.println(a/b);break;
		case 5:System.out.println(a%b);break;
		default: System.out.println("Wrong Option!!!\n");break;
		}
	}

}
