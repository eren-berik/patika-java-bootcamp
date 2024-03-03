import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

/**
 * This class represents an Employee with basic attributes such as name, salary, work hours,
 * and hire year. It also provides methods for calculating tax, bonus, and salary raise.
 *
 * Tax calculation method:
 * Calculates the tax amount based on the given salary. If the salary is less than 1000,
 * no tax is applied. Otherwise, a 3% tax is applied to the salary.
 *
 * Bonus calculation method:
 * Calculates the bonus amount based on the given work hours. If the work hours are less
 * than 40, no bonus is applied. Otherwise, a bonus of 30 units is provided for each extra
 * hour worked beyond 40 hours.
 *
 * Salary raise calculation method:
 * Calculates the new salary after a raise based on the number of years the employee has
 * worked. If the employee has worked less than 10 years, the salary is increased by 5%.
 * If the employee has worked between 10 and 20 years, the salary is increased by 10%.
 * For employees who have worked more than 20 years, the salary is increased by 15%.
 */

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public int getWorkHours() {
        return workHours;
    }

    public double tax(double salary) {
        if (salary < 1000) {
            return 0;
        }

        return salary * 0.03;
    }

    public int bonus(int workHours) {
        if (workHours < 40) {
            return 0;
        }

        return  (workHours - 40) * 30;
    }

    public double raiseSalary(int hireYear) {
        int yearsWorked = LocalDate.now().getYear() - hireYear;
        double raisedSalary;
        if (yearsWorked < 10) {
             raisedSalary = salary * 1.05;
        } else if (yearsWorked < 20) {
            raisedSalary = salary * 1.10;
        } else {
            raisedSalary = salary * 1.15;;
        }

        return raisedSalary;
    }

    @Override
    public String toString() {
        // Calculate and print tax
        double taxAmount = tax(salary);

        // Calculate and print bonus
        int bonusAmount = bonus(workHours);

        // Calculate and print raise salary
        double raiseAmount = raiseSalary(hireYear) - salary;

        // Calculate and print total salary after tax and bonus
        double totalSalary = salary - taxAmount + bonusAmount;

        // Calculate and print total salary including raise
        double totalSalaryWithRaise = raiseAmount + salary + bonusAmount - taxAmount;

        return "Adı: " + name + "\n" +
                "Maaşı: " + salary + "\n" +
                "Çalışma Saati: " + workHours + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + taxAmount + "\n" +
                "Bonus: " + bonusAmount + "\n" +
                "Maaş Artışı: " + raiseAmount + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + totalSalary + "\n" +
                "Toplam Maaş: " + totalSalaryWithRaise;
      }
}
