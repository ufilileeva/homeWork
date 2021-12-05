package lessonTwo;

public class LessonTwo {
    public static void main(String[] args) {
        System.out.println(checkSumBetweenTenAndTwenty(15, 20));
        System.out.println(checkSumBetweenTenAndTwenty(15, 5));
        isNumberPositive(-20);
        isNumberPositive(22);
        System.out.println(checkNumber(2));
        System.out.println(checkNumber(0));
        System.out.println(checkNumber(-2));
        printString("qwerty", 5);
        isYearLeap(1600);
        isYearLeap(1601);
        isYearLeap(1604);

    }

    public static boolean checkSumBetweenTenAndTwenty(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void isNumberPositive (int a) {
        if (a >=0) {
            System.out.println("The number " + a + " is positive");
        }
        else {
            System.out.println("The number " + a + " is negative");
        }
    }

    public static boolean checkNumber (int a) {
        return a >= 0;
    }

    public static void printString (String str, int a) {
        while (a>0) {
            System.out.println(str);
            a--;
        }
    }

    public static void isYearLeap (int a) {
        if (a%4 == 0 && a%100 != 0) {
        System.out.println("The year "+ a + " is leap");
        } else {
            System.out.println("The year "+ a + " is not leap");
        }
    }

}
