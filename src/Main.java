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


//Object class
//toString
faculty faculty=new faculty();
System.out.println(faculty);
System.out.println(s.toString());
//hashCode
Inheretance in=new Inheretance();
        System.out.println(in);
        System.out.println(in.hashCode());
//super class
        Animal myDog=new Dog();
        myDog.animalSound();
//overloading methods calling
     //   Runner runner=new Runner();
      //  runner.run();
     //   runner.run(12);
      //  runner.run(2,3);
        runnerr runner1=new runnerr();
        runner1.run();
        //static binding class calling
        Bunny bunny=new Bunny();
        bunny.eat();
        //Dynamic binding
        Cat cat=new Cat();
        cat.eat();
    }
}