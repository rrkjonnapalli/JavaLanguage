//print numbers
class rec{
	int values[];
	rec(int n){
		values=new int[n];
	}
	
	void printArray(int n){
		if(n>0){
			printArray(n-1);
			System.out.printf("[%d] %d\n",n-1,values[n-1]);
		}
	}
	
}
class recurDemo2 {
	public static void main(String args[]){
		rec obj = new rec(10);
		for(int i=0;i<10;i++)
			obj.values[i]=i;
		obj.printArray(10);
	}
}
