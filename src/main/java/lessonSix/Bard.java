package lessonSix;

public class Bard extends Player {
    public Bard(String nickname, int point) {
        super(nickname, point, "Бард");
    }

    public void sign(){
        System.out.println("Ateros Dominatus");
    }

    @Override
    public void doAction() {
        System.out.println(getProfession() + " " + getNickname() + " play on chello");
    }
}
