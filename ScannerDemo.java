import java.util.Scanner;
public class ScannerDemo {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Name:");
		String s = scan.nextLine();
		System.out.print("Enter Your age:");
		int n = scan.nextInt();
		System.out.print("Enter Your Salary:");
		double d = scan.nextDouble();
		
		System.out.println(s+n+d);
		scan.close();
	}
}
