
/**
 *
 * @author Mei Rusfandi
 */
public class EvenFibonacciNumber {
    public static void main(String []args){
        long fibo[]=new long[55];
        long sum=0;
        fibo[0]=1;
        fibo[1]=2;
        for (int i=2;i<=35;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        for (int i=0;i<=50;i++){
            if ((fibo[i] % 2==0) && (fibo[i]<=4000000))
            {
                sum = sum+fibo[i];
            }
        }
        System.out.println("\n Sum of even term number fibbo until 4000000 is "+sum);
    }
    
}
