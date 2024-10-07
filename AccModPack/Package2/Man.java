package AccModPack.Package2;

import AccModPack.Package1.Person;

public class Man extends Person {

    public Man(String name) {
        super(name); // Calling the constructor of Person class
    }

    public void displayMan() {
        System.out.println("Man's name: " + name);
    }
}
