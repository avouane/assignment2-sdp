package factorymethod;

public class RegularTicket implements Ticket {
    @Override
    public double getPrice() {
        return 10.0;
    }

    @Override
    public String describe() {
        return "Regular ticket - standard seating, no extra perks.";
    }
}

