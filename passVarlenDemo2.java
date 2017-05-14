
public class passVarlenDemo2 {
	static void printObj(String msg,int ...v){		//1st method
		System.out.print(msg + " Contens:");
		for(int x:v)
			System.out.print(x+" ");
		System.out.println();
	}
	static void printObj(int ...v){					//2nd method
		for(int x:v)
			System.out.print(x+" ");
		System.out.println();
	}
	static void printObj(boolean ...v){				//3rd method
		for(boolean x:v)
			System.out.print(x+" ");
		System.out.println();
	}
	public static void main(String args[]){
		printObj("Three Arguments",5,2,7);			//1st method
		printObj("1 Argument",7);					//1st method
		printObj("No Arguments");					//1st method
		printObj(1);								//2nd method
		printObj(true,false,true,true);				//3rd method
		
//		printObj();		//It gives error because it doesn't know what method to take.
	}
}
