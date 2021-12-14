package lessonFive.classWork;

import java.util.Arrays;

public class Team {
    private static final int DEFAULT_MAX_PLAYERS = 10;
    private Player[] players = new Player[DEFAULT_MAX_PLAYERS];
    private int playersCount=0;
    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public boolean addPlayer(Player player) {
        if (playersCount == players.length) {
            return false;
        }
        players[playersCount++] = player;
        return true;
    }

    public boolean addPlayer(Player... players){
        boolean result = true;
        for (int i = 0; i < players.length; i++) {
            Player player = players[i];
            result &= addPlayer(player);
        }
        return result;
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        int allPoints = 0;
        String lineup = "";
        for (int i = 0; i < playersCount; i++) {
            Player player = players[i];
            allPoints += player.getPoints();
            lineup += String.format("%s(lvl: %d, money: %d)", player.getNickname(), player.getLevel(), player.getMoney());
            if (i != playersCount-1){
                lineup += ", ";
            } else {
                lineup += ".";
            }
        }
        return String.format("Команда %s имеет в общем %d. Состав команды: %s", teamName, allPoints, lineup);
    }
}
