import java.util.Random;
public class randomDemo {
	public static void main(String args[]){
		Random rand = new Random();
		for(int i=0;i<10;i++)
		System.out.print(rand.nextInt()%10 +" ");
	}
}