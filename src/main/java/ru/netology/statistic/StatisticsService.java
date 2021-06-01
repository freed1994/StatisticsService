package ru.netology.statistic;

public class StatisticsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateMidSum(long[] purchases) {
        long midSum = calculateSum(purchases) / purchases.length;
        return midSum;
    }

    public long findMaxMonth(long[] purchases) {
        int maxMonth = 0;
        int month = 0;
        for (long purchase : purchases) {
            if (purchase >= purchases[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long findMinMonth(long[] purchases) {
        int minMonth = 0;
        int month = 0;
        for (long purchase : purchases) {
            if (purchase <= purchases[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long findMonthsLowMidSum(long[] purchases) {
        long monthsLowMidSum = 0;
        for (long purchase : purchases)
            if (purchase < calculateMidSum(purchases)) {
                monthsLowMidSum++;
            }
        return monthsLowMidSum;
    }

    public long findMonthsHighMidSum(long[] purchases) {
        long monthsHighMidSum = 0;
        for (long purchase : purchases)
            if (purchase > calculateMidSum(purchases)) {
                monthsHighMidSum++;
            }
        return monthsHighMidSum;
    }
}