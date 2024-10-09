import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

interface abcd<T> extends Iterable<T>{
    void add(T element);
    void remove(T element);
    void getAll();
}

class CustomList<T> implements abcd<T> {
    private List<T> list = new ArrayList<>();
    
    public void add(T element) {
        list.add(element);
    }
    
    public void remove(T element) {
        list.remove(element);
    }

    public void getAll() {
        for(T ele : list) {
            System.out.print(ele + " ");
            
        }
        System.out.println();
    }

    // Additional methods in CustomList
    public void sum() {
        System.out.println("Sum Method Called");  // Just an example
    }

    public void diff() {
        System.out.println("diff Method Called");  // Just an example

    }

    public void len() {
        System.out.println("len Method Called");  // Just an example

    }

    @Override
    public Iterator<T> iterator(){
        return list.iterator();
    }
}

public class GenericClass {
    public static void main(String[] args) {
        // Reference type is abcd, so only add() and remove() can be called
        abcd<String> myList = new CustomList<>();
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        // myList.remove("Apple");

        myList.getAll();

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Ite: " + iterator.next());
        }


        for(String fruit : myList){
            System.out.println(fruit);
        }

        // This won't work because sum(), diff(), and len() are not in the abcd interface
        // myList.sum();  // Compilation error
        
        // To call the CustomList-specific methods, you need to cast
        CustomList<String> actualList = (CustomList<String>) myList;
        // System.out.println("Sum: " + actualList.sum());  // This works
        System.out.println("Calling the Methods of Class Itself");
        actualList.sum();  // This works
    }
}
