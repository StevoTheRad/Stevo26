package ru.netology.tickets;

public class TicketRepository {

    private Tickets[] tickets = new Tickets[0];

    public Tickets[] findAll() {
        return tickets;
    }

    public void add(Tickets ticket) {
        Tickets[] tmp = new Tickets[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }
}
