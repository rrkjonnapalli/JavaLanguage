
class forEachDemo2 {
	public static void main(String args[]){
		int nums[]={1,2,3,4,5,6};
		System.out.println("First loop:");
		for(int i:nums){
			System.out.print(i+" ");
			i=i*10;
		}
		System.out.println("\nSecond loop:");
		for(int i:nums){
			System.out.print(i+" ");
		}
	}

}
