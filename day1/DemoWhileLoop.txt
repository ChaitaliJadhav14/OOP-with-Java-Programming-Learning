class DemoWhileLoop{
	public static void main(String[] args){
		int number;
		number=97;
		int i =2;
		boolean isPrime = true;
		while(i<number){
			if(number % i == 0){
				isPrime = false;
				break;
			}
			i++;
		}
		if(isPrime)
			System.out.println("Prime");
		else
			System.out.println("NOT Prime");
	}

}