package ru.netology.stats;

public class StatsService {
    public long getSumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long getAverageSales(long[] sales) {
        return getSumSales(sales) / 12;
    }


    public int getMaxSales(long[] sales) {

        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    public int getMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int getBelowAverage(long[] sales) {
        long average = getAverageSales(sales);
        int belowAverage = 0;

        for (long sale : sales) {
            if (sale < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int getAboveAverage(long[] sales) {
        long average = getAverageSales(sales);
        int aboveAverage = 0;

        for (long sale : sales) {
            if (sale > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}

