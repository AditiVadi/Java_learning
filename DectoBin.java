import java.util.*;

public class DectoBin {
    public static int dec(int dec) {
        int bin = 0;
        int pow = 0;
        while (dec > 0) {
            int rem = dec % 2;
            bin = (int) (bin + rem * Math.pow(10, pow));
            pow++;
            dec = dec / 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal Number: ");
        int a = sc.nextInt();
        int ans = dec(a);
        System.out.println("binary of " + a + "is: " + ans);

    }
}
