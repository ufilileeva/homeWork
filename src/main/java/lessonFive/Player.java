package lessonFive;

public class Player {

    private static int playersCount = 0;

    private String nickname;
    private int points;
    private int level;
    private int money;

    public Player(String nickname, int points, int level, int money) {
        this.nickname = nickname.toUpperCase();
        setPoints(points);
        this.level = level;
        this.money = money;

        playersCount++;
    }

    public Player(String nickname) {
        this(nickname, 0, 1, 0);
    }

    public static int getPlayersCount() {
        return playersCount;
    }

    @Override
    public String toString() {
        return String.format("У игрока %s(уровень: %d) %d очков и накоплено %d монет", nickname, level, points, money);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public String getNickname() {
        return nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        if (points < 0 || points > 9999999){
            System.out.println("Кол-во очков " + points + "недопустимо!");
        }
        this.points = points;
    }

    public int getLevel() {
        return level;
    }

    public int getMoney() {
        return money;
    }

}
