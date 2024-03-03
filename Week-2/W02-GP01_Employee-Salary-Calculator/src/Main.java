public class Main {
    public static void main(String[] args) {
        // Create employee object
        Employee employee_1 = new Employee("Kemal", 2000, 45, 1985);

        // Print employee information
        System.out.println(employee_1);

        // Calculate tax, bonus, and raise salary
        double taxAmount = employee_1.tax(employee_1.getSalary());
        int bonusAmount = employee_1.bonus(employee_1.getWorkHours());
        double raiseAmount = employee_1.raiseSalary(employee_1.getHireYear()) - employee_1.getSalary();

        // Calculate total salary after tax and bonus
        double totalSalary = employee_1.getSalary() - taxAmount + bonusAmount;

        // Calculate total salary including raise
        double totalSalaryWithRaise = employee_1.raiseSalary(employee_1.getHireYear()) - taxAmount + bonusAmount;

        // Print calculated values
        System.out.println("Vergi: " + taxAmount);
        System.out.println("Bonus: " + bonusAmount);
        System.out.println("Maaş artışı: " + raiseAmount);
        System.out.println("Vergi ve bonuslarla birlikte maaş: " + totalSalary);
        System.out.println("Toplam maaş: " + totalSalaryWithRaise);
    }
}
