package Recursion;

public class FriendsPairing {
    public static int friend(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // single
        int s = friend(n - 1);

        // pair
        int par = friend(n - 2);
        int fpar = (n - 1) * par;

        // total
        int tot = s + fpar;
        // return tot;
        return friend(n - 1) + (n - 1) * friend(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friend(3));
    }
}
