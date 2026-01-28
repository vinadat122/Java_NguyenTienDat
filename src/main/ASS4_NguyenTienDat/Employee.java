package main.ASS4;

public class Employee {
    private String name;
    private Integer id;

    public Employee(){

    }
    public Employee(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary(){
        return 0.0;
    }
}
