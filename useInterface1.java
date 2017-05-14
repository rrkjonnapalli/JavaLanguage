
interface Callback{
	void callback(int param);
}
class Client implements Callback{
	public void callback(int p){
		System.out.println("Client1 Callback is called with "+p);
	}
	void notRelated(){
		System.out.println("Implementing class can define other members too");
	}
}
class Client2 implements Callback{
	public void callback(int p){
		System.out.println("Client2 Callback square is:"+p*p);
	}
}
class useInterface1{
	public static void main(String args[]){
		Callback all;
		Callback obj = new Client();
		Client obj2 = new Client();
		Client2 obj3 = new Client2();
		obj.callback(5);
		System.out.println(obj.getClass());
//		obj.notRelated();		//It cannot access because it is interface variable.
		obj2.callback(6);
		obj2.notRelated();
		obj3.callback(7);
		all = obj3;
		all.callback(6);
	}
}