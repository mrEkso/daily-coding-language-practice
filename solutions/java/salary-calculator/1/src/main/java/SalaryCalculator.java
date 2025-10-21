public class SalaryCalculator {
    public static double BASIC_SALARY = 1000;
    public static int AT_LEAST_DAYS_PENALTY = 5;
    public static int AT_LEAST_PRODUCTS_SOLD_BONUS = 20;
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= AT_LEAST_DAYS_PENALTY ? .85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= AT_LEAST_PRODUCTS_SOLD_BONUS ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        return Math.min(BASIC_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold), 2000);
    } 
}
