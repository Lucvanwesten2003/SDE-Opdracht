package State;
import java.util.*;
import Context.*;
import Strategy.*;
import TicketMachine.*;

public class PrintTicketState implements TicketMachineState {
    TicketMachineUI ticketmachine;

    public PrintTicketState(TicketMachineUI ticketMachine){
        this.ticketmachine = ticketMachine;
    }
    @Override
    public void selectMovie(){
    
    }
    @Override
    public void selectSeats(){

    }
    @Override
    public void selectPayment(){

    }
    @Override
    public void printTicket(){
        System.out.println("Collect your ticket, thank you for your purchase");
        this.ticketmachine.changeState(new SelectMovieState(this.ticketmachine));
    }
}
