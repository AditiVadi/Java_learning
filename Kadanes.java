public class Kadanes {
    /**
     * @param num
     */
    public static void Kadanes(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int ms1 = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            // System.out.println(cs);
            for (int j = i; j < num.length; j++) {
                if (cs < 0) {
                    ms = Math.max(cs, cs + 1);

                }
            }

            if (cs < 0) {
                cs = 0;
            }
            ms1 = Math.max(cs, ms1);

        }
        if (ms1 > ms) {
            System.out.println("our Max Subaraay sum is:" + ms1);
        }
        System.out.println("all Num is -Ve=" + ms);

    }

    public static void main(String[] args) {
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        Kadanes(num);
    }
}
