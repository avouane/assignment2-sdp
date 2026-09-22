package factorymethod;

public class RegularTicketCreator extends TicketCreator {
    @Override
    protected Ticket createTicket() {
        return new RegularTicket();
    }
}
