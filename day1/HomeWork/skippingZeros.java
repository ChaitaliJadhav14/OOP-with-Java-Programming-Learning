class skippingZeros{
	public static void main(String[] args){
		int number;
		number = 1007;
		while(number>0){
			int digit= number%10;
			number = number/10;
			if(digit==0)
				continue;
	
			System.out.println(digit);
				
		}	
		
	}
}


//output
//7
//1