class HBox{
	private double width;
	private double height;
	private double depth;
	HBox(HBox obj){
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}
	HBox(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	HBox(){
		width = height = depth = -1;
	}
	HBox(double len){
		width = height = depth = len;
	}
	double volume(){
		return width*height*depth;
	}
}
class HBoxWeight extends HBox{
	double weight;
	HBoxWeight(HBoxWeight obj){
		super(obj);
		weight = obj.weight;
	}
	HBoxWeight(HBox obj,double m){
		super(obj);
		weight = m;
	}
	HBoxWeight(double w,double h,double d,double m){
		super(w,h,d);
		weight = m;
	}
	HBoxWeight(){
		super();
		weight = -1;
	}
	HBoxWeight(double len,double weight){
		super(len);
		this.weight=weight;
	}
}
class ShipmentHBox extends HBoxWeight{
	double cost;
	ShipmentHBox(ShipmentHBox obj){
		super(obj);
		cost = obj.cost;
	}
	ShipmentHBox(double w,double h,double d,double m,double c){
		super(w,h,d,m);
		cost = c;
	}
	ShipmentHBox(){
		super();
		cost = -1;
	}
	ShipmentHBox(double len,double m,double c){
		super(len,m);
		cost = c;
	}
}
public class MultiLevelDemo {
	public static void main(String args[]){
		ShipmentHBox obj1 = new ShipmentHBox(10,20,15,10,3.41);
		ShipmentHBox obj2 = new ShipmentHBox(2,3,4,0.76,1.28);
		System.out.println("Volume of obj1 is:"+obj1.volume());
		System.out.println("Weight of obj1 is:"+obj1.weight);
		System.out.println("Cost of obj1 is:$"+obj1.cost);
		System.out.println();
		System.out.println("Volume of obj2 is:"+obj2.volume());
		System.out.println("Weight of obj2 is:"+obj2.weight);
		System.out.println("Cost of obj2 is:$"+obj2.cost);
	}
}
