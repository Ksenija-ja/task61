package ru.netology.stats;

public class StatsService {
    public long sumSalesYear(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }


    public long averageSaleYear(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long averageSaleYear = totalSale / 12;

        return averageSaleYear;
    }

    public int calcMaxSaleMonth(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }

        }
        return monthMax + 1;
    }

    public int calcMinSaleMonth(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }

        }
        return monthMin + 1;
    }

    public int calcBelowAverageSaleMonth(long[] sales) {
        int counter = 0;
        long average = averageSaleYear(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int calcHigherAverageSaleMonth(long[] sales) {
        int counter = 0;
        long average = averageSaleYear(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}