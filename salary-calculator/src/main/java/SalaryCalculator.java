public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double result = daysSkipped >= 5 ? 0.85 : 1.0;
        System.out.println("salaryMultiplier: " + result);
        return result;
    }

    public int bonusMultiplier(int productsSold) {
        int result = productsSold >= 20 ? 13 : 10;
        System.out.println("bonusMultiplier: " + result);
        return result;
    }

    public double bonusForProductsSold(int productsSold) {
        double result = productsSold * bonusMultiplier(productsSold);
        System.out.println("bonusForProductsSold: " + result);
        return result;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000.0 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        double result = salary > 2000.0 ? 2000.0 : salary;
        System.out.println("finalSalary: " + result);
        return result;
    }
}