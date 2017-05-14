class cBox{
	double width;
	double height;
	double depth;
	cBox(){
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	double volume(){
		return width*height*depth;
	}
}
class constructorDemo {
	public static void main(String args[]){
		cBox myBox = new cBox();
		cBox myBox1 = new cBox();
		double vol = myBox.volume();
		System.out.println(vol);
		System.out.println(myBox1.volume());
	}

}
