import java.util.*;
public class Q1_Avgof3num {
    public static double Average(int num1,int num2, int num3){

        double avg= (double) (num1+num2+num3)/3;
        
        return avg;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        System.out.println(Average(a, b, c));
        
    }
}
