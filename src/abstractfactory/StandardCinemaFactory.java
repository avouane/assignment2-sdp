package abstractfactory;

public class StandardCinemaFactory implements CinemaFactory {
    @Override
    public Ticket createTicket() {
        return new StandardTicket();
    }

    @Override
    public Seat createSeat() {
        return new StandardSeat();
    }

    @Override
    public Snack createSnack() {
        return new StandardSnack();
    }
}
