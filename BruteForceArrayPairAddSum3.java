public class BruteForceArrayPairAddSum3 {
      public static void main(String[] args) {
      int i,j,n=5;
      int arr[]={10,20,30,40,50};
      int sum=60;
      for(i=0;i<=n-1;i++){
        for(j=i+1;j<=n-1;j++){
          if(arr[i]+arr[j]==sum){
          System.out.println(arr[i]+","+arr[j]);
        }
        System.out.println();  
        }
            }
}
}
