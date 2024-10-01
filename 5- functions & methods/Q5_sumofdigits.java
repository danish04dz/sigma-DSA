import java.util.*;
public class Q5_sumofdigits {

    public static int SumOfDigits(int num){
        int sum=0;

        while(num>0){
            int LD=num%10;
            sum=sum+LD;
            num=num/10;

        }

        return sum;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println("Sum of the digits of "+n+ " is " +SumOfDigits(n));
    }
    
}
