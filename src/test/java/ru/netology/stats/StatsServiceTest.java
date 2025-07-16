package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void calculateTotalSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedTotal = 180;
        long actualTotal = service.totalSales(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);

    }

    @Test
    public void calculateAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedAverage = 15.0;
        double actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage, 0.1);

    }

    @Test
    public void findMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void findMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void countMonthsBelowAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsBelow = 5;
        int actualMonthsBelow = service.monthsBelowAverageSales(sales);

        Assertions.assertEquals(expectedMonthsBelow, actualMonthsBelow);

    }

    @Test
    public void countMonthsAboveAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsAbove = 5;
        int actualMonthsAbove = service.monthsAboveAverageSales(sales);

        Assertions.assertEquals(expectedMonthsAbove, actualMonthsAbove);

    }


}
