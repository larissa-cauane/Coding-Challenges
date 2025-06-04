package exercism;

public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salaryBase = bonusForProductsSold(productsSold) + 1000;
        double salary = salaryBase < 2000 ? salaryBase : 2000;
        return daysSkipped > 0 ? salary * salaryMultiplier(daysSkipped) : salary;

    }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();

        int daysSkipped = 3;
        System.out.println(calculator.salaryMultiplier(daysSkipped));
        daysSkipped = 7;
        System.out.println(calculator.salaryMultiplier(daysSkipped));

        int productsSold = 21;
        System.out.println(calculator.bonusMultiplier(productsSold));
        System.out.println(calculator.bonusForProductsSold(productsSold));
        productsSold = 5;
        System.out.println(calculator.bonusMultiplier(productsSold));
        System.out.println(calculator.bonusForProductsSold(productsSold));

        daysSkipped = 2;
        productsSold = 3;
        System.out.println(calculator.finalSalary(daysSkipped, productsSold));
        productsSold = 90;
        System.out.println( calculator.finalSalary(daysSkipped, productsSold));


    }


}
