public class Linearsearch{
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int x=30;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
    }
}
 
    
        
