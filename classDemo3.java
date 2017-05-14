class Box2{
	double width,height,depth;
	//Defining returning method
	double volume(){
		return width*height*depth;
	}
}
class classDemo3 {
	public static void main(String args[]){
		Box2 myBox1 = new Box2();
		myBox1.depth = 4;
		myBox1.height = 5;
		myBox1.width = 6;
		double val = myBox1.volume();
		System.out.println(val);
	}
}
