public class prefixsum{
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int n=5;
        int psum[]=new int[n];
        psum[0] = a[0];
    for(int i=1; i<n; i++){
        psum[i]=psum[i-1] + a[i];
        }   
    for(int i=0; i<n; i++){
        System.out.print(psum[i]+" ");
    }
}
}