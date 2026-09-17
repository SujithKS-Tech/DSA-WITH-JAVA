public class  BoundaryPattern4{
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1; i<=n; i++){
            for(j=1; j<=n; j++){
                if(j==1 || j==9|| i+j==n+1 || i==j ){
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