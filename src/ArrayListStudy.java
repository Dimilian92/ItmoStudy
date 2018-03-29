import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
    System.out.println(list);
    list.add("First Element");
    list.add("Second Element");
    System.out.println(list);
    String str = list.get(1);
    System.out.println(str);
    System.out.println(list.indexOf("Second Element"));
    System.out.println(list.size());
    list.set(0, "New object");
    System.out.println(list);
        boolean new_object = list.contains("New object");
    String [] newArr = list.toArray(new String[list.size()]);

    ArrayList<Integer> listInt = new ArrayList<>();


    List<String> list2 = new LinkedList<>();
    list2.add("Str 1");
    System.out.println(list2);



    }
}
