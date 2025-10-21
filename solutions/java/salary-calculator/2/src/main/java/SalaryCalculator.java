public class SalaryCalculator {
    private final double BASE_SALARY = 1000;
    private final double SALARY_CAP = 2000.0;   
    private final double DAYS_OFF_LIMIT = 5;
    private final double QUOTA = 20;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= DAYS_OFF_LIMIT ? .85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= QUOTA ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        return Math.min(BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold), SALARY_CAP);
    } 
}
