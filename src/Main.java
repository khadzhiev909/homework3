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
        int i1 = 50000;
        byte i2 = 110;
        short i3 = 10000;
        long i4 = 300000000;
        float i5 = 5.75f;
        double i6 = 307.3;

        System.out.println("Значение переменной i1 с типом int равно " + i1);
        System.out.println("Значение переменной i2 с типом byte равно " + i2);
        System.out.println("Значение переменной i3 с типом short равно " + i3);
        System.out.println("Значение переменной i4 с типом long равно " + i4);
        System.out.println("Значение переменной i5 с типом float равно " + i5);
        System.out.println("Значение переменной i6 с типом double равно " + i6);


    }

    public static void task2 () {
        System.out.println("Задача 2");

        float l0 = 27.12f;
        long l1 = 987678965549l;
        float l2 = 2.786f;
        int l3 = 569;
        int l4 = -159;
        short l5 = 27897;
        byte l6 = 67;


    }
    public static void task3 () {
        System.out.println("Задача 3");

        byte ludmilaPavlovna = 23;
        byte annaSergevna = 27;
        byte ekaterinaAndreevna = 30;

        int allStudents = ludmilaPavlovna + annaSergevna + ekaterinaAndreevna;

        short paper = 480;

        int paperForStudents = paper / allStudents;
        System.out.println("Каждому студенту достанется " + paperForStudents +  " листов");


    }
    public static void task4 () {
        System.out.println("Задача 4");

        short twentyMin = (20 / 2) * 16;
        short day = ((24 * 60) / 2) * 16;
        int threeDay = ((24 * 3 * 60) / 2) * 16;
        int month = ((30 * 24 * 60) / 2) * 16;



        System.out.println("За 20 минут машина произвела " + twentyMin + " штук бутылок");
        System.out.println("За день машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");


    }
    public static void task5 () {
        System.out.println("Задача 5");

        byte totalCans = 120;

        byte whitePaint = 2;
        byte brownPaint = 4;


        short paints = (byte) (whitePaint + brownPaint);

        int classes = totalCans / paints;

        int totalWhitePaint = whitePaint * classes;
        int totalBrownPaint = brownPaint * classes;

        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

    }
    public static void task6 () {
        System.out.println("Задача 6");

        byte bananaCount = 5;
        byte milkCount = 200 / 100;
        byte iceСreamCount = 2;
        byte eggCount = 4;


        byte bananaGrams = 80;
        byte milkGrams = 105;
        byte iceCreamGrams = 100;
        byte eggGrams = 70;

        int totalGrams = bananaCount * bananaGrams + milkCount * milkGrams + iceСreamCount * iceCreamGrams + eggCount * eggGrams;
        int totalKilo = totalGrams / 1000;

        System.out.println("Граммы: " + totalGrams);
        System.out.println("Килограммы: " + totalKilo);

    }
    public static void task7 () {
        System.out.println("Задача 7");

        short totalGram = 7 * 1000;

        short if250 = 250;
        short if500 = 500;

        short gramInDay250 = (short) (totalGram / if250);
        short gramInDay500 = (short) (totalGram / if500);

        System.out.println("Если будет сбрасывать по 250 грамм, то потребуется " + gramInDay250 + " дней");
        System.out.println("Если будет сбрасывать по 500 грамм, то потребуется " + gramInDay500 + " дней");



    }
    public static void task8 () {
        System.out.println("Задача 8");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        //нынешняя зарплата
        int mashaSalaryForYears = mashaSalary * 365;
        int denisSalaryForYears = mashaSalary * 365;
        int kristinaSalaryForYears = mashaSalary * 365;


        //разница 10 процентов
        int mashaSalaryPr = mashaSalary * 10 / 100;
        int denisSalaryPr = denisSalary * 10 / 100;
        int kristinaSalaryPr = kristinaSalary * 10 / 100;

        int mashaSalaryAfterPr = mashaSalary + mashaSalaryPr;
        int denisSalaryAfterPr = denisSalary + denisSalaryPr;
        int kristinaSalaryAfterPr = kristinaSalary + kristinaSalaryPr;


        System.out.println("Маша теперь получает " + mashaSalaryAfterPr + " рублей. Годовой доход вырос на " + mashaSalaryPr * 365 + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryAfterPr + " рублей. Годовой доход вырос на " + denisSalaryPr * 365 + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryAfterPr + " рублей. Годовой доход вырос на " + kristinaSalaryPr * 365 + " рублей");

    }


}