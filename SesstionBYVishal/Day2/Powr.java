package SesstionBYVishal.Day2;

public class Powr {
    public static int pow(int x, int n) {// O(n)=time space=O(n)
        if (n == 0) {
            return 1;
        }
        // int temp = pow(x, n - 1);
        return x * pow(x, n - 1);// tail recustion space=O(1)-compilar kare

    }

    // public static void print(int a, int b) {
    // if (a == b) {
    // System.out.println(a);
    // return;
    // }
    // print(a + 1, b);
    // }

    // public static void reprint(int a, int b) {
    // if (b > a) {
    // System.out.print(a);
    // }
    // reprint(a, b - 1);
    // System.out.print(a);
    // }

    public static void ree(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        ree(n - 1);
    }

    public static int search(int[] arr, int si, int ei, int ele) {
        if (si > ei) {
            return -1;
        }
        if (arr[si] == ele) {
            return si;
        }
        return search(arr, si + 1, ei, ele);
    }

    public static int search3(int[] arr, int el, int ele) {
        if (el == 0) {
            return -1;
        }
        if (arr[0] == ele) {
            return 0;
        }
        int r = search3(arr, el - 1, ele);
        return r == -1 ? -1 : r + 1;

    }

    // public static int sir(int[] arr, int n, int ele) {
    // ststic int i=0;
    // if (n == 0) {
    // return -1;
    // }
    // if (arr[0] == ele) {
    // return n;
    // }
    // return sir(arr + 1, n - 1, ele);
    // }
    public static int strongpow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 != 0) {
            return x * strongpow(x * x, n / 2);
        }
        return strongpow(x * x, n / 2);
    }

    public static void main(String[] args) {
        // System.out.println(pow(2, 1));
        // print(1, 10);
        // reprint(10, 1);
        // ree(10);
        int[] arr = { -7, 1, 3, 2, 5, 6 };
        // int c = search(arr, 0, 5, 2);
        // System.out.println(c);
        // System.out.println(search3(arr, 5, 2));
        // int r = sir(arr, 5, 3);
        // int n = arr.length;
        // if (r != -1) {
        // r = n - r;
        // }
        // System.out.println(r);
        // System.out.println(search3(arr, 5, 6));//khotu che
        System.out.println(strongpow(2, 4));
    }
}
