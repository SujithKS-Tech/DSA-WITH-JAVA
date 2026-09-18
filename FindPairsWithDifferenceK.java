public class FindPairsWithDifferenceK {
    public static void main(String[] args) {
        int i,j,n=5;
        int arr[]={1,2,3,4,5};
        int k=1;
        for(i=0;i<=n-1;i++){
            for(j=i+1;j<=n-1;j++){
                if(arr[j]-arr[i]==k){
                    System.out.println(arr[j] + " " + arr[i]);
                }
            }
        }
    }
}