public class trinagle {
    
    public static void main(String[] args) {
         int n = 7;
         int m =7;
         
         for (int i = 1; i <= n; i=i+2) {
             
             for(int j=1; j<=m-i; j++){
                System.out.print(" ");
             }

             for(int j=1; j<=i; j++){
                System.out.print("* ");

             }

             System.out.println(" ");
         }

    }
}



