public class OperationsIf {
    public static void main(String[] args) {
//1) Проверка числа: Напиши программу, которая проверяет, является ли число положительным.
        int a = 1;
        if (a > 0) {
            System.out.println("Число положительно");
        } else if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("число 0");
        }
//2) Чётное или нечётное: Напиши if, который определяет, является ли число чётным.
        int b = 0;
        if (b % 2 == 0) {
            System.out.println("число чётное");
            if (b == 0) {
                System.out.println("на ноль делить нельзя");
            }
        } else {
            System.out.println("число нечётное");
        }
        int e = 0;
        if ((e & 2) == 0) {
            System.out.println("число чётное");
            if (e == 0) {
                System.out.println("на ноль делить нельзя");
            } else {
                System.out.println("число нечётное");
            }
//3) Возрастное ограничение: Если возраст больше или равен 18, вывести "Совершеннолетний", иначе — "Несовершеннолетний".
            int age = 25;
            if (age >= 18) {
                System.out.println("Совершеннолетний");
            } else {
                System.out.println("Несовершеннолетний");
            }
//4) Проверка деления: Вывести "Делится на 3", если число делится на 3 без остатка.
            int number = 11;
            if (number % 3 == 0) {
                System.out.println("Делится на 3");
            } else {
                System.out.println("неделиться");
            }
//5) Температура воды: Если температура больше 100°C, вывести "Кипит", если меньше 0°C — "Замерзает".
            int waterTemperature = -1;
            if (waterTemperature > 100) {
                System.out.println("Кипит");
            } else if (waterTemperature < 0) {
                System.out.println("Замерзает");
            }
//6) Проверка пароля: Если строка password равна "1234", вывести "Доступ разрешен".
            int checkPassword = 1234;
            if (checkPassword == 1234) {
                System.out.println("Доступ разрешен");
            } else {
                System.out.println("доступ запрещён");
            }
//7) Доступ к сайту: Если у пользователя статус "admin", вывести "Добро пожаловать", иначе — "Доступ запрещён".
            boolean admin = true;
            if (admin) {
                System.out.println("Добро пожаловать");
            } else {
                System.out.println("Доступ запрещён");
            }
//8) Проверка времени: Если hour (часы) больше 6 и меньше 22, вывести "Сейчас день", иначе — "Сейчас ночь".
            int hour = 23;
            if (hour > 6 && hour < 22) {
                System.out.println("Сейчас день");
            } else {
                System.out.println("Сейчас ночь");
            }
// 9) Месяцы года: Если month равен 12, 1 или 2, вывести "Зима".
            int month = 6;
            if (month == 12 || month == 1 || month == 2) {
                System.out.println("Зима");
            } else {
                System.out.println("Другое время года");
            }
//10) Минимальное из двух чисел: Написать if, который выводит меньшее из двух чисел c и d.(заменил на C и D)
            int c = 15;
            int d = 19;
            if (c < d) {
                System.out.println(c);
            } else {
                System.out.println(d);
            }
        }
    }
}