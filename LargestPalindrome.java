import java.util.*;
class LargestPalindrome{
	public static void main(String[] args){
		Set<Integer> palindromes=new HashSet<>();
		for(int i=100;i<1000;i++){
			for(int j=100;j<1000;j++){
				int product=i*j;
				if(isPalindrome(product)==true)
					palindromes.add(product);
			}			
		}
			
		ArrayList<Integer> al=new ArrayList<Integer>(palindromes);
		Collections.sort(al);
		System.out.println(al.get(al.size()-1));
	}
	public static boolean isPalindrome(int num){
	int temp=num;
		int reverse=0;
		while(num>0){
			
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		if(reverse==temp)
			return true;
		else
			return false;
	}
}