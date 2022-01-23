package State;
import java.util.*;
import Context.*;
import Strategy.*;
import TicketMachine.*;

public class SelectPaymentState implements TicketMachineState {
    TicketMachineUI ticketmachine;

    public SelectPaymentState(TicketMachineUI ticketMachine){
        this.ticketmachine = ticketMachine;
    }
    PaymentContext pay = new PaymentContext(new Cash());
    Scanner sc= new Scanner(System.in);
    @Override
    public void selectMovie(){
    
    }
    @Override
    public void selectSeats(){

    }
    @Override
    public void selectPayment(){
        System.out.println("Your total is: $10");
        System.out.println("select one of the following payment methods:");
        System.out.println("Cash");
        System.out.println("Credit Card");

        String method = sc.nextLine();

        if(method.equals("Cash")){
            pay.executePayment();
            this.ticketmachine.changeState(new PrintTicketState(this.ticketmachine));
        }else if(method.equals("Credit Card")){
            pay = new PaymentContext(new CreditCard());
            pay.executePayment();
            this.ticketmachine.changeState(new PrintTicketState(this.ticketmachine));
        }
    }
    @Override
    public void printTicket(){

    }
}
