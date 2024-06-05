package synchronizedBlock;

class BookTheaterSeat
{
	int total_seats=10;
	 void bookSeat(int seats)     //synchronized method
	{
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		
		synchronized(this)     // synchronized block // this can be used as acurrent object reference
		{
			if (total_seats>=seats) {
				System.out.println(seats+" seats booked successfully.");
				total_seats = total_seats - seats;
				System.out.println("Seats left : "+total_seats);
			} else {
	            System.out.println("Sorry Seats can not be Booked...!!");
	            System.out.println("Seats left : "+total_seats);
			}
		}
		
		
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
	}
}

public class MovieBookApp extends Thread
{
	 static BookTheaterSeat b ;
	    int seats;
		
		@Override
		public void run() 
		{
			b.bookSeat(seats);
		}
		
		public static void main(String[] args) 
		{
		    b = new BookTheaterSeat();	
			
		    MovieBookApp deepak = new MovieBookApp();
		    deepak.seats=7;
		    deepak.start();
		    
		    MovieBookApp amit = new MovieBookApp();
		    amit.seats=6;
		    amit.start();
			
		}


}
