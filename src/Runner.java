public class Runner {
    //overloading
public  void run(int A){
   System.out.println(A+" is A value");

}
public void run(){
    System.out.println("Hi this is the overloading method without any parameter");
}
public void run(int a,int b){
    System.out.println((a+b)+" is the addition of the a and b");
}

}
class runnerr extends Runner{
    //overriding
    @Override
    public void run() {
        super.run();
    }

    @Override
    public void run(int a, int b) {
        super.run(a, b);
    }

    @Override
    public void run(int A) {
        super.run(A);
    }
}