package abstractfactory;

public class VipSeat implements Seat {
    @Override
    public String getSeatType() {
        return "Reclining leather seat with footrest, front-row balcony";
    }
}