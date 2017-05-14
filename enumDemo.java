enum cartoonNetwork{
	tom,jerry,ben,gwen,kevin,krish;
}
public class enumDemo {
	public static void main(String args[]){
		cartoonNetwork ep;
		ep = cartoonNetwork.gwen;
		System.out.println(ep);
		
		if(ep==cartoonNetwork.gwen)
			System.out.println("Hey it is gwen");
		
		switch(ep){
		case tom: System.out.println("I'm a cat");	break;
		case ben: System.out.println("I'm hero");	break;
		case gwen: System.out.println("I'm beautiful");	break;
		default: System.out.println("Hey i'm not tom or ben or gwen");
		}
	}
}
