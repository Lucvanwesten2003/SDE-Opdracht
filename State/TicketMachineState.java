package State;

public interface TicketMachineState {
    void selectMovie();
    void selectSeats();
    void selectPayment();
    void printTicket();
}
