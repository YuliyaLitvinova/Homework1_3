public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int a = 345000;
        byte b = -3;
        short c = 770;
        long  d = 9000000000000L;
        float  e = 23.123456f;
        double  f = 1074.12345678901234;
        System.out.println("Значение переменной a с типом int = " +a);
        System.out.println("Значение переменной b с типом byte = " +b);
        System.out.println("Значение переменной c с типом short = " +c);
        System.out.println("Значение переменной d с типом long = " +d);
        System.out.println("Значение переменной e с типом float = " +e);
        System.out.println("Значение переменной f с типом double = " +f);
        System.out.println();
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a2 = 27.12f;
        long b2 = 987_678_965_549L;
        double c2 = 2.786;
        short d2 = 569;
        short e2 = -159;
        int f2 = 27897;
        byte g2 = 67;
    }
}
