package Threading;

public class UsingThreadClass extends Thread{
    public UsingThreadClass(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("This Thread -Start "+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
            //Get database connection
            doDBProcessing();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(" The thread -END "+Thread.currentThread().getName());
    }
    private void doDBProcessing() throws InterruptedException{
        Thread.sleep(1000);
    }
}
