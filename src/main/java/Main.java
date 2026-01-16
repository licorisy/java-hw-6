import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long [] sum = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long sumAllMonth = service.getSum(sum);
        System.out.println(sumAllMonth);

        long midSum = service.midSum(sum);
        System.out.println(midSum);

        int pickSales = service.pickSales(sum);
        System.out.println(pickSales);

        int minSales = service.minSales(sum);
        System.out.println(minSales);

        int countBelowAverageMonth = service.countBelowAverageMonth(sum);
        System.out.println(countBelowAverageMonth);

        int countAboveAverageMonth = service.countAboveAverageMonth(sum);
        System.out.println(countAboveAverageMonth);

    }


}
