package factorymethod;

public class VipTicketCreator extends TicketCreator{
    @Override
    protected Ticket createTicket() {
        return new VipTicket();
    }
}
