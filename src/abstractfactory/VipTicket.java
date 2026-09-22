package abstractfactory;

public class VipTicket implements Ticket {
    @Override
    public String getLabel() {
        return "VIP Ticket";
    }

    @Override
    public double getPrice() {
        return 25.0;
    }
}
