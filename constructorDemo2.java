class cBox1{
	double width;
	double height;
	double depth;
	
	//constructing box with parameters
	cBox1(double width,double height,double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	double volume(){
		return width*height*depth;
	}
}
class constructorDemo2 {
	public static void main(String args[]){
		
		//creating a box with parameters
		cBox1 myBox = new cBox1(4,2,6);
		System.out.println(myBox.volume());
	}
}
