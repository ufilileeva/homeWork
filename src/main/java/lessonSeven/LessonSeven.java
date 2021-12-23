package lessonSeven;

public class LessonSeven {
    public static void main(String[] args) {
        Cat cat = new Cat("Bagel");
        Plate plate = new Plate(10);

        plate.printInfo();

        cat.eat(plate);

        while (plate.getFoodCount() > 0){
            cat.eat(plate);
            plate.printInfo();
            Thread.sleep(3000);
        }
    }
}
