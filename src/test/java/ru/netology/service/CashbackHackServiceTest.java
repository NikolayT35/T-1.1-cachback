package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService ();

    @Test
    public void shouldCashBackPlus() {
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void shouldCashBackBoundaryMoreThanThousand() {
        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void shouldCashBackBoundaryLessThan1000() {
        assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldCashBackBoundaryLessThanThousand() {
        assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldCashBack1000IfZero() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldCashBackNoMore() {
        assertEquals(service.remain(1000), 0);
    }
}

