// import java.util.Scanner;

public class RecCount {

    void printNum(int n ) {
        if(n == 6){
            return;
        }

        System.out.println(n);
        printNum(n+1);
        System.out.println(n);

    }

    public static void main (String[] args){
        RecCount t = new RecCount();
        // Scanner input = new Scanner(System.in);

        int n = 1;
        t.printNum(n);
        
        // input.close();
    }
}