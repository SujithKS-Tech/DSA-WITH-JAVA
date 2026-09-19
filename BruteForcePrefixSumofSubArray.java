public class BruteForcePrefixSumofSubArray{
    public static void main(String[] args) {
        int i,j,n;
        int arr[]={10,20,30,40,50,60};
        n=arr.length;
        for(i=0;i<=n-1;i++){
        for(j=i;j<=n-1;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
                sum=sum+arr[k];
            System.out.print(arr[k]+" ");
        }
        System.out.println("sum:" + sum);
            System.out.println();
    }
}
}
}