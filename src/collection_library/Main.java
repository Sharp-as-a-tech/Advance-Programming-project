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


//LinkedList
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
        //Vector
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

//Stack
        Stack<Object> stack=new Stack<Object>();
        stack.push("Afghanistan");
        stack.push("Tajikistan");
        stack.push("Pakistan");
        stack.push(12);
        stack.push("Iran");
        stack.push('C');
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.clear();
        System.out.println("stack after the clear method!");
        System.out.println(stack);

        Queue<Object> q1=new PriorityQueue<Object>();
        q1.add("dfghk");
        q1.add("dfgh");
        q1.add("Kandahar");
        q1.add("ASia");
        q1.add("sdfghj");
        q1.add("sdfgh");
        System.out.println(q1);
        System.out.println();
        q1.remove();
        System.out.println(q1.poll());
        System.out.println(q1.peek());
        System.out.println(q1.peek());
//Dequeue
        Deque<String> dq1=new ArrayDeque<String>();

        dq1.add("asd");
        dq1.add("bcd");
        dq1.add("efg");
        dq1.add("hij");
        dq1.add("klm");
        System.out.println(dq1);
        System.out.println("First Element: " + dq1.peek());

        dq1.pop();
        System.out.println(dq1);
//set
        Set<Integer> s1=new HashSet<Integer>();
        s1.add(12);
        s1.add(43);
        s1.add(32);
        s1.add(1200);
        s1.add(12576);
        s1.add(98);
        s1.clear();
        System.out.println(s1.isEmpty());
        //LinkHashSet
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Afghanistan ");
        set.add("is ");
        set.add("the  ");
        set.add("heart ");
        set.add("of  ");
        set.add("Asia");
        set.add("! ");
        System.out.println(set);
        set.clear();
        System.out.println(set);




    }
}
