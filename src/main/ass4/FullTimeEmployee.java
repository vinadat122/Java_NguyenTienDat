package main.ass4;

public class FullTimeEmployee extends Employee{
    private Double salary;

    public FullTimeEmployee(String name, Integer id, Double salary) {
        super(name, id);
        this.salary = salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public Double getSalary() {
        return salary;
    }
}
