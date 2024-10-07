// Interface 1
interface Walkable {
    void walk();
}

// Interface 2
interface Talkable {
    void talk();
    void walk();
    // void salk();
}

// Class implementing multiple interfaces
class Person implements Walkable, Talkable {

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void talk() {
        System.out.println("Talking...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Person p = new Person();
        p.walk();
        p.talk();
    }
}
