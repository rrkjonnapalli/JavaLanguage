import java.io.*;
class InputDemo {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Accept Employee Details
		System.out.print("Enter ID:");
		int id = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Name:");
		String name = br.readLine();
		
		System.out.print("Enter Gender:");
		char gender = br.readLine().charAt(0);
		
		System.out.println("Enter Age:");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
	}
}
