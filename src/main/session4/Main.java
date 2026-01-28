package main.session4;

public class Main {
    public static void main(String[] args){
        Student s = new Student(1,"a","b");
        s.study();
        FPTstudent f = new FPTstudent(2,"b","c","d");
        f.study();
        f.playGame();
        AptechStudent a = new AptechStudent(3,"e","f","g","i");
        a.study();
        a.playGame();

        //cach su dung tinh da  hinh
        a.run();
        a.run(5);
        a.run("a");
    }

}
