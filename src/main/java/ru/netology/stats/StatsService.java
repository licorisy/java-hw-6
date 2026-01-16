package ru.netology.stats;

public class StatsService {
    public long getSum(long[] sum) {
        long sumAllMonth = 0;
        for (int i = 0; i < sum.length; i++) {
            sumAllMonth = sumAllMonth + sum[i];
        }
        return sumAllMonth;
    }

    public long midSum(long[] sum) {
        long getSum = this.getSum(sum);
        return (int) getSum / sum.length;
    }

    public int pickSales(long[] sum) {
        int pickMonth = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] >= sum[pickMonth]) {
                pickMonth = i;
            }
        }
        return pickMonth;
    }

    public int minSales(long[] sum) {
        int minMonth = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] <= sum[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int countBelowAverageMonth(long[] sum) {
        long avg = this.midSum(sum);
        int belowAvgCount = 0;
        for (long m : sum) {
            if (m < avg) {
                belowAvgCount++;
            }
        }
        return belowAvgCount;

    }

    public int countAboveAverageMonth(long[] sum) {
        long avg = this.midSum(sum);
        int aboveAvgCount = 0;
        for (long m : sum) {
            if (m > avg) {
                aboveAvgCount++;
            }
        }
        return aboveAvgCount;
    }


}
