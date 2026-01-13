package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindSumAllMonth() {
        StatsService service = new StatsService();
        int[] sum = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int actual = service.getSum(sum);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMidSumAllMonth() {
        StatsService service = new StatsService();
        int[] sum = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        int actual = service.midSum(sum);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindPickSalesMonth() {
        StatsService service = new StatsService();
        int[] sum = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 7;
        int actual = service.pickSales(sum);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sum = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        int actual = service.minSales(sum);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindCountBelowAverageMonth() {
        StatsService service = new StatsService();
        int[] sum = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.countBelowAverageMonth(sum);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindCountAboveAverageMonth() {
        StatsService service = new StatsService();
        int[] sum = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.countAboveAverageMonth(sum);
        Assertions.assertEquals(expected, actual);
    }

}
