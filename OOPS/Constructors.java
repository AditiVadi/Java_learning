package OOPS;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Aditi");
        System.out.println(s1.name);
        // Student s2 = new Student();
        Student s3 = new Student(23);
        System.out.println(s3.roll);
        // copy Constructor
        s1.name = "aditi";
        s1.roll = 123;
        s1.password = "asdf";
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 90;
        Student s2 = new Student(s1);// copy
        s2.password = "xyz";

        s1.marks[0] = 10;
        s1.marks[1] = 9;
        s1.marks[2] = 9;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }

}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    // deep copy Constructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // for (int i = 0; i < marks.length; i++) {
    // this.marks[i] = s1.marks[i];
    // }
    // }

    Student(String name) {
        marks = new int[3];

        this.name = name;
    }

    Student() {
        marks = new int[3];

        System.out.println("Consructor is colled.....");

    }

    Student(int roll) {
        marks = new int[3];

        this.roll = roll;
    }
}
