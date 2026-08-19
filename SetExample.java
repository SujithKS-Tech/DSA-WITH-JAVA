import java.util.HashSet;

public class SetExample{
    public static void main(String[] args) {
        int arr[]={10,20,10,30,20,10,30};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
        set.add(arr[i]);
        }
        System.out.println(set);

        set.remove(20);
        System.out.println(set);

        System.out.println(set.contains(30));

        System.out.println(set.size());
    }
}