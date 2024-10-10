// import java.util.Scanner;

public class Ord {

    void ord(int n){

        if(n == 0){
            System.out.println("---------");
            return;
        }

        System.out.println("Pre: " + n);
        ord(n-1);
        System.out.println("In: " + n);
        ord(n-1);
        System.out.println("Post: " + n);
    }
    public static void main (String[] args){
        Ord t = new Ord();
        int n = 2;

        t.ord(n);
        
        // Scanner input = new Scanner(System.in);
        // input.close();
    }
}