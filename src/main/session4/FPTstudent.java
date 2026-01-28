package main.session4;

public class FPTstudent extends Student {
    private String acc;

    public FPTstudent(Integer id, String name, String email, String acc) {
        super(id, name, email);
        this.acc = acc;
    }

    public void playGame(){
        System.out.println("play game...");
    }
}
