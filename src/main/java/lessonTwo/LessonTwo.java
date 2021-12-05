package lessonTwo;

public class LessonTwo {
    public static void main(String[] args) {
        checkSum(15, 20);
        isNumberPositive(-20);
        checkNumber(2);
        printString("qwerty", 5);
        isYearLeap(1600);

    }

    public static boolean checkSum (int a, int b) {
       if ( (a+b) >= 10 && (a+b) <=20 ) return true;
        else return false;
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
        if (a>=0) return true;
        else return false;
    }

    public static void printString (String str, int a) {
        while (a>0) {
            System.out.println(str);
            a--;
        }
    }

    public static void isYearLeap (int a) {
        if ((a%4) == 0 && (a%100) != 0) {
        System.out.println("The year "+ a + " is leap");
        } else {
            System.out.println("The year "+ a + " is not leap");
        };
    }

}
