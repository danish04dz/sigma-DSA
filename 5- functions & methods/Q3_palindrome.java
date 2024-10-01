import java.util.*;
public class Q3_palindrome {
    public static boolean isPalindrome(int num){
        boolean isPalindrome=false;

        int my_num=num;
        int reverse=0;
        while(num>0){
            int LD=num%10;
            reverse=(reverse*10)+LD;
            num=num/10;

        }
        if(my_num==reverse){
            isPalindrome=true;

        }


        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(isPalindrome(n)){
            System.out.println("Number "+ n +" is Palindrome");
        }
        else{
            System.out.println("Number "+ n +" is Not a Palindrome");
        }

    }
    
}
