class coBox{
	double width,height,depth;
	
	coBox(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	coBox(double l){
		width=height=depth=l;
	}
	coBox(double w,double h){
		width = w;
		height = h;
		depth = 1;
	}
	coBox(){
		width = -1;
		height = -1;
		depth = -1;
	}
	double volume(){
		return width*height*depth;
	}
}
class overloadDemo2 {
	public static void main(String args[]){
		coBox obj = new coBox(2,8);
		System.out.println(obj.volume());
	}
}
