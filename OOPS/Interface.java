package OOPS;

public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eat();
        b.eats();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,all");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class king implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right by one stape");
    }
}

// multiple inheritence

interface Herbivore {
    void eat();
}

interface Carnivore {
    void eats();
}

class Bear implements Herbivore, Carnivore {
    public void eat() {
        System.out.println("eat grass");
    }

    public void eats() {
        System.out.println("eats meet");
    }
}