class prime10001{
	public static void main(String[] args){
		long count=0;
		long num=1;
		while(count<10002){
			if(isPrime(num))
				count++;
			if(count==10001){
				System.out.println(num);
				break;
			}
			num++;
		}
			
	}
	public static boolean isPrime(long num){
		if(num<=1)
			return false;
		else if(num==2|| num==3)
			return true;
		else if(num%2==0 || num%3==0)
			return false;
		else{
			for(int n=3; n<=Math.sqrt(num);n+=2){
				if(num%n==0)
					return false;
			}
			return true;
		}
	}
}