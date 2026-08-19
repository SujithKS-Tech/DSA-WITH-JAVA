import java.util.ArrayList;
public class ArrayListexample{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.indexOf(50));
        System.out.println(list.size());
        System.out.println(list.contains(40));

    }
}