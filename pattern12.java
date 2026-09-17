public class pattern12{
    public static void main(String[] args){
        int i;
        int j;
        int n;
        int y;
        n=5;
        // int x;
        for(i=1; i<=n; i++){
            y=1;
            for(j=1; j<=i-1; j++){
                System.out.print(y);
                y++;
            }
            y=i;
              for(j=1; j<=(n-i)+(n-i)+1; j++){
                System.out.print(y);
                
        }
        y=i-1;
            for(j=1; j<=i-1; j++){
                System.out.print(y);
                y--;
        }
        System.out.println();
    }
    n=4;
    for(i=1; i<=n;  i++){
        y=1;
         for(j=1; j<=n-i; j++){
                System.out.print(y);
                y++;
            }
            y=(n-i)+1;
            for(j=1; j<=i+(i+1); j++){
                 System.out.print(y);
        
            }
            y=n-i;
             for(j=1; j<=n-i; j++){
                 System.out.print(y);
                 y--;
            }
         System.out.println();
    }
}
}