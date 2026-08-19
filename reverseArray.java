public class reverseArray{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
            for(int k=0; k<arr.length; k++){
                System.out.print(arr[k]+" ");
            }

        }
    }
