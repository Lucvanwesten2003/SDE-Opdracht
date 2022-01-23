package State;
import java.util.*;
import TicketMachine.*;

public class SelectSeatState implements TicketMachineState {
    TicketMachineUI ticketmachine;

    public SelectSeatState(TicketMachineUI ticketMachine){
        this.ticketmachine = ticketMachine;
    }
    Scanner sc= new Scanner(System.in);
    @Override
    public void selectMovie(){
    
    }
    @Override
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
                this.ticketmachine.changeState(new SelectPaymentState(this.ticketmachine));
            }
        }

        if(!seatFound){
            System.out.println("Invalid seat");
        }
    }
    @Override
    public void selectPayment(){

    }
    @Override
    public void printTicket(){

    }
}
