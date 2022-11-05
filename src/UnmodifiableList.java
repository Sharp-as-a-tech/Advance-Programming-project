import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
    public static void main(String[] args){
        List<String> list_1=new ArrayList<>();
        Collections.addAll(list_1,"Afghanistan","Iran" ,"Pakistan");
        List<String> list_2=Collections.unmodifiableList(list_1);
        System.out.println("Unmodifiable List : "+list_2);
list_1.add("Syria");

        System.out.println("Unmodifiable List After adding another element: ");
        System.out.println(list_2);

    }
}
