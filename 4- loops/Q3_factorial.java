import java.util.*;
public class Q3_factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        
        int f=1;


            for(int i=num;i>0;i--){
                f=f*i;
            }
        
        System.out.println(f);
    }
}
