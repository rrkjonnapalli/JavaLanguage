enum days{
	sun,mon,tue,wed,thu,fri,sat;
}
public class enumDemo4 {
	public static void main(String args[]){
		days d1,d2,d3;
		//ordinal
		for(days d:days.values())
			System.out.println(d+":"+d.ordinal()+"\t");
		
		d1=days.sun;
		d2=days.wed;
		d3=days.sun;
		
		//Compare to
		System.out.println("d1 compare d2:"+d1.compareTo(d2));
		System.out.println("d1 compare d3:"+d1.compareTo(d3));
		
		//Equals
		
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
	}
}
