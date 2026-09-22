package factorymethod;

public class StudentTicket implements Ticket {
    @Override
    public double getPrice() {
        return 6.0;
    }

    @Override
    public String describe() {
        return "Student ticket - discounted price, valid student ID required.";
    }
}
