class superBox{
	private double width;
	private double height;
	private double depth;
	superBox(superBox obj){
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}
	superBox(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	superBox(){
		width = -1;
		height = -1;
		depth = -1;
	}
	superBox(double len){
		width = height = depth = len;
	}
	double volume(){
		return width*height*depth;
	}
	void showSuperBox(){
		System.out.print("Width:"+width+"\t");
		System.out.print("Height:"+height+"\t");
		System.out.print("Depth:"+depth+"\t");
	}
}
class superBoxMass extends superBox{
	double weight;
	superBoxMass(superBoxMass obj){
		super(obj);
		weight = obj.weight;
	}
	superBoxMass(double w,double h,double d,double m){
		super(w,h,d);
		weight = m;
	}
	superBoxMass(){
		super();
		weight = -1;
	}
	superBoxMass(double all){
		super(all);
		weight = all;
	}
	superBoxMass(double len,double m){
		super(len);
		weight = m;
	}
	superBoxMass(superBox obj,double m){
		super(obj);
		weight = m;
	}
	void showSuperBoxMass(){
		System.out.print("Weight:"+weight+"\t");
	}
}
public class superDemo {
	public static void main(String args[]){
		superBox obj1 = new superBox();
		superBoxMass obj2 = new superBoxMass(10,20,15,34.3);
		superBoxMass obj3 = new superBoxMass(2,3,4,0.076);
		superBoxMass obj4 = new superBoxMass();
		superBoxMass obj5 = new superBoxMass(3,2);
		superBoxMass obj6 = new superBoxMass(5);
		superBoxMass clone1 = new superBoxMass(obj2);
		superBoxMass clone2 = new superBoxMass(obj1,5);
		obj1.showSuperBox();
		System.out.println("Volume:"+obj1.volume());
		obj2.showSuperBox();
		obj2.showSuperBoxMass();
		System.out.println("Volume:"+obj2.volume());
		obj3.showSuperBox();
		obj3.showSuperBoxMass();
		System.out.println("Volume:"+obj3.volume());
		obj4.showSuperBox();
		obj4.showSuperBoxMass();
		System.out.println("Volume:"+obj4.volume());
		obj5.showSuperBox();
		obj5.showSuperBoxMass();
		System.out.println("Volume:"+obj5.volume());
		obj6.showSuperBox();
		obj6.showSuperBoxMass();
		System.out.println("Volume:"+obj6.volume());
		clone1.showSuperBox();
		clone1.showSuperBoxMass();
		System.out.println("Volume:"+clone1.volume());
		clone2.showSuperBox();
		clone2.showSuperBoxMass();
		System.out.println("Volume:"+clone2.volume());
	}
}
