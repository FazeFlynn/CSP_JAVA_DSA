import java.util.ArrayList;
import java.util.List;

public class ListOdd {

    // public static boolean isPrime(int num) {
    //     if (num <= 1) return false; // Numbers less than or equal to 1 are not prime
    //     for (int i = 2; i <= Math.sqrt(num); i++) {
    //         if (num % i == 0) {
    //             return false; // Found a divisor, not a prime
    //         }
    //     }
    //     return true; // No divisors found, it's a prime
    // }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // numbers.add(1,7);
        // numbers.add(2,11);

        // Will not work properly if you add on indexes;

        System.out.println("Org List: " + numbers);

        for (int i = numbers.size() - 1; i >= 0; i--) {

            // System.out.println(i + " " + numbers.get(i));

            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i); 
            }
            // we are removing element so indexes will be adjusted
            // to remove it without any problem you can start from the last to 0 index or decrement i;
        }

        System.out.println("Removed Odd: " + numbers);
    }
}

// Some Function
//        list.get(index)
//        list.remove(index)