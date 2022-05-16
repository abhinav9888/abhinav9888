//Creating Another Class using Thread
public class MyAnotherClass extends Thread{
    @Override
    public void run() {
        for (int i=10; i>=1; i--){
            System.out.println("The value of i is : "+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
