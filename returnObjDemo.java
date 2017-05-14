
class otest{
	int a;
	otest(int i){
		a=i;
	}
	
	otest SquareTest(){
		
		otest temp = new otest(a*a);
		
		return temp;
	}
}

class returnObjDemo {
	public static void main(String args[]){
		otest obj = new otest(2);
		
		System.out.println(obj.a);
		
		obj = obj.SquareTest();
		
		System.out.println(obj.a);
	}
}
