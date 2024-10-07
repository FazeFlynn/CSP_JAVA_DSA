public class pattern {
    public static void main (String[] args){    
        int n = 5;
        // ===============================================
        // 5 4 3 2 1 
        // 5 4 3 2 
        // 5 4 3 
        // 5 4 
        // 5 

        System.out.println("Pattern 1");
        for(int i = 0; i < n+1; i++){
            for(int j = 5; j > i; j--) {        //         
                 System.out.print(j + " ");  
            }
                System.out.println();
        }

        // ==================================
        // 5 4 3 2 1 
        // 4 3 2 1 
        // 3 2 1 
        // 2 1 
        // 1 

        System.out.println("Pattern 2");
        for(int i = 0; i < n+1; i++){
            for(int j = n-i; j > 0; j--) {        //         
                 System.out.print(j + " ");  
            }
                System.out.println();
        }

        // ================================================
        // 1 2 3 4 5 4 3 2 1
        // 1     4   4     1
        // 1   3       3   1
        // 1 2           2 1
        // 1               1
        // 1 2           2 1
        // 1   3       3   1
        // 1     4   4     1
        // 1 2 3 4 5 4 3 2 1

        System.out.println("Pattern 3");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < n; j++) {   
                 if(i == 1 || j == 1 || j == n-i+1) System.out.print(j + " ");  // j == n-i+1 print only the value of j which is diagonal
                 else System.out.print("  ");                   
            }
            for(int j = n; j >= 1; j--) {   
                if(i == 1 || j == 1 || j == n-i+1) System.out.print(j + " ");  
                else System.out.print("  ");                   
            }    
            System.out.println();
        }

        // Second Segment
        for(int i = 2; i <= n; i++){
            for(int j = n; j > 1; j--) {   
                 if(i == n || j == n || j == n-i+1) System.out.print(n-j+1 + " ");  
                 else System.out.print("  ");                   
            }
            for(int j = 1; j <= n; j++) {   
                if(i == n || j == n || j == n-i+1) System.out.print(n-j+1 + " ");  
                else System.out.print("  ");                   
            }    
            System.out.println();
        }
    }      
}
