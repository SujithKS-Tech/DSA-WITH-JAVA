public class BruteForceSubArray2{
    public static void main(String[] args) {
        int i,j,n;
        int arr[]={10,20,30,40,50,60};
        n=arr.length;
        for(i=0;i<=n-1;i++){
        for(j=i;j<=n-1;j++){
            for(int k=j;k<=n-1;k++){
            System.out.print(arr[k]+" ");
        }
            System.out.println();
    }
}
}
}