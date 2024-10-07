import java.util.Arrays;
// import java.util.Scanner;
public class Rev {

    void rev(int p, int q, int[] arr){
        int i = 0;
        int temp = 0;
        while(p < q){
            temp = arr[p];
            arr[p++] = arr[q];
            arr[q--] = temp;
            // System.out.println("Ran " + (++i) + " times");
        }
        // System.out.println(Arrays.toString(arr));
    }

    public static void main (String[] args){
        Rev t = new Rev();

        int n = -1;
        // n = n - 1;
        int[] arr = {1,2,3,4};
        int p = 0;
        int q = arr.length-1;

        n = n%(q+1);

        
        if (n < 0){
            n = n*(-1);
            n = (q - n)+1;
        }
        
        t.rev(p,q,arr);
        t.rev(p,(q-n),arr);
        t.rev(q-n+1,q,arr);            
         

        System.out.println(Arrays.toString(arr));    

        
        // input.close();
    }
}


// larget tree ele
// dfs
// bfs
// then implement algorithms