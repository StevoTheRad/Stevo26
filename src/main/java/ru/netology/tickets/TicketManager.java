package ru.netology.tickets;

import java.util.Arrays;

public class TicketManager {

private TicketRepository repository;

public TicketManager(TicketRepository repository) {
    this.repository = repository;
}

public void add(Tickets product) {
    repository.add(product);
}

public Tickets[] findAll(String from, String to) {
    Tickets[] result = new Tickets[0];
    for (Tickets ticket : repository.findAll()) {
    if (matches(ticket,from,to)) {
        Tickets[] tmp = new Tickets[result.length + 1];
        for (int i =0; i < result.length; i++ ) {
            tmp[i] = result[i];
        }
        tmp[result.length] = ticket;
        result = tmp;

    }
}
    Arrays.sort(result);
    return result;
}

private boolean matches(Tickets ticket, String from, String to) {
    if (ticket.getFrom().equals(from)) {
        if (ticket.getTo().equals(to)) {
            return true;
        }
    }
    return false;
}
}
