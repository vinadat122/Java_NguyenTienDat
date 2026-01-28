package main.session4;

public class AptechStudent extends FPTstudent{
    private String acc_plus;

    public AptechStudent(Integer id, String name, String email, String acc, String acc_plus) {
        super(id, name, email, acc);
        this.acc_plus = acc_plus;
    }

    public void playGame(){
        System.out.println("aptech choi game khac...");
    }

    // tinh da hinh - overload - nap chong
    public void run(){
        super.playGame(); //super: doi tuong ngam dinh cua lop cha, chay ham playGame cua lop cha
        System.out.println("chay 5km/h...");
    }
    public void run(int x){
        System.out.println("chay 10km/h");
    }
    public void run (String msg){
        System.out.println("20km/h");
    }

    public void sing(int a, String ms) {

    }
    public void sing(String ms, int a){

    }
}
