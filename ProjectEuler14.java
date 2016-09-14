package employee;

public class ProjectEuler14 {

    public static void main(String[] args) {
        long seqLength=0;
        long startingNum=0;
        long sequence=0;
        long n=0;
        for(long i=1; i<1000000; i++){
            sequence=i;
            int length=0;
            startingNum=i;
            while(sequence!=1){
                if(sequence%2==0){
                    sequence/=2;
                }else{
                sequence=3*sequence+1;
                }
                length++;
            }
            if(length>seqLength){
                seqLength=length;
                n=i;
            }
            
        }
        System.out.println(n+" have "+seqLength);
    }
    public void ex(){
                long number = 1000000;
        long seqLength = 0;
        long startingNum = 0;
       
        //  long length=0;

        for (int i = 13; i <= number; i++) {
            int length = 1;
            startingNum = i;
             long sequence = i;
            while (sequence != 1) {
                if (sequence % 2 == 0) {
                    sequence = sequence / 2;
                } else {
                    sequence = 3 * sequence + 1;
                }
                length++;
            }
            
            if (length > seqLength) {
                seqLength = length;
                startingNum = i;
            }
        }
        
        System.out.println(startingNum + " produces longest chain, having " + seqLength + " terms.");

    }
}
