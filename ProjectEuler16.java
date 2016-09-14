

package employee;

import java.math.BigInteger;
import sun.security.util.BigInt;


public class ProjectEuler16 {
    public static void main(String[] args){
        String s= BigInteger.valueOf(2).pow(1000).toString();
        int result=0;
        for(char a : s.toCharArray()){
            result+=Character.getNumericValue(a);
        }
        System.out.println(result);
    }
}
