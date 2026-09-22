package abstractfactory;

public class CinemaClient {

    private final Ticket ticket;
    private final Seat seat;
    private final Snack snack;

    public CinemaClient(CinemaFactory factory) {
        this.ticket = factory.createTicket();
        this.seat = factory.createSeat();
        this.snack = factory.createSnack();
    }

    public void printBookingSummary() {
        System.out.println(ticket.getLabel() + " - $" + ticket.getPrice());
        System.out.println("Seat: " + seat.getSeatType());
        System.out.println("Snack: " + snack.getSnackDescription());
        System.out.println("-----");
    }
}