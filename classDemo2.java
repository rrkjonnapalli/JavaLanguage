class Box1{
	double width;
	double height;
	double depth;
	//Defining void method here
	void volume(){
		System.out.print("Volume is::: ");
		System.out.println(width * height * depth);
	}
}
class classDemo2 {
	public static void main(String args[]){
		Box1 myBox1 = new Box1();
		myBox1.depth = 10;
		myBox1.height = 32;
		myBox1.width = 8;
		myBox1.volume();
		
		Box1 myBox2 = new Box1();
		myBox2.depth = 8;
		myBox2.height = 9;
		myBox2.width = 10;
		myBox2.volume();
	}
}
