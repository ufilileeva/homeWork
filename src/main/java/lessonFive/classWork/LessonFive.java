package lessonFive.classWork;

public class LessonFive {
    public static void main(String[] args) {
        Player player1 = new Player("PlayerOne", 0, 1, 0);
        Player player2 = new Player("PlayerTwo", 10, 2, 10);
        Player player3 = new Player("PlayerThree");

        System.out.println("Получили имя: " + player1.getNickname());

        System.out.println("Кол-во всех игроков: " + Player.getPlayersCount());

        /*player1.printInfo();
        player2.printInfo();
        player3.printInfo();

        Player[] players = new Player[3];
        Player[] players = {player1, player2, player3};

        for(Player player : players) {
            player.printInfo();
        }*/

        Team team = new Team("Beans");
        team.addPlayer(player1);
        team.addPlayer(player2, player3);

        team.printInfo();
    }
}
