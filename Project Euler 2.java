class FibEvenSeries{
	public static void main(String[] args){
		int sum=0;
		for(int a=0,b=1,c=a+b;c<4000000;c=a+b){
			if(c%2==0){
				sum=sum+c;
			}
			a=b;
			b=c;
			
		}
		System.out.println(sum);
	}
}