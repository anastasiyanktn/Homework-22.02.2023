public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientsOS = 1;
        if (clientsOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientsOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientsOS = 0;
        short year = 2018;

        if (year < 2015) {
            if (clientsOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientsOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientsOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientsOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");

            }

        }
    }

    public static void task3() {
        System.out.println("Задача 4");
        int deliveryDistance = 189;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется " + days + " день для доставки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется для доставки " + (days + 1) + " дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется для доставки " + (days + 2) + " дня");
        } else {
            System.out.println("Доставки нет");
        }

    }

    public static void task4() {
        System.out.println("Задача 5");
        int monthNumber = 13;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void task5() {
        System.out.println("Задача 3");
        int year = 2024;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}


