package factorymethod;

public class StudentTicketCreator extends TicketCreator {
    @Override
    protected Ticket createTicket() {
        return new StudentTicket();
    }
}

