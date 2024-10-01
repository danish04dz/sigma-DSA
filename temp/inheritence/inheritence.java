class mobile{
    void call(){
        System.out.println("Ringing...");

    }
}

class sphone extends mobile{
    void palymusic(){
        System.out.println("sa re ga ma ");
    }
}




/* 
class car
 {
    void components(){
        System.out.println("4 wheel");
        System.out.println("Metal Body");

    }

    
}

 class alto extends car {
    void features(){
        System.out.println("samll in size");
        System.out.println("average speed");
    }
 }
class nano extends alto{
    void nfeatures(){
        System.out.println("look like box");
    }
}
     */

public class inheritence {
    public static void main(String[] args) {

        sphone n=new sphone();
        n.call();
        n.palymusic();
       /*  n.components(); */

        
    }








    
}
