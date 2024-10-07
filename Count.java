import java.util.Arrays;
import java.util.Scanner;

public class Count {

    void count(String[] str){
        String comp = str[0];

        int currCount = 1;
        int newStrIndex = 0;
        int newStrLenCount = 0;

        // String[] newStr = new String[];

        for(int i = 1; i < str.length; i++) {
            if (comp == str[i]){
                currCount++;                                
            } else {
                if(currCount != 1){
                    System.out.println(comp + currCount);
                    str[newStrLenCount++] = comp + currCount;                

                } else {
                    System.out.println(comp);
                    str[newStrLenCount++] = comp;                

                }

                comp = str[i];
                currCount = 1;
            }   

            // System.out.println("comp debug " + comp + currCount);            
        }

        if(currCount != 1){
            System.out.println(comp + currCount);
            str[newStrLenCount] = comp + currCount;
        } else {
            System.out.println(comp);
            str[newStrLenCount] = comp;

        }

        System.out.println(Arrays.toString(str));

        // return str;
        // String[] newStr = new String[newStrLenCount];
    }

    public static void main (String[] args){
        Count t = new Count();
        // Scanner input = new Scanner(System.in);

        String[] str = {"a","a","a","a", "b", "b", "c","c", "c", "d", "e"};
        // we need to return {"a3","b2",c};
        t.count(str);
        
        // input.close();
    }
}


// 443
// public @interface Count {    
// }
