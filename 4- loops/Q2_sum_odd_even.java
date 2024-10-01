import java.util.*;

class Q2_sum_odd_even {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int odd=0;
        int even=0;

        int choice;

        do{
            int num=sc.nextInt();

            if((num%2)==0){
                even+=num;
            }
            else{
                odd+=num;
            }

            System.out.println("sellect 1to stop or 0 to continue");
            choice=sc.nextInt();

        }while(choice==0);

       

        

       

        System.out.println("Sum of even is: " + even);
        System.out.println("Sum of odd is: " + odd);


        
    }
}