package ru.netology.sachko;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

        @org.testng.annotations.Test
        public void testRemain() {
            CashbackHackService service = new CashbackHackService();
            int amount = 900;
            int actual = service.remain(amount);
            int expected =100;
            assertEquals(actual, expected);
        }
    @org.testng.annotations.Test
    public void testRemainBoard() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

}

