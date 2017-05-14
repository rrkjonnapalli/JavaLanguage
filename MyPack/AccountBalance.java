package MyPack;
class Balance{
	String name;
	double bal;
	Balance(String name, double b){
		this.name = name;
		bal = b;
	}
	void show(){
		if(bal<0)
			System.out.print("--->");
		System.out.println(name + ": $"+bal);
	}
}
public class AccountBalance{
	public static void main(String args[]){
		Balance current[] = new Balance[3];
		current[0] = new Balance("Jonnapalli Bhanukiran",200);
		current[1] = new Balance("Jonnapalli Krishnaveni",5000);
		current[2] = new Balance("Jonnapalli Eswararao",100000);
		for(int i=0;i<3;i++)	current[i].show();
	}
}