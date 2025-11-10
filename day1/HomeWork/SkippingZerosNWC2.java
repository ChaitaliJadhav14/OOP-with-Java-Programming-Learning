class SkippingZerosNWCC {
    public static void main(String[] args) {
        int number = 1007;
        int temp = number;

        while(temp > 0) {
            int digit = temp % 10; 
            if(digit != 0) {
                System.out.print(digit);
            }
            temp = temp / 10; 
        }
    }
}
