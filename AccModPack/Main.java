package AccModPack;
import AccModPack.Package2.Man;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("John");
        man.display();    // Inherited method from Person class
        man.displayMan(); // Man's specific method
    }
}
