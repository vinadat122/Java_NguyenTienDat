package main.ASS4;

public class PartTimeEmployee extends Employee{
    private Double hour;
    private Double salaryPerHour;

    public PartTimeEmployee(String name, Integer id, Double hour, Double salaryPerHour) {
        super(name, id);
        this.hour = hour;
        this.salaryPerHour = salaryPerHour;
    }

    public Double getHour() {
        return hour;
    }

    public void setHour(Double hour) {
        this.hour = hour;
    }

    public Double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(Double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public Double getSalary() {
        return getSalaryPerHour()*getHour();
    }
}
