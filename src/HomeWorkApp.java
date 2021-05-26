public class HomeWorkApp {
    public static void main (String[] args){
        System.out.println(sumIsInRange10and20(18,12));
        intNumber(17);
        System.out.println(intNumber2(-15));
        printString("Привет", 5);
        int year = 1900;
        System.out.println("Год " + year + " - високосный: " + isLeapYear(year));

    }

    //Задание 1
    public static boolean sumIsInRange10and20(int a, int b) {
        int sum = a + b;
        return (sum >= 10) && (sum <= 20);
    }

    //Задание 2
    public static void intNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //Задание 3
    public static boolean intNumber2(int number) {
        return number <= 0;
    }
    //Задание 4
    public static void printString(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
    //Задание 5
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
