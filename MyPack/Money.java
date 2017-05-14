package MyPack;

public class Money {
	String name;
	double bal;
//	Money(String n,double b){			//It is not visible if there is no public	
	public Money(String n,double b){
		name = n;
		bal = b;
	}
	public void show(){
		if(bal<0)
			System.out.print("----->");
		System.out.println(name + " $"+bal);
	}
}