package String;

public class Destination {
    public static float get(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            // North
            if (dir == 'N') {
                y++;
            }
            // South
            else if (dir == 'S') {
                y--;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else if (dir == 'E') {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(Y2 + X2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(get(path));

    }
}
