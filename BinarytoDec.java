import java.util.*;

public class BinarytoDec {
    public static int bin(int bin) {
        int pow = 0;
        int dec = 0;
        while (bin > 0) {
            int ld = bin % 10;
            dec = (int) (dec + (ld * Math.pow(2, pow)));
            pow++;
            bin = bin / 10;
        }

        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = bin(a);
        System.out.println("decimal of" + a + "is:" + ans);

    }
}
