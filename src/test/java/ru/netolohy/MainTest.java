package ru.netolohy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.Main;

public class MainTest {
    private static int[] prices;
    private static int[] money;
    private static int[] expected;

    @BeforeAll
    static void beforeAll() {
        prices = new int[] {13,17,19,25,25,25,25,25,25,27,30};
        money = new int[] {31,26,25,20};
        expected = new int[] {0,2,2,8};
    }
    @Test
    void binSearch() {
        for (int i = 0; i < money.length; i++) {
            int result = Main.countMore(prices, money[i]);
            Assertions.assertEquals(expected[i], result);
        }
    }
}
