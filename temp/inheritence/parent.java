/**
 * parent
 */
public class parent {


    String Name="Danish";
    int id=123;


    public static void main(String[] state) {

        System.out.println("Stydent name is :"+ state);
        
    }
    class child extends parent{
        System.out.println("child class");

    
    } 
    public static void main(String[] args) {
        parent p=new parent();
        System.out.println();(p.Name);
        System.out.println();(p.id);
        p.getUpdate("Up");
    }
}
 