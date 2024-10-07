import java.util.Arrays;
// import java.util.Scanner;

public class Sep {

    // int count (int[] arr){
    //     int count = 0;
    //     for(int i = 0; i < arr.length; i++) {
    //         if(arr[i] == 0){
    //             count++;
    //         }            
    //     }
    //     // System.out.println("count " + count);
    //     return count;
    // }
   
    void sep(int[] arr) {
        int c = 0;
        int n = arr.length;
        // int ntemp = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // int temp = arr[i];
                arr[c++] = arr[i];
                // arr[i] = temp;                
            }            
        } 

        for(int i = c; i < n; i++){
            arr[i] = 0;
        }
        
        // for(int i = n - count; i < n; i++){
        //     arr[i] = 0;
        // } 
        
        // if(ntemp != 0){
        //     arr[0] = ntemp;
        // }
        // System.out.println("n-c " + (n-count));

    }

    public static void main(String[] args) {
        Sep t = new Sep();
        // Scanner input = new Scanner(System.in);

        int[] arr = { 1, 0,0,0,0, 2, 0, 3,0,4,0,5,0,0 };
        // int[] arr = {0,0,0,0, 1, 2,3,4,0,5,0, 6,0,0,0,0};

        // int count = t.count(arr);
        // int count = 10;
        t.sep(arr);

        System.out.println(Arrays.toString(arr));

        // input.close();
    }
}