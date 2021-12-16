package lessonSix;

public abstract class Player {
    private String nickname;
    private int point;
    private String profession;

    public Player(String nickname, int point, String profession) {
        this.nickname = nickname;
        this.point = point;
        this.profession = profession;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return String.format("%s %s has properties: %s", profession, nickname, point);
    }

    public abstract void doAction();

}