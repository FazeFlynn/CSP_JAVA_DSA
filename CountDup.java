// import java.util.Scanner;

public class CountDup {

    void CountDuplicates(int[] arr){

        int length = arr.length;

        int count = 0;

        for(int i = 1; i < length; i++) {
            // for(int j = i+1; j < length; j++) {

                if (arr[i-1] == arr[i]){
                    count++;
                    
                } 
                

                
            // }
            
        }

        System.out.println("Duplicates" + (count));


    }

    

    public static void main (String[] args){
        CountDup t = new CountDup();
        // Scanner input = new Scanner(System.in);


        int[] arr = {0,0,1,1,1,1,2,2,3,44};

        t.CountDuplicates(arr);





        
        // input.close();
    }
}