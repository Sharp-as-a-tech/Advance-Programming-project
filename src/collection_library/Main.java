package collection_library;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //List Class
        //Arraylist
        List<String> list1=new ArrayList<String>();
        list1.add("Sohaila");
        list1.add("Shakila");
        list1.add("Namira");
        list1.add("Asiah");
        list1.add("Sila");
        System.out.println(list1.get(2));
        list1.remove(2);
        list1.set(2,"Namira");
        //traversing through Iterator
        Iterator itr= list1.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



        List<Integer> list2=new LinkedList<Integer>();
        list2.add(12);
        List<Character> list3=new Vector<Character>();
    }
}
