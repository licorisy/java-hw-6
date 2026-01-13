package ru.netology.stats;

public class StatsService {
    public int getSum(int[] sum) {
        int sumAllMonth = 0;
        for (int i = 0; i < sum.length; i++) {
            sumAllMonth = sumAllMonth + sum[i];
        }
        return sumAllMonth;
    }

    public int midSum(int[] sum) {
        int getSum = this.getSum(sum);
        return (int) getSum / sum.length;
    }

    public int pickSales(int[] sum) {
        int pickMonth = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] >= sum[pickMonth]) {
                pickMonth = i;
            }
        }
        return pickMonth;
    }

    public int minSales(int[] sum) {
        int minMonth = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] <= sum[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int countBelowAverageMonth(int[] sum) {
        int avg = this.midSum(sum);
        int belowAvgCount = 0;
        for (int m : sum) {
            if (m < avg) {
                belowAvgCount++;
            }
        }
        return belowAvgCount;

    }

    public int countAboveAverageMonth(int[] sum) {
        int avg = this.midSum(sum);
        int aboveAvgCount = 0;
        for (int m : sum) {
            if (m > avg) {
                aboveAvgCount++;
            }
        }
        return aboveAvgCount;
    }


}
