package abstractfactory;

public class StandardSeat implements Seat {
    @Override
    public String getSeatType() {
        return "Standard fabric seat, regular row";
    }
}
