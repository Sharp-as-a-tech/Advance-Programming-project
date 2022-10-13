public class Animal {
    //super class(parent)
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal{
    //subclass(child)
    public void animalSound(){
        //callling the parent class method using super keyword
        super.animalSound();
        System.out.println("the dog says:bow wow (:");
    }

}
