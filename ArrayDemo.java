//A program to calculate frequent numbers in a numbers
import java.io.*;
class ArrayDemo {
	public static void main(String args[]) throws IOException{
		int frequentNumbers[] = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i;
		for(;n>0;n/=10)
			frequentNumbers[n%10]++;
		System.out.println("My Frequent Numbers are:");
		for(i=0;i<10;i++)
			System.out.print(i);
		System.out.println();
		for(i=0;i<10;i++)
			System.out.print(frequentNumbers[i]);
		
		System.out.println();
		//Array length function every array has this func
		System.out.println("Length of Array is:"+frequentNumbers.length);
	}
}
