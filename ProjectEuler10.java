package employee;

import java.awt.List;
import java.util.ArrayList;


public class ProjectEuler10 {
    /*public static void main(String args[]){
        System.out.println(sumPrime2());
    }*/
  public static void main(String[] args)
    {
        long sum=2;
        for(long n=3;n<2000000;n+=2){
            if(isPrime(n)){
                sum+=n;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(long l){
        if(l<=1)
            return false;
        if(l==2||l==3)
            return true;
        if(l%2==0|| l%3==0)
            return false;
        else{
            for(long n=3; n<=Math.sqrt(l);n+=2){
                if(l%n==0){
                    return false;
                 }
             }
             return true;
        }
        }
}
/*
public static long sumPrime2() {
    ArrayList<Long> primes = new ArrayList<>();
    primes.add(2L);
    primes.add(3L);
    long primeSum = 5;

    for (long primeCandidate = 5; primeCandidate < 2000000; primeCandidate = primeCandidate + 2) {
        boolean isCandidatePrime = true;
        double sqrt = Math.sqrt(primeCandidate);
        for (int i = 0; i < primes.size(); i++) {
            Long prime = primes.get(i);
            if (primeCandidate % prime == 0) {
                isCandidatePrime = false;
                break;
            }
            if (prime > sqrt) {
                break;
            }
        }
        if (isCandidatePrime) {
            primes.add(primeCandidate);
            primeSum += primeCandidate;
        }
        //System.out.println(primeCandidate);
    }
    //System.out.println(primes.size());
    return primeSum;
}*/
