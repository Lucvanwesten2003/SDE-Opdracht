import TicketMachine.*;
public class TicketMachineTest {
    
    public static void main(String[] args) {
        TicketMachineUI machine = new TicketMachineUI();
        CinemaFacade cinema = new CinemaFacade();

        //facade test
        cinema.Open();

        //State, Strategy, Factory test
        machine.selectMovie();
        machine.selectSeats();
        machine.selectPayment();
        machine.printTicket();
    }
}
