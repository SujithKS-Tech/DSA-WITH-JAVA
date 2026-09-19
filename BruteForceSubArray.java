public class BruteForceSubArray{
    public static void main(String[] args) {
        int i,j,n;
        int arr[]={10,20,30,40,50,60};
        n=arr.length;
        for(i=0;i<=n-1;i++){
        for(j=0;j<=i;j++){
            System.out.println(arr[j]+" ");
        }
         System.out.println();
    }
    System.out.println();
}
}