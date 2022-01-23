import java.util.*;
import Movies.Movie;
import Movies.Spiderman;

public class TicketMachineUI{
    private static Movie movie;

    Scanner sc= new Scanner(System.in);

    MovieFactory movieFactory = new MovieFactory();
    //select movie
    public void selectMovie(){
        System.out.println("Pick one of the following movies:");
        System.out.println("Spiderman");
        System.out.println("Batman");
        System.out.println("Superman");

        String pickedMovie = sc.nextLine();

        Movie movie = movieFactory.getMovie(pickedMovie);

        if(movie != null){
            movie.print();
            this.selectSeats();
        }else{
            System.out.println("error movie doesnt exist");
        }
    }
    
    //select seats
    public void selectSeats(){
        System.out.println("Pick one of the following seats:");
        String[] seats = {"6","14","22"};

        Arrays.stream(seats).forEach(System.out::println);

        String pickedSeat = sc.nextLine();

        Boolean seatFound = false;

        for(int i=0;i<seats.length;i++){
            if(seats[i].equals(pickedSeat)){
                System.out.println("You have chosen seat " +  pickedSeat);
                seatFound = true;
                this.selectPayment();
            }
        }

        if(!seatFound){
            System.out.println("Invalid seat");
        }
        
    }

    //pick payment method
    public void selectPayment(){
        System.out.println("Your total is: $10");
        System.out.println("select one of the following payment methods:");
        System.out.println("Cash");
        System.out.println("Credit Card");

        String method = sc.nextLine();

        if(method.equals("Cash")){
            System.out.println("Enter cash amount");
            sc.nextLine();
            System.out.println("Payment successful, your ticket will be printed");
            this.printTicket();
        }else if(method.equals("Credit Card")){
            System.out.println("Enter your Credit Card number:");
            sc.nextLine();
            System.out.println("Enter expiry date:");
            sc.nextLine();
            System.out.println("Enter your CVV:");
            sc.nextLine();
            System.out.println("Payment successful, your ticket will be printed");
            this.printTicket();
        }
    }

    public void printTicket(){
        System.out.println("Collect your ticket, thank you for your purchase");
    }
}