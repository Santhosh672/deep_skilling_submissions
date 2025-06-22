package finance;

public class FinancialForecasting {
    public static void main(String[] args) {
        double initialAmount = 1000.0;
        double growthRate = 0.05;
        int totalPeriods = 3;

        double futureValue = calculateFutureValue(initialAmount, growthRate, totalPeriods);

        System.out.printf("Future value after %d periods: %.2f%n", totalPeriods, futureValue);
    }

    public static double calculateFutureValue(double currentAmount, double growthRate, int periodsLeft) {
        if (periodsLeft == 0) {
            return currentAmount;
        }
        
        double grownAmount = currentAmount * (1 + growthRate);
        return calculateFutureValue(grownAmount, growthRate, periodsLeft - 1);
    }
}
