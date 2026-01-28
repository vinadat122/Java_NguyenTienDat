package main.session4;

public class Student {
    public Integer id;
    public String name;
    public String email;

    public void study(){
        System.out.println("student study...");
    }
    public Student(){

    }

    public Student(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
