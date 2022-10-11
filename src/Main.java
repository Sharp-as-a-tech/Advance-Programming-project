import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
Student s=new roomno();
System.out.println(s.m1(80));
//Association
faculty uni=new faculty();
uni.nameoftheuni();
//wrapper classes
        //int to Integer
        Integer a=new Integer(10);
       System.out.println(a+" is an Integer in wrapper class");
        //char =Character
        Character ch=new Character('C');
        //short =Short
        //long=Long
        //float=Float
        //double=Double
        //boolean to Boolean
        //byte=Byte



        //Autoboxing
        char c='c';
        Character A = c;

        System.out.println(A);
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(25);
        System.out.println(arrayList.get(0));
        //unboxing
        Character Char='a';
        char cha=Char;
        System.out.println(cha);
    }
}