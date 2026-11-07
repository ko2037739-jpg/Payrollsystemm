package payrollsystem;

import java.time.LocalDate;

public class PayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("101", "سارة", 1500.0, LocalDate.of(2023, 5, 10), 300.0);
        ContractorEmployee emp2 = new ContractorEmployee("202", "خالد", 800.0, LocalDate.of(2024, 1, 15), 50.0, 40);

        System.out.println(emp1.toString());
        System.out.println("Net Salary: " + emp1.calculateNetSalary());
        System.out.println("Bonus: " + emp1.calculateBonus(90.0));
        
        System.out.println("-----------------------------------");

        System.out.println(emp2.toString());
        System.out.println("Net Salary: " + emp2.calculateNetSalary());
    }
}