package payrollsystem;

import java.time.LocalDate;

public class ContractorEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractorEmployee(String id, String name, double baseSalary, LocalDate joinDate, double hourlyRate, int hoursWorked) {
        super(id, name, baseSalary, joinDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateNetSalary() {
        return getBaseSalary() + (hourlyRate * hoursWorked);
    }

    @Override
    public String toString() {
        return super.toString() + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked;
    }

    @Override
    public double calculateBonus(double score) {
       return 0.0;
    }
}