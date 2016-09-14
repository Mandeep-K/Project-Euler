import java.util.*;
class smallestNum{
	public static void main(String[] args){
		long l=2520l;
		boolean flag=true;
		while(flag==true){
			search:
			for(int j=11;j<=20;j++){
				long a=l%j;
				while(a!=0){
					l=l+20;
					break search;
				}
				if(j==20){
					flag=false;
				}
			}
		}
		System.out.println(l);
	}
}