package ru.netology.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class CashbackHackServiceTest {

CashbackHackService service = new CashbackHackService();

   @Test
    void shouldReturn100() {
       int amount = 900;
       int expected = 100;
       int actual = service.remain(amount);
       Assertions.assertEquals(expected, actual);
   }


   @Test
    void shouldReturn900() {
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturn1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);

  }
}
