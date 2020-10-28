package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

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
    public void shouldCashBackNoMore() {
        assertEquals(service.remain(1000), 0);
    }

   @Test
    public void shouldCashBackBoundaryLessThan1000() {
        Assertions.assertEquals(service.remain(999), 1);
    }
    @Test
    public void shouldCashBackBoundary1() {
        Assertions.assertEquals(service.remain(1), 999);
    }
}

