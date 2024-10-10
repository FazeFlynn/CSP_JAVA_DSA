// import java.util.Scanner;

public class Fact {

    int factorial (int n){
        if(n == 1 || n==0){
            return 1;
        }

        return n * factorial(n-1);

    }

    public static void main (String[] args){
        Fact t = new Fact();
        int n = 5;


        // Scanner input = new Scanner(System.in);/
        // t.factorial(n);

        System.out.println(t.factorial(n));

        
        // input.close();
    }
}