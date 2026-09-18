public class TripletSum1{
      public static void main(String[] args) {
      int i,j,k,n=5;
      int arr[]={10,20,30,40,50};
      int sum=60;
      for(i=0;i<=n-1;i++){
        for(j=i+1;j<=n-1;j++){
          for(k=j+1;k<=n-1;k++){
          if(arr[i]+arr[j]+arr[k]==sum){
          System.out.println(arr[i]+","+arr[j]+","+arr[k]);
        }
        System.out.println();  
        }
            }
}
}
}
