package abstractfactory;

public class VipCinemaFactory implements CinemaFactory {
    @Override
    public Ticket createTicket() {
        return new VipTicket();
    }

    @Override
    public Seat createSeat() {
        return new VipSeat();
    }

    @Override
    public Snack createSnack() {
        return new VipSnack();
    }
}
