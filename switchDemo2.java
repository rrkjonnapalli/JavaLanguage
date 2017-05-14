
class switchDemo2 {
	public static void main(String args[]){
		for(int i=0;i<15;i++)
			switch(i){
			case 0:
			case 1:
			case 2:
			case 3:	System.out.print("Hey its 3\t");
			case 4:
			case 5: System.out.print("<=5\t");break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:System.out.print(">5 and <=10\t");break;
			default:System.out.print(">10\t");
			}
	}

}
