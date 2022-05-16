class Medical extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Medical started");
            Thread.sleep(3000);
            System.out.println("Medical completed");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class TestDrive extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Test drive started");
            Thread.sleep(3000);
            System.out.println("Test drive completed");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Officer extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Officer recived the file");
            Thread.sleep(3000);
            System.out.println("Officer signed the file");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class LincenceDemo {
    public static void main(String[] args) throws InterruptedException {
        Medical m = new Medical();
        m.start();
        m.join();

        TestDrive t = new TestDrive();
        t.start();
        t.join();

        Officer o = new Officer();
        o.start();
    }
}
