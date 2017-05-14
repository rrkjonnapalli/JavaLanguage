class Box3{
	double width;
	double height;
	double depth;
	int c;
	void meth(){
		System.out.println(c);
	}
	double volume(){
		return width*height*depth;
	}
	
	//method over loading
	void setDim(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	
	void setDim(double w,double h){
		width = w;
		height = h;
	}
	
	void setDim(double w){
		width = w;
	}
	void setDim(){
		width = 0;
		height = 0;
		depth = 0;
	}
}
class classDemo4 {
	public static void main(String args[]){
		Box3 myBox = new Box3();
		myBox.setDim(5);
		System.out.println(myBox.volume());
	}
}
