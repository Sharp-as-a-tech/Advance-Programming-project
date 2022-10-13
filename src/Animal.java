public class Animal {
    //super class(parent)
     void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal{
    //subclass(child)
    void animalSound(){
        //callling the parent class method using super keyword
        super.animalSound();
        System.out.println("the dog says:bow wow (:");
    }

}
class Cat extends Animal{
    //dynamic bing
    void eat(){
        System.out.println("Cats eat meat");
    }
}
