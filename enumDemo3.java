enum month{
	jan(31),feb(28),mar(31),apr(30),may(31),jun(30),jul(30),aug(31),sep(30),oct(31),nov(30),dec(31);
	private int value;
	month(int val){
		value=val;
	}
	int getValue(){
		return value;
	}
}
enum newMonth{
	jan(31),feb(29),mar(31),apr,may(31),jun,jul,aug(31),sep,oct(31),nov,dec(31);
	private int value;
	newMonth(int val){
		value=val;
	}
	newMonth(){
		value=30;
	}
	int getValue(){
		return value;
	}
}
public class enumDemo3 {
	public static void main(String args[]){
		month mon = month.dec;
		System.out.print("I'm Showing no of days in december:"+mon.getValue());
		System.out.println("\nBy Month");
		for(month m:month.values())
			System.out.print(m+":"+m.getValue()+"\t");
		System.out.println("\nBy New Month");
		for(newMonth m:newMonth.values())
			System.out.print(m+":"+m.getValue()+"\t");
	}
}
