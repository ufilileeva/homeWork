package lessonSix.classWork;

public class Knight extends Player {

    private String swordName;

    public Knight(String nickname, int point, String swordName) {
        super(nickname, point, "Рыцарь");
        this.swordName = swordName;
    }

    public Knight(String nickname, int point) {
        this(nickname, point, "excalibur");
    }

    public String getSwordName() {
        return swordName;
    }

    public void setSwordName(String swordName) {
        this.swordName = swordName;
    }

    @Override
    public String toString() {
        return super.toString() + " and sword " + swordName;
    }

    @Override
    public void doAction() {
        System.out.println(getProfession() + " " + getNickname() + " make move sword " + swordName);
    }
}
