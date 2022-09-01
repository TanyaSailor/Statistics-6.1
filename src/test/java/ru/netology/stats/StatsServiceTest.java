package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;

public class StatsServiceTest {
    @Test
    public void ShouldFindSalesPerYear() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.getSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldFindAverageSalesPerMont() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.getAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldFindMonthMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8; // Месяц в котором был пик продаж
        int actual = service.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldFindMonthMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9; // Месяц, в котором был минимум продаж
        int actual = service.getMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldFindMonthsUnderMiddle() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5; // Кол-во месяцев, в которых продажи были ниже среднего
        int actual = service.getBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldFindMonthsOverMiddle() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5; // Кол-во месяцев, в которых продажи были выше среднег
        int actual = service.getAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
