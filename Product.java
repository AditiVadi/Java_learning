import java.util.*;

public class Product {
    public static int Pro(int c, int d) {
        int pro = c * d;
        return pro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Pro(a, b);
        System.out.println(c);
    }
}
