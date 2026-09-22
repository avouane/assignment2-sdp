package abstractfactory;

public interface CinemaFactory {
    Ticket createTicket();
    Seat createSeat();
    Snack createSnack();
}