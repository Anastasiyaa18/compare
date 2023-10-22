package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void sortTicket() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK", "MHK", 5_000, 15, 17);
        Ticket ticket2 = new Ticket("MSK", "MHK", 400, 12, 14);
        Ticket ticket3 = new Ticket("MSK", "BLR", 7_000, 10, 13);
        Ticket ticket4 = new Ticket("MSK", "MHK", 100, 7, 17);
        Ticket ticket5 = new Ticket("MSK", "MHK", 42_000, 9, 12);
        Ticket ticket6 = new Ticket("MSK", "MHK", 740, 19, 20);
        Ticket ticket7 = new Ticket("KLG", "MSK", 600, 22, 24);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket4, ticket2, ticket6, ticket1, ticket5};
        Ticket[] actual = manager.search("MSK", "MHK");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortOneTicket() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK", "MHK", 5_000, 15, 17);
        Ticket ticket2 = new Ticket("MSK", "MHK", 400, 12, 14);
        Ticket ticket3 = new Ticket("MSK", "BLR", 7_000, 10, 13);
        Ticket ticket4 = new Ticket("MSK", "MHK", 100, 7, 17);
        Ticket ticket5 = new Ticket("MSK", "MHK", 42_000, 9, 12);
        Ticket ticket6 = new Ticket("MSK", "MHK", 740, 19, 20);
        Ticket ticket7 = new Ticket("KLG", "MSK", 600, 22, 24);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket3};
        Ticket[] actual = manager.search("MSK", "BLR");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortTicketWhoNo() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK", "MHK", 5_000, 15, 17);
        Ticket ticket2 = new Ticket("MSK", "MHK", 400, 12, 14);
        Ticket ticket3 = new Ticket("MSK", "BLR", 7_000, 10, 13);
        Ticket ticket4 = new Ticket("MSK", "MHK", 100, 7, 17);
        Ticket ticket5 = new Ticket("MSK", "MHK", 42_000, 9, 12);
        Ticket ticket6 = new Ticket("MSK", "MHK", 740, 19, 20);
        Ticket ticket7 = new Ticket("KLG", "MSK", 600, 22, 24);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = manager.search("MSK", "KZN");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortTicketTime() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK", "MHK", 5_000, 15, 17);
        Ticket ticket2 = new Ticket("MSK", "MHK", 400, 12, 14);
        Ticket ticket3 = new Ticket("MSK", "BLR", 7_000, 10, 13);
        Ticket ticket4 = new Ticket("MSK", "MHK", 100, 16, 17);
        Ticket ticket5 = new Ticket("MSK", "MHK", 42_000, 9, 17);
        Ticket ticket6 = new Ticket("MSK", "MHK", 740, 19, 20);
        Ticket ticket7 = new Ticket("KLG", "MSK", 600, 22, 24);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new ru.netology.javaqa.TicketTimeComparator();

        Ticket[] expected = {ticket4, ticket6, ticket1, ticket2, ticket5};
        Ticket[] actual = manager.search("MSK", "MHK", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortOneTicketTime() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK", "MHK", 5_000, 15, 17);
        Ticket ticket2 = new Ticket("MSK", "MHK", 400, 12, 14);
        Ticket ticket3 = new Ticket("MSK", "BLR", 7_000, 10, 13);
        Ticket ticket4 = new Ticket("MSK", "MHK", 100, 16, 17);
        Ticket ticket5 = new Ticket("MSK", "MHK", 42_000, 9, 17);
        Ticket ticket6 = new Ticket("MSK", "MHK", 740, 19, 20);
        Ticket ticket7 = new Ticket("KLG", "MSK", 600, 22, 24);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new ru.netology.javaqa.TicketTimeComparator();

        Ticket[] expected = {ticket7};
        Ticket[] actual = manager.search("KLG", "MSK", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortTicketTimeWhoNo() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK", "MHK", 5_000, 15, 17);
        Ticket ticket2 = new Ticket("MSK", "MHK", 400, 12, 14);
        Ticket ticket3 = new Ticket("MSK", "BLR", 7_000, 10, 13);
        Ticket ticket4 = new Ticket("MSK", "MHK", 100, 16, 17);
        Ticket ticket5 = new Ticket("MSK", "MHK", 42_000, 9, 17);
        Ticket ticket6 = new Ticket("MSK", "MHK", 740, 19, 20);
        Ticket ticket7 = new Ticket("KLG", "MSK", 600, 22, 24);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new ru.netology.javaqa.TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = manager.search("KLG", "SPB", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
}