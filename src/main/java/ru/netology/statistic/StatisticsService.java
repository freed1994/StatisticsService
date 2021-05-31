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
        long sum = 0;
        long midSum = 0;
        int months = 12;
        for (long purchase : purchases) {
            sum += purchase;
            midSum = sum / months;
        }
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
        int monthsLowMidSum = 0;
        int midSum =0;
        for (long purchase : purchases) {
            midSum += purchase;
        }
        for (long purchase : purchases) {
            if (purchase <calculateMidSum(purchases)) {
                monthsLowMidSum += 1;
            }
        }
        return monthsLowMidSum;
    }

    public long findMonthsHighMidSum(long[] purchases) {
        int monthsLowMidSum = 0;
        int midSum =0;
        for (long purchase : purchases) {
            midSum += purchase;
        }
        for (long purchase : purchases) {
            if (purchase >calculateMidSum(purchases)) {
                monthsLowMidSum += 1;
            }
        }
        return monthsLowMidSum;
    }
}