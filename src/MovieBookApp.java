class BookTheaterSeat{
    int total_seats=10;
    synchronized void bookSeat(int seats){
        if (total_seats>=seats){
            System.out.println(seats+" seats book successfully");
            total_seats=total_seats-seats;
            System.out.println("seats left : "+total_seats);
        }
        else {
            System.out.println("Sorry seats can not booked...!!");
            System.out.println("Seats left : "+total_seats);
        }
    }
}
public class MovieBookApp  extends Thread{
    static BookTheaterSeat b;
    int seats;
    @Override
    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b=new BookTheaterSeat();
        MovieBookApp abhinav=new MovieBookApp();
        abhinav.seats=7;
        abhinav.start();

        MovieBookApp amit=new MovieBookApp();
        amit.seats=6;
        amit.start();
    }
}
