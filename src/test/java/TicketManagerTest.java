import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.tickets.TicketManager;
import ru.netology.tickets.TicketRepository;
import ru.netology.tickets.Tickets;


public class TicketManagerTest {

    @Test

    public void findSeveralTicketsTest() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Tickets ticket1 = new Tickets(1, "VDK", "MSK", 40000, 10);
        Tickets ticket2 = new Tickets(2, "EKB", "SPB", 38000, 9);
        Tickets ticket3 = new Tickets(3, "VDK", "MSK", 42000, 11);
        Tickets ticket4 = new Tickets(4, "OMSK", "SPB", 12000, 3);
        Tickets ticket5 = new Tickets(5, "VDK", "MSK", 37000, 10);
        Tickets ticket6 = new Tickets(6, "RnD", "EKB", 15000, 3);
        Tickets ticket7 = new Tickets(7, "VDK", "MSK", 44000, 9);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Tickets[] expected = {ticket5, ticket1, ticket3, ticket7};
        Tickets[] actual = manager.findAll("VDK", "MSK");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void findOneTicketTest() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Tickets ticket1 = new Tickets(1, "VDK", "MSK", 40000, 10);
        Tickets ticket2 = new Tickets(2, "EKB", "SPB", 38000, 9);
        Tickets ticket3 = new Tickets(3, "VDK", "MSK", 42000, 11);
        Tickets ticket4 = new Tickets(4, "OMSK", "SPB", 12000, 3);
        Tickets ticket5 = new Tickets(5, "VDK", "MSK", 37000, 10);
        Tickets ticket6 = new Tickets(6, "RnD", "EKB", 15000, 3);
        Tickets ticket7 = new Tickets(7, "VDK", "MSK", 44000, 9);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Tickets[] expected = {ticket4};
        Tickets[] actual = manager.findAll("OMSK", "SPB");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void noFoundTicketsTest() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Tickets ticket1 = new Tickets(1, "VDK", "MSK", 40000, 10);
        Tickets ticket2 = new Tickets(2, "EKB", "SPB", 38000, 9);
        Tickets ticket3 = new Tickets(3, "VDK", "MSK", 42000, 11);
        Tickets ticket4 = new Tickets(4, "OMSK", "SPB", 12000, 3);
        Tickets ticket5 = new Tickets(5, "VDK", "MSK", 37000, 10);
        Tickets ticket6 = new Tickets(6, "RnD", "EKB", 15000, 3);
        Tickets ticket7 = new Tickets(7, "VDK", "MSK", 44000, 9);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Tickets[] expected = {};
        Tickets[] actual = manager.findAll("VDK", "SPB");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void addTicketsTest() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Tickets ticket1 = new Tickets(1, "VDK", "MSK", 40000, 10);
        Tickets ticket2 = new Tickets(2, "EKB", "SPB", 38000, 9);
        Tickets ticket3 = new Tickets(3, "VDK", "MSK", 42000, 11);
        Tickets ticket4 = new Tickets(4, "OMSK", "SPB", 12000, 3);
        Tickets ticket5 = new Tickets(5, "VDK", "MSK", 37000, 10);
        Tickets ticket6 = new Tickets(6, "RnD", "EKB", 15000, 3);
        Tickets ticket7 = new Tickets(7, "VDK", "MSK", 44000, 9);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Tickets[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7};
        Tickets[] actual = repo.findAll();


        Assertions.assertArrayEquals(expected, actual);

    }
}
