class skippingZeros1{
	public static void main(String[] args){
		int number=1007;
		String result = "";   // to store digits in correct order
		while(number>0){
			int digit= number%10;
			number = number/10;     // update before continue!
			if(digit==0)
				continue;
	
			result = digit + result;       // add digit at start to maintain original order
				
		}
		System.out.println(result);	
		
	}
}

//17