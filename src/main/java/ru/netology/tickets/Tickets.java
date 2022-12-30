package ru.netology.tickets;

public class Tickets implements Comparable<Tickets> {

    private int id;
    private String from;
    private String to;
    private int price;
    private int duration;

    public Tickets(int id, String from, String to, int price, int duration) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Tickets o) {
        return price - o.getPrice();
    }
}
