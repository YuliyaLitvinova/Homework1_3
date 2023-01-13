public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        short CountStudentsLP = 23;
        short CountStudentsAS = 27;
        short ContStudentsEA = 30;
        int CountPaper = 480;
        int CountPaperPerStudent = CountPaper/(CountStudentsLP+CountStudentsAS+ContStudentsEA);
        System.out.println("На каждого ученика рассчитано " + CountPaperPerStudent+ " листов бумаги ");
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte BottlePer2Minutes = 16;
        byte Minutes_1 = 2;
        int BottlePerMinute = BottlePer2Minutes/Minutes_1;
        int BottlePerDay = BottlePerMinute * 1440;

        int CastomMinutes = 20;
        int BottlePerCastomMinutes = BottlePerMinute*CastomMinutes;

        int CastomDays = 1;
        int BottlePerCastomDays_1 = BottlePerDay*CastomDays;

        int CastomDays_2 = CastomDays +2;
        int BottlePerCastomDays_2 = BottlePerDay*CastomDays_2;

        int CastomDays_3 = CastomDays_2*10;
        int BottlePerMounth = BottlePerDay*CastomDays_3;

        System.out.println("За "+ CastomMinutes+ " минут машина произвела " +BottlePerCastomMinutes+ " бутылок");
        System.out.println("За "+ CastomDays + " сутки машина произвела " +BottlePerCastomDays_1+ " бутылок");
        System.out.println("За "+ CastomDays_2 + " суток машина произвела " +BottlePerCastomDays_2+ " бутылок");
        System.out.println("За "+ CastomDays_3 + " суток машина произвела " +BottlePerMounth+ " бутылок");
        System.out.println();

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int TotalPaint = 120;
        byte WhitePaintPerRoom = 2;
        byte BrownPaintPerRoom = 4;
        int TotalRooms = TotalPaint / (WhitePaintPerRoom+BrownPaintPerRoom);
        int TotalBrownPaint = TotalRooms*BrownPaintPerRoom;
        int TotalWhitePaint = TotalRooms*WhitePaintPerRoom;
        System.out.println("В школе, где "+ TotalRooms+ " классов, нужно " + TotalBrownPaint+ " банок коричневой краски и " + TotalWhitePaint + " банок белой краски.");
        System.out.println();

    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte OneBananaWeight = 80;
        byte OneHundredMlMilkWeight = 105;
        byte OneIcecraemWeight = 100;
        byte OneEggWeight = 70;
        byte CountBananas = 5;
        byte CountMilk = 2;
        byte CountIcecream = 2;
        byte CountEggs = 4;
        double TotalWeightGrams = (OneBananaWeight*CountBananas)+(OneHundredMlMilkWeight*CountMilk+(OneIcecraemWeight*CountIcecream)+(OneEggWeight*CountEggs));
        System.out.println("Общий вес в граммах = "+ TotalWeightGrams + " г");
        double TotalWeightKg = TotalWeightGrams / 1000;
        System.out.println("Общий вес в килограммах = "+ TotalWeightKg + " кг");




        System.out.println();

    }
    public static void task7 () {
        System.out.println("Задача 7");
        System.out.println();

    }
    public static void task8 () {
        System.out.println("Задача 8");
        System.out.println();

    }
}
