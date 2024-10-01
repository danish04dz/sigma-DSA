import java.util.*;
public class Q3_three_items {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();

        float total= pencil+pen+eraser;

        System.out.println(total);

        float GST= total*(float)(0.18);

        float gtotal= GST+total;

        
        System.out.println("GST " + GST);
        System.out.println("with GST " + gtotal);

    }
}
