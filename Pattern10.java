public class Pattern10{
    public static void main(String[] args) {
        int i;
        int j;
        int n;
        n=5;
        int y;
         for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            y=1;
            for(j=1; j<=i; j++){
                System.out.print(y);
                y++;
            }
           y=i-1;
             for(j=1; j<=i-1; j++){
                 System.out.print(y);
                y--;
             }
            System.out.println();
        }
    }
}