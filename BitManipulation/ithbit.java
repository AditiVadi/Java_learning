package BitManipulation;

public class ithbit {
    public static int get(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int clearIthbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int clearLast(int n, int i) {
        int bit = ~(0) << i;
        return n & bit;
    }

    public static int set(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int update(int n, int i, int newbit) {
        // if(new == 0){
        // return clear(n, i);
        // }
        // else{
        // return set(n, i);
        // }
        n = clearLast(n, i);
        int bitmask = newbit << i;
        return n | bitmask;
    }

    public static int clearIBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        // System.out.println(get(10, 2));
        System.out.println(update(10, 2, 1));
        System.out.println(clearIBits(10, 2, 4));
    }
}
