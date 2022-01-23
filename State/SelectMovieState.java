package State;
import Movies.Movie;
import Factory.*;
import java.util.*;
import TicketMachine.*;

public class SelectMovieState implements TicketMachineState {
    TicketMachineUI ticketmachine;

    public SelectMovieState(TicketMachineUI ticketMachine){
        this.ticketmachine = ticketMachine;
    }
    MovieFactory movieFactory = new MovieFactory();
    Scanner sc= new Scanner(System.in);
    @Override
    public void selectMovie(){
        System.out.println("Pick one of the following movies:");
        System.out.println("Spiderman");
        System.out.println("Batman");
        System.out.println("Superman");

        String pickedMovie = sc.nextLine();

        Movie movie = movieFactory.getMovie(pickedMovie);

        if(movie != null){
            movie.print();
            this.ticketmachine.changeState(new SelectSeatState(this.ticketmachine));
        }else{
            System.out.println("error movie doesnt exist");
        }
    }
    @Override
    public void selectSeats(){

    }
    @Override
    public void selectPayment(){

    }
    @Override
    public void printTicket(){

    }
}
