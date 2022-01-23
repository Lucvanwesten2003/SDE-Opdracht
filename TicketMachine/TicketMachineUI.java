package TicketMachine;

import State.SelectMovieState;
import State.TicketMachineState;



public class TicketMachineUI{
    

    TicketMachineState state = new SelectMovieState(this);

    public void changeState(TicketMachineState state){
        this.state = state;
    }

    //select movie
    public void selectMovie(){
        this.state.selectMovie();
    }
    
    //select seats
    public void selectSeats(){
        this.state.selectSeats();
    }

    //pick payment method
    public void selectPayment(){
        this.state.selectPayment();
    }

    public void printTicket(){
        this.state.printTicket();
    }
}