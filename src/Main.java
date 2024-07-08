public class Main {
    public static void main(String[] args) {
        // exercise 1
        int number = Integer.MAX_VALUE;
        byte minNumber = Byte.MAX_VALUE;
        short middleNumber = Short.MAX_VALUE;
        long maxNumber = Long.MAX_VALUE;
        float average = Float.MAX_VALUE;
        double averageD = Double.MAX_VALUE;
        System.out.println("Значение int: " + number);
        System.out.println("Значение byte: " + minNumber);
        System.out.println("Значение short: " + middleNumber);
        System.out.println("Значение long: " + maxNumber);
        System.out.println("Значение float: " + String.format("%.2f", average));
        System.out.println("Значение double: " + averageD);

        // exercise 2
        float a = 27.12f;
        long b = 987678965549l;
        float c = 3.278f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println();

        //exercise 3
        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short sumSheets = 480;

        byte sumPupil = (byte) (firstTeacher + secondTeacher + thirdTeacher);
        float result = (float) (sumSheets / sumPupil);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги.");

        // exercise 4
        System.out.println();
        byte productivity = 16 / 2; // продуктивность в 1 минуту
        short twentyMin = (short) (productivity * 20);
        short oneDay = (short) (productivity * 60 * 24);
        int threeDays = oneDay * 3;
        int oneMonth = oneDay * 30;
        System.out.println("За 20 минут  машина произвела " + twentyMin +  " штук бутылок");
        System.out.println("За 1 день  машина произвела " + oneDay +  " штук бутылок");
        System.out.println("За 3 дня  машина произвела " + threeDays +  " штук бутылок");
        System.out.println("За месяц  машина произвела " + oneMonth +  " штук бутылок");

        //exercise 5
        System.out.println();
        byte sumPaint = 120;
        byte oneClass = 4 + 2;
        byte sumClass = (byte) (sumPaint / oneClass);
        byte brown = (byte) (sumClass * 4);
        byte white = (byte) (sumClass * 2);
        System.out.println("В школе, где " + sumClass + " классов нужно " + brown + " коричневых " +
                white + " белых банок краски");

        //exercise 6
        System.out.println();
        short bananas = 5 * 80;
        short milk = 100 * 105;
        short iceCream = 2 * 100;
        short egg = 4 * 70;
        short breakFast = (short) (bananas + milk + iceCream +egg);
        float breakFastKG = breakFast / 1000f;
        System.out.println(breakFast + " грамм или " + breakFastKG + " кг");

        //exercise 7
        System.out.println();
        short loseWeight250 = 250;
        short loseWeight500 = 500;
        short needWeight = 7000;

        float daysLose250 = (float) (needWeight / loseWeight250);
        float daysLose500 = (float) (needWeight / loseWeight500);
        float daysAverage = (daysLose250 + daysLose500) / 2;

        System.out.println("Если по 250гр.: " + daysLose250 + " дней \n" +
                "Если по 500гр.: " + daysLose500 + " дней \n" +
                "Среднее: " + daysAverage + " дней");

        //exercise 8
        System.out.println();
        float salaryMasha = 67760.00f;
        float salaryDenis = 83690.00f;
        float salaryKristina = 76230.00f;

        float salaryMashaUp = (salaryMasha * 1.1f);
        float salaryDenisUp = (salaryDenis * 1.1f);
        float salaryKristinaUp = (salaryKristina * 1.1f);

        float salaryDifferenceMasha = salaryMashaUp - salaryMasha;
        float salaryDifferenceDenis = salaryDenisUp - salaryDenis;
        float salaryDifferenceKristina = salaryKristinaUp - salaryKristina;

        System.out.println("Будет получать Маша: " + salaryMashaUp + " рублей. Доход вырос на " + salaryDifferenceMasha + " рублей \n" +
                "Будет получать Денис: " + salaryDenisUp + " рублей. Доход вырос на " + salaryDifferenceDenis + " рублей \n" +
                "Будет получать Кристина: " + salaryKristinaUp + " рублей. Доход вырос на " + salaryDifferenceKristina + " рублей \n");


    }

}