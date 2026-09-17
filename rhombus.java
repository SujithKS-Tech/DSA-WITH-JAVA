public class rhombus{
    public static void main(String[] args) {
        int i;
        int j;
        int n;
        n=5;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        n=4;
        for(i=1; i<=n; i++){
        for(j=1; j<=(n-i)+1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}