public class Main {

    public static void calculateLeapYear(int year) {
        boolean leapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) && (year > 1584);
        if (leapYear == true) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void suggestVersion(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2024) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2024) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays = deliveryDays + 1;
        } else if (deliveryDistance < 60) {
            deliveryDays = deliveryDays + 2;
        } else if (deliveryDistance < 100) {
            deliveryDays = deliveryDays + 3;
        }
        return deliveryDays;
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача 1");
        System.out.println();

        int year = 2023;
        calculateLeapYear(year);

        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        int clientDeviceYear = 2024;
        int clientOS = 0;
        suggestVersion(clientOS, clientDeviceYear);

        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);

        System.out.println();
    }
}