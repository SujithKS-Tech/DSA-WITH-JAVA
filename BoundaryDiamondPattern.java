public class  BoundaryDiamondPattern{
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1; i<=n; i++){
            for(j=1; j<=n; j++){
                if(i+j+4==n+1 || i==j+4 ||  i==j-4 || i+j==n+1+4 ){
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