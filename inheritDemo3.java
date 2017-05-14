class inBox{
	double width,height,depth;
	inBox(inBox obj){
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}
	inBox(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	inBox(){
		width = height = depth = -1;
	}
	inBox(double len){
		width = height = depth = len;
	}
	double volume(){
		return width*height*depth;
	}
}
class BoxMass extends inBox{
	double mass;
	BoxMass(double w,double h,double d,double m){
		width = w;
		height = h;
		depth = d;
		mass = m;
	}
}
class color extends inBox{
	int color;
	color(double w,double h,double d,int c){
		super(w,h,d);
		color = c;
	}
}
public class inheritDemo3 {
	public static void main(String args[]){
		BoxMass obj1 = new BoxMass(3,4,6,1);
		inBox obj2 = new inBox();
		color obj3 = new color(4,2,5,7);
		System.out.println(obj1.volume());
		obj2 = obj1;
		System.out.println(obj2.volume());
		System.out.println(obj1.mass);
		System.out.println(obj3.color);
//		System.out.println(obj2.mass);	//It is error because obj2 is inBox obj and it not contains mass
	}
}
