import java.util.ArrayList;
import java.util.List;

public class ListPrime {

    public static boolean isPrime(int num) {
        // int divCount = 0;
        if (num <= 1) return false; 
        // int count = 0;

        for (int i = 2; i < num; i++) {
            // i*i < n
            if (num % i == 0) {
                // System.out.println("ran " + (count++));
                return false; 
                // divCount++;
            }

        }
        return true;

        // if (divCount >= 1){
        //     return false;            
        // } else{
        //     return true;
        // }
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);

        // numbers.add(1,7);
        // numbers.add(2,11);

        // Will not work properly if you add on indexes;

        System.out.println("Org List: " + numbers);

        for (int i = numbers.size() - 1; i >= 0; i--) {

            // System.out.println(i + " " + numbers.get(i));

            if (isPrime(numbers.get(i))) {
                numbers.remove(i); 
            }
            // we are removing element so indexes will be adjusted
            // to remove it without any problem you can start from the last to 0 index or decrement i;
        }

        System.out.println("Removed Prime: " + numbers);
    }
}

// Some Function
//        list.get(index)
//        list.remove(index)