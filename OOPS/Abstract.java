package OOPS;

public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chaki c = new Chaki();
        c.eat();
        c.walk();
        // abstract class no object na bane
        // Animal a = new Animal() ;//error

        Mustang my = new Mustang();

    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called");
    }

    void eat() {
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }

}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chaki extends Animal {
    Chaki() {
        System.out.println("Chaki constructor called");
    }

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}