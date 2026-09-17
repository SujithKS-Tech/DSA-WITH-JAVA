public class BruteForceUniquePairs {
     public static void main(String[] args) {
      int i,j,n=5;
      int arr[]={1,2,3,4,5};
      for(i=0;i<=n-1;i++){
        for(j=i+1;j<=n-1;j++){
          System.out.println(arr[i]+" "+arr[j]);
        }
        System.out.println();  
          }
              }
}
