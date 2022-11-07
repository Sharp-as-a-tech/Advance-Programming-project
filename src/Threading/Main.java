package Threading;

public class Main {
    public static void main(String[] args){
//        Thread t1=new Thread(new WorkerThread());
//        Thread t2=new Thread(new WorkerThread());
//        System.out.println("Starting Runnable Threads!");
//        t1.start();
//        t2.start();
        System.out.println("Runnable Threads has been started!");
        Thread t3=new UsingThreadClass("t3");
        Thread t4=new UsingThreadClass("t4");
        System.out.println("UsingThreadClass Threads has been started!");
        t3.start();
        t4.start();
        System.out.println("Runnable Threads has been started!");


    }

}
