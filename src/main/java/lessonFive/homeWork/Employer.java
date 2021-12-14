package lessonFive.homeWork;

public class Employer {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employer(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Сотрудник %s (возраст: %d, почта: %s, телефон: %s) занимает должность %s с окладом %d.", fullName, age, email, phone, position, salary);
    }

    public void printInfo(){
        System.out.println(this);
    }

    public int getAge() {
        return age;
    }
}
