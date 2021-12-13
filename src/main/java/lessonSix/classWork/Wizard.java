package lessonSix.classWork;

import lessonSix.classWork.Player;

public class Wizard extends Player {
    public Wizard(String nickname, int point) {
        super(nickname, point, "Волшебник");
    }

    @Override
    public void doAction() {
        System.out.println(getProfession() + " " + getNickname() + " make move");
    }
}
