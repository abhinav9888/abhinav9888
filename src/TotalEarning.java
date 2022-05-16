class MovieBookApp1 extends Thread {
    int total = 0;
    @Override
    public void run() {
        synchronized (this){
            for (int i=1;i<=10;i++){
                total +=100;
            }
            this.notify();
        }

    }
}
public class TotalEarning {
    public static void main(String[] args) throws InterruptedException {
        MovieBookApp1 mb = new MovieBookApp1();
        mb.start();
        synchronized (mb){
            mb.wait();
            System.out.println("Total earning is "+mb.total+" Rs.");
        }

    }
}