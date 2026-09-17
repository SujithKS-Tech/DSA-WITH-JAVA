public class BoundaryPattern2{
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1; i<=n; i++){
            for(j=1; j<=n; j++){
                if(i==9 || j==1|| i==j ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                        
            }
            System.out.println();
        }
    }
}