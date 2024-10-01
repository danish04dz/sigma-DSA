import java.util.*;
public class tcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            sum = sum + (i * i * i);
        }

        System.out.println(sum);
    }
}