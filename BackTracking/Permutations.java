package BackTracking;

public class Permutations {
    public static void find(String str, String ans) {
        // base
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion-O(n * n!)
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcd"=>"a" + "cd"="acd"
            String Newstr = str.substring(0, i) + str.substring(i + 1);// substring(i+1,str.length()-1)
            find(Newstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        find(str, ans);
    }
}
