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
//        Iterator itr= list1.listIterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }



        List<Integer> list2=new LinkedList<Integer>();
        list2.add(12);
        list2.add(78);
        list2.add(231);
        list2.add(120);
        list2.add(19);
        list2.add(107);
//        list2.clear();
        list2.remove(1);
        list2.set(1,3000);
        System.out.println(list2.get(1));
        System.out.println("LinkedList");
        Iterator itr= list2.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        List<Character> list3=new Vector<Character>();

        list3.add('A');
        list3.add('B');
        list3.add('C');
        list3.add('D');
        list3.add('E');
        list3.add('F');
        list3.add('@');
        list3.add('$');
        list3.add('#');
        list3.remove(4);
list3.set(5,'G');
        Iterator itr2= list3.listIterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        list3.add(4,'E');
        System.out.println("the Vector after adding the E element again");
        Iterator itr3=list3.listIterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

        System.out.println(list3.isEmpty());



    }
}
