class tBox{
	double width,height,depth;
	
	//Use of this
	tBox(double width,double height,double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	double volume(){
		return width*height*depth;
	}
}
class thisDemo {
	public static void main(String args[]){
		tBox myBox = new tBox(6,3,1);
		System.out.println(myBox.volume());
	}
}