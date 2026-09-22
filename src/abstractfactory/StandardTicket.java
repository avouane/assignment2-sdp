package abstractfactory;

public class StandardTicket implements Ticket {
    @Override
    public String getLabel() {
        return "Standard Ticket";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}

