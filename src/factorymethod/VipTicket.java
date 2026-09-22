package factorymethod;

public class VipTicket implements Ticket {
    @Override
    public double getPrice() {
        return 25.0;
    }

    @Override
    public String describe() {
        return "VIP ticket - reclining seat, free popcorn, priority entrance.";
    }
}
