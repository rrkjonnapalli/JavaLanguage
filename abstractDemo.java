//Use of abstract-it is not real object. it structure for original obj.
abstract class Afigure{
	double dim1,dim2;
	Afigure(double a,double b){
		dim1=a;
		dim2=b;
	}
	abstract double area();
	double showArea(){
		System.out.println("It is in abstract method");
		return 0;
	}
}
class Arectangle extends Afigure{
	Arectangle(double l,double b){
		super(l,b);
	}
	double area(){
		return dim1*dim2;
	}
	double perimeter(){
		return 2*dim1+2*dim2;
	}
}
class Atriangle extends Afigure{
	Atriangle(double b,double h){
		super(b,h);
	}
	double area(){
		return dim1*dim2/2;
	}
}
public class abstractDemo {
	public static void main(String args[]){
//		Afigure f = new Afigure(10,4);		// cannot create obj type of Afigure because it abstract
		Arectangle r = new Arectangle(10,8);
		Atriangle t = new Atriangle(4,6);
//		System.out.println("Equals:"+t.equals(r));		//equals method
		Afigure f;
		f=r;
		System.out.println("Area of rectangle is:"+f.area());
//		System.out.println("Perimeter of rectangle is:"+f.perimeter());	// perimeter is not method in Afigure class 
		System.out.println("Perimeter of rectangle is:"+r.perimeter());
		f=t;
		System.out.println("Area of triangle is:"+f.area());
	}
}