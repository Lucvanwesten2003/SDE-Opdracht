public class CinemaFacade {
    Cinema cinema = new Cinema();
    TicketMachine machine = new TicketMachine();

    public void Open(){
        System.out.println("Opening Cinema.....");
        cinema.unlockAllDoors();
        cinema.turnHeaterOn();
        cinema.turnAlarmOff();
        machine.on();
        machine.login();
        machine.update();
        machine.refill();
    }
}
