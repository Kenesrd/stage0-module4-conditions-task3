package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double afterTaxes = 0;
        if (salary <= 0){
            System.out.println("wrong input!");
        } else if (salary <= 10000){
            double taxes = salary * 0.15;
            afterTaxes = salary - taxes;
            System.out.println(afterTaxes);
        } else if (salary > 10000 && salary <= 20000){
            double taxes = salary * 0.18;
            afterTaxes = salary - taxes;
            System.out.println(afterTaxes);
        } else {
            double taxes = salary * 0.20;
            afterTaxes = salary - taxes;
            System.out.println(afterTaxes);
        }
    }
}
