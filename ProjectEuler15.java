
package employee;

import java.math.BigInteger;

public class ProjectEuler15 {
    public static void main(String[] args){
        int n=40, r=20;
        System.out.println(factorial(n).divide(factorial(r).multiply(factorial(n-r))));
    }
    public static BigInteger factorial(int num){
        BigInteger n=BigInteger.ONE;
        for(int i=1; i<=num;i++){
            n=n.multiply(BigInteger.valueOf(i));
        }
        return n;
    }
}
