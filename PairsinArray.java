public class PairsinArray {

    public static void pair(int num[]) {
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
                total++;
            }
            System.out.println();
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 5, 7, 8 };

        pair(num);

    }
}
