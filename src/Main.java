public class Main {

    public static int calculatingLeapYear(int year) {
        boolean leapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) && (year > 1584);
        if (leapYear == true) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        return year;
    }

    public static int versionChecker(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2024) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2024) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        return clientDeviceYear;
    }

    public static int distanceCalculator(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance<20) {
            deliveryDays = deliveryDays + 1;
            System.out.println(deliveryDistance + "км - это первая зона доставки. Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance<60) {
            deliveryDays = deliveryDays + 2;
            System.out.println(deliveryDistance + "км - это вторая зона доставки. Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance<100) {
            deliveryDays = deliveryDays + 3;
            System.out.println(deliveryDistance + "км - это третья зона доставки. Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("До вас: " + deliveryDistance + "км." + " К сожалению, свыше 100 км доставки нет.");
        }
        return deliveryDistance;
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача 1");
        System.out.println();

        int year = 2024;
        calculatingLeapYear(year);

        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        int clientDeviceYear = 2022;
        int clientOS = 0;
        versionChecker(clientOS, clientDeviceYear);

        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        int deliveryDistance = 95;
        distanceCalculator(deliveryDistance);

        System.out.println();
    }
}