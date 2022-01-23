public class TicketMachineTest {
    
    public static void main(String[] args) {
        TicketMachineUI machine = new TicketMachineUI();
        CinemaFacade cinema = new CinemaFacade();

        cinema.Open();

        machine.selectMovie();
    }
}
