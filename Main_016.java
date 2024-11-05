// Interface for Common Functions
interface CommonFunctions {
    void searchTicket();
    void bookTicket();
    void cancelTicket();
    void makePayment();
    void fillDetails();
}

// Customer Class
class Customer {
    private String customerId;
    private String name;
    private String address;
    private int phoneNo;
    private int age;

    public Customer(String customerId, String name, String address, int phoneNo, int age) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    public void addDetails() {
        System.out.println("Adding details for customer: " + name);
    }

    public void modifyDetails() {
        System.out.println("Modifying details for customer: " + name);
    }

    public String getCustomerId() {
        return customerId;
    }
}

// Agent Class implementing CommonFunctions
class Agent implements CommonFunctions {
    private int id;
    private String name;

    public Agent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void searchTicket() {
        System.out.println("Agent " + name + " is searching for a ticket.");
    }

    @Override
    public void bookTicket() {
        System.out.println("Agent " + name + " is booking a ticket.");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Agent " + name + " is canceling a ticket.");
    }

    @Override
    public void makePayment() {
        System.out.println("Agent " + name + " is making payment.");
    }

    @Override
    public void fillDetails() {
        System.out.println("Agent " + name + " is filling ticket details.");
    }

    public String getName() {
        return name;
    }
}

// Ticket Class
class Ticket {
    private String source;
    private String destination;
    private String dateOfJourney;
    private String time;
    private String busNo;
    private String seatNo;

    public Ticket(String source, String destination, String dateOfJourney, String time, String busNo, String seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }

    public void displayTicketInfo() {
        System.out.println("Ticket from " + source + " to " + destination);
        System.out.println("Date: " + dateOfJourney + ", Time: " + time + ", Bus No: " + busNo + ", Seat No: " + seatNo);
    }
}

// Refund Class
class Refund {
    private float amount;
    private String customerId;

    public Refund(float amount, String customerId) {
        this.amount = amount;
        this.customerId = customerId;
    }

    public void refundAmount() {
        System.out.println("Refunding amount " + amount + " to customer ID " + customerId);
    }
}

// BookingCounter Class
class BookingCounter {
    public void requestBooking(Agent agent, Ticket ticket) {
        System.out.println("Booking Counter processing booking request from Agent: " + agent.getName());
        agent.bookTicket();
    }

    public void cancelBooking(Agent agent, Ticket ticket) {
        System.out.println("Booking Counter processing cancellation request from Agent: " + agent.getName());
        agent.cancelTicket();
    }
}

// Main class to test the application
public class Main_16{
    public static void main(String[] args) {
        // Creating Customer
        Customer customer = new Customer("C001", "ISHAAL", "123 Maple St", 1234567890, 28);
        customer.addDetails();

        // Creating Agent
        Agent agent = new Agent(101, "KANWAL");

        // Creating BookingCounter
        BookingCounter bookingCounter = new BookingCounter();

        // Creating Ticket
        Ticket ticket = new Ticket("LAHORE", "ISLAMABAD", "2024-11-20", "10:00 AM", "Bus804", "A1");
        ticket.displayTicketInfo();

        // Simulating ticket booking and payment
        bookingCounter.requestBooking(agent, ticket);
        agent.makePayment();
        agent.fillDetails();

        // Canceling ticket
        bookingCounter.cancelBooking(agent, ticket);

        // Creating Refund
        Refund refund = new Refund(100.0f, customer.getCustomerId());
        refund.refundAmount();

        // Modifying Customer Details
        customer.modifyDetails();

        System.out.println("Ticket booking and refund simulation completed.");
    }
}
