public class Reverse {
    public static void reverse(int num[]) {
        int frist = 0;
        int last = num.length - 1;
        while (frist < last) {
            int temp = num[last];
            num[last] = num[frist];
            num[frist] = temp;

            frist++;
            last--;
        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 5, 7, 8 };

        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

    }
}
