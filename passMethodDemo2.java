class mBox{
	int width,height,depth;
	
	mBox(mBox c){
		width = c.width;
		height = c.height;
		depth = c.depth;
	}
	
	mBox(int w,int d,int h){
		width = w;
		height =h;
		depth = d;
	}
	
	mBox(){
		width=height=depth=-1;
	}
	
	mBox(int len){
		width = height = depth = len;
	}
	
	double volume(){
		return width*height*depth;
	}
}
class passMethodDemo2 {
	public static void main(String argrs[]){
		mBox obj = new mBox(6);
		System.out.println(obj.volume());
		
		obj.height = 5;
		
		System.out.println(obj.volume());
		
		mBox obj1 = new mBox(obj);
		System.out.println(obj1.volume());
		obj.height=6;
		System.out.println(obj.volume());
		System.out.println(obj1.volume());
	}
}
