package StaticSynchronization;

class BookTheaterSeat
{
	static int total_seats=20;
	
	static synchronized void bookSeat(int seats) 
	{
		if (total_seats>=seats)
		{
			System.out.println(seats+" seats booked successfully...");
			total_seats=total_seats-seats;
			System.out.println("Seats left : "+total_seats);
		} else 
		{
           System.out.println(seats+" Seats can not be booked !!!"); 
           System.out.println("Seats left : "+total_seats);
		}
	}
}

class MyThread1 extends Thread
{
	BookTheaterSeat b;
	int seats;
	
	public MyThread1(BookTheaterSeat b , int seats) 
	{
		this.b=b;
		this.seats=seats;
	}
	
	@Override
	public void run() 
	{
		b.bookSeat(seats);
	}
}

class MyThread2 extends Thread
{
	BookTheaterSeat b;
	int seats;
	
	public MyThread2(BookTheaterSeat b , int seats) 
	{
		this.b=b;
		this.seats=seats;
	}
	
	@Override
	public void run() 
	{
		b.bookSeat(seats);
	}
}

public class MovieBookApp {
	
	public static void main(String[] args) {
		
		BookTheaterSeat b1 = new BookTheaterSeat();   // object 1
		
		MyThread1 t1 = new MyThread1(b1,7);
		t1.start();
		
		MyThread2 t2 = new MyThread2(b1,6);
		t2.start();
		
		//--------------------------------------//
		
       BookTheaterSeat b2 = new BookTheaterSeat();    // object 2
		
		MyThread1 t3 = new MyThread1(b2,5);
		t3.start();
		
		MyThread2 t4 = new MyThread2(b2,9);
		t4.start();
		
	}

}
