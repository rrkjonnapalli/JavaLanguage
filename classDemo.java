class Box{
	double width;
	double height;
	double depth;
/*
	public String toString(){
		//System.out.println("It is by rrk");
		return "rrk";
	}
*/
}

class classDemo {
	public static void main(String args[]){
		Box myBox = new Box();
		
		Box tempBox;
		tempBox=myBox;	//TempBox and myBox are same not different
		
		myBox.width = 1000;
		myBox.height = 20;
		myBox.depth = 899;
		
		double vol = myBox.width*myBox.height*myBox.depth;
		System.out.println(vol);
		
		tempBox.height = 199;
		System.out.println(myBox.width+" "+myBox.depth+" "+myBox.height);
		System.out.println(tempBox.width+" "+tempBox.depth+" "+tempBox.height);		
//		System.out.print(myBox);
	}
	
}