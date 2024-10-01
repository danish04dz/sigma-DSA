import java.util.*;
public class practice {

    public static void inverted_Hlf_pyramid(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=col;j>=1;j--){

                if(j>i){
                    System.out.print(" ");

                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }



    }


    public static void inverted_Hlf_pyramid_with_num(int row,int col){
        for(int i=row;i>=1;i--){
            for(int j=1;j<=col;j++){
                if(j<=i){
                    System.out.print(j);
                }            
            }
            System.out.println();
        }
    }




    public static void Floid_Varsal(int line){
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);


        int totalRow=sc.nextInt();
        int totalcol=sc.nextInt();
        // inverted_Hlf_pyramid(totalRow, totalcol);
        inverted_Hlf_pyramid_with_num(totalRow,totalcol);

     }

    
}
