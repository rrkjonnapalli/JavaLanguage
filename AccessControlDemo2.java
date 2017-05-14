//Stack implementation
class acstack{
	private int stack[] = new int[10];
	private int top;
	
	acstack(){
		top=-1;
	}
	
	void push(int item){
		if(top==stack.length-1){	//Using stack.lenght as cmp operand
			System.out.println("Stack Overflow!!!");
			return;
		}
		stack[++top]=item;
	}
	
	int pop(){
		if(top<0){
			System.out.println("Stack Underflow!!!");
			return 0;
		}
		return stack[top--];
	}
}
class AccessControlDemo2 {
	public static void main(String args[]){
		acstack obj = new acstack();
		acstack obj1 = new acstack();
		for(int i=0;i<10;i++)
			obj.push(i);
		for(int i=10;i<20;i++)
			obj1.push(i);
		
		
		for(int i=0;i<11;i++)
			System.out.print(obj.pop());
		System.out.println();
		for(int i=0;i<11;i++)
			System.out.print(obj1.pop());
	}
}
