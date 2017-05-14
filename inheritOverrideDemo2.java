//Use of overriding method in classes
class figure{
	double dim1;
	double dim2;
	figure(double a,double b){
		dim1=a;
		dim2=b;
	}
	double area(){
		System.out.print("Area for figure is undefined:");
		return 0;
	}
}
class rectangle extends figure{
	rectangle(double l, double b){
		super(l,b);
	}
	double area(){
		System.out.print("Area of rectangle:");
		return dim1*dim2;
	}
}
class triangle extends figure{
	triangle(double b,double h){
		super(b,h);
	}
	double area(){
		System.out.print("Area of triangle:");
		return dim1*dim2/2;
	}
}
public class inheritOverrideDemo2 {
	public static void main(String args[]){
		figure f = new figure(10,10);
		rectangle r = new rectangle(9,5);
		triangle t = new triangle(10,8);
		System.out.println(f.area());
		System.out.println(r.area());
		System.out.println(t.area());
	}
}
