package lessonSix;

public class LessonSix {
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard("wizard1",0);
        Knight knight1 = new Knight("knight1",0);
        Knight knight2 = new Knight("knight2",0, "muramasa");

        Player bard1 = new Bard("bard1", 0);

        ((Bard)bard1).sign();
        bard1.doAction();

        System.out.println(wizard1);
        System.out.println(knight1);
        System.out.println(knight2);

        wizard1.doAction();
        knight1.doAction();

        Team team = new Team("Chuvachki");
        team.addPlayer(knight1, knight2, wizard1);
        team.printTeamInfo();

        Integer n =1;

/*        Object[] objects = {
                knight1,
                new int[]{1,2,3,4},
                new Random();
                new Scanner(System.in),
                Player.class,
                "Hello, world",
                new Integer(1)
        };

        for (Object object : objects){
            System.out.println(object);
        }*/

        Player[] players = {wizard1, knight1, knight2, bard1};
        for (Player player : players){
            player.doAction();
            System.out.println(player);
/*            if (player instanceof Bard) {
                Bard trueBard = (Bard)player;
                trueBard.sign();
            }*/

            if (player instanceof Bard trueBard) {
                trueBard.sign();
            }
        }
    }

}
