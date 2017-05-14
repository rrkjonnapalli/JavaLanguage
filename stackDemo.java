class stack{
	int stck[] = new int[10];
	int tos;
	stack(){
		tos=-1;
	}
	void push(int item){
		if(tos==9)
			System.out.println("Stack Over flow");
		else
			stck[++tos]=item;
	}
	int pop(){
		if(tos==-1){
			System.out.print("Stack Under flow");
			return 0;
		}
		else
			return stck[tos--];
	}
}

class stackDemo {
	public static void main(String args[]){
		stack myStack = new stack();
		stack myStack2 = new stack();
		
		for(int i=0;i<11;i++){
			myStack.push(i);
			System.out.println("King "+i);
		}
		
		for(int i=11;i<21;i++)
			myStack2.push(i);
		
		for(int i=0;i<11;i++)
			System.out.print(myStack.pop()+"\t");
		
		System.out.println();
		
		for(int i=0;i<10;i++)
			System.out.print(myStack2.pop()+"\t");
		
	}
}
