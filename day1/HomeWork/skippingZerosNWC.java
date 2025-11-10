class skippingZerosNWC{
	public static void main(String[] args){
		int number=1007;
		String result = "";   // to store digits in correct order
		while(number>0){
			int digit= number%10;
			if(digit != 0)
				result = digit + result;       // add digit at start to maintain original order
			
			number = number/10;     // update before continue!			
		}
		System.out.println(result);	
		
	}
}

//17