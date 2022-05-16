class Test1 extends Thread{
    @Override
     public void run() {
        for (int i=1; i<=5; i++){
            try {
                Test1.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
public class test{
    public static void main(String[] args) throws InterruptedException {

        for (int i=1; i<=5; i++){
            try {
                Test1.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }

        Test1 t1 = new Test1();
        t1.join();
        t1.start();

    }
}
