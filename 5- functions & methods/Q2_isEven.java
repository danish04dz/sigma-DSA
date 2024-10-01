import java.util.*;
public class Q2_isEven {
    public static boolean isEven(int num){
        boolean isEven=false;
        if(num%2==0){
            isEven=true;
        }

 
        return isEven;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        
        if (isEven(n)) {
            System.out.println("number is even");
            
        }
        else{
            System.out.println("Number is odd");
        }
    }

    
}