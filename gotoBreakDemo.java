
class gotoBreakDemo {
	public static void main(String args[]){
		boolean flag=true;
		l1:{
			l2:{
					System.out.println("in l2");
				l3:{
					System.out.println("in l3");
					break l3;
				}
					System.out.println("After l3");
					break l2;
			}
			flag=false;
			break l1;
		}
		System.out.println(flag);
	}

}
