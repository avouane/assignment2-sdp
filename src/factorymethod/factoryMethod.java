package factorymethod;

public class factoryMethod {
    public static void main(String[] args) {
        TicketCreator[] creators = {
                new RegularTicketCreator(),
                new VipTicketCreator(),
                new StudentTicketCreator()
        };

        for (TicketCreator creator : creators) {
            creator.sellTicket("Dune: Part Three");
        }
    }
}
