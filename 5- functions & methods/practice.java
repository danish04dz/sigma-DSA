import java.util.*;
public class practice {



    public static void helloPrint(){
        System.out.println("Hello World !");
    }

    public static void CalculateSum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt(); 

        int sum=a+b;
        System.out.println(sum);
    }


    // calculate sum with parameter 

    public static void Sum(int num1,int num2) {
        int sum=num1+num2;
        System.out.println(sum);
        
    }

    // with return

    public static int SumofNum(int num1,int num2){

        int sum=num1+num2;

        return sum;

    }


    // product of two numbwr

    public static int product(int num1, int num2){
        int p=num1*num2;

        return p;
    }


    // factorial

    public static int Factorial(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        return f;
    }

    public static int BionomialCoff(int n, int r){

        int fofn=Factorial(n);
        int fofr=Factorial(r);
        int fofnmr= Factorial(n-r);


        int BC= fofn/(fofr*fofnmr);

        return BC;
    }

    // check prime numbeer

    public static boolean isPrime(int num){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isprime=false;
                break;

            }
        }
        return isprime;
    }


//check prime in range

public static void PrimeinRange(int start,int end){

    for(int i=start;i<=end;i++){
        if(isPrime(i)){
            System.out.print(i +" ");
        }
    }

    System.out.println();

}



// CONVERT BNARY TO dECIMAL

public static void BinToDec(int binary){
    int mynum=binary;
    int pow=0;
    int Decimal=0;
     while(binary>0){
        int LD=binary%10;
        Decimal=Decimal+(LD* (int) Math.pow(2,pow));

        pow++;

        binary=binary/10;


     }

     System.out.println("Decimal of  "+ mynum + " = " + Decimal);
}

// CONVERT  dECIMAL TO BNARY 

public static void DecToBin(int decimal){
    int mynum=decimal;
    int pow=0;
    int binary=0;
     while(decimal>0){
        int reminder=decimal%2;
        binary=binary+(reminder* (int) Math.pow(10,pow));

        pow++;

        decimal=decimal/2;


     }

     System.out.println("Decimal of  "+ mynum + " = " + binary);
}
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        // helloPrint();

        // CalculateSum();

        

       // Sum(4,6);

       // int sum=SumofNum(2, 3);
       // System.out.println(sum);

 /*

       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("Product is " + product(a, b) );
       System.out.println("Sum  is " + SumofNum(a, b) );
 */


 // Factorial

       // int n=sc.nextInt();
        // System.out.println("Factorial is "+ Factorial(n));

 // Bionomial

         // int n=sc.nextInt();
         // int r=sc.nextInt();
         // System.out.println("BC is "+ BionomialCoff(n,r));
 

// check prime number
         //   System.out.println(isPrime(12));

// check prime number in range
        //    PrimeinRange(0,10);



// Binary to Decimal

 BinToDec(101);

 DecToBin(5);


        
       
 

    
    }
}