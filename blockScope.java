
class blockScope {
	public static void main(String args[]){
		int x = 10;
		if(x==10){
			int y = 20;
			x+=y;
		}
//		System.out.println(y);	It gives Error because of block scope
		System.out.println(x);
	}
}
