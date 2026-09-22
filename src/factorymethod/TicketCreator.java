package factorymethod;

public abstract class TicketCreator {

    protected abstract Ticket createTicket();

    public void sellTicket(String movieName) {
        Ticket ticket = createTicket();
        System.out.println("Selling ticket for \"" + movieName + "\"");
        System.out.println(ticket.describe());
        System.out.println("Price: $" + ticket.getPrice());
        System.out.println("-----");
    }
}