enum cn{
	tom,jer,krish,scooby,dooby,doo,richie,rich,gwen,ben,kevin,humangosour,diamondhead
}
public class enumDemo2 {
	public static void main(String args[]){
		cn allEps[] = cn.values();
		for(cn eachep:allEps)
			System.out.println(eachep);
		
		cn ep = cn.valueOf("diamondhead");
		System.out.println("Hey it's me babe:::::"+ep);
	}
}
