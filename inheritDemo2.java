class inA2{
	int i;
	private int j;
	void setij(int x,int y){
		i=x;
		j=y;
	}
	void showj(){
		System.out.println(j);
	}
	int givej(){
		return j;
	}
}
class inB2 extends inA2{
	int total;
	int k;
	void setK(int k){
		this.k = k;
	}
	void sum(){
//		total=i+j+k;		// it is error because j is not accessible here
		total = i+k+givej();
		System.out.println("I am printing i+j+k because j is not accessble:"+total);
	}
}
public class inheritDemo2 {
	public static void main(String args[]){
		inB2 obj = new inB2();
		obj.setij(5, 8);
		obj.showj();
		obj.setK(10);
		obj.sum();
	}
}
