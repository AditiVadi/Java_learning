package OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schollname = "JPS";

        Student s2 = new Student();
        System.out.println(s2.schollname);
    }
}

class Student {
    // ststic funstion
    static int returnper(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schollname;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
