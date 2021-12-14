package lessonFive.homeWork;

public class LessonFive {
    public static void main(String[] args) {
        Employer[] employersArray = new Employer[5];
        employersArray[0] = new Employer("Employer One", "worker", "test@mail.com", "9111111111", 2000, 25);
        employersArray[1] = new Employer("Employer Two", "worker", "test1@mail.com", "9222222222", 2500, 30);
        employersArray[2] = new Employer("Employer Three", "worker", "test2@mail.com", "9333333333", 2250, 40);
        employersArray[3] = new Employer("Employer Four", "worker", "test3@mail.com", "9444444444", 2400, 41);
        employersArray[4] = new Employer("Employer Five", "worker", "test4@mail.com", "9555555555", 2500, 45);

        for(Employer employer : employersArray){
            if (employer.getAge() > 40)
            {
                employer.printInfo();
            }
        }
    }
}