public class Producer extends Thread{

    Company c;
    Producer(Company c){
        this.c=c;
    }
    @Override
    public void run()
    {
        int i=1;
        while (true)
        {
            try {
                this.c.produce_item(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
