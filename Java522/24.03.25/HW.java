import java.util.Random;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Выбери игру:");
        System.out.println("1 - ИГРА УГАДАЙ ЧИСЛО, КОТОРОЕ ЗАГАДАЛ КОМПЬЮТЕР");
        System.out.println("2 - ПОЛЬЗОВАТЕЛЬ ВВОДИТ ЧИСЛО, А КОМПЬЮТЕР ОТГАДЫВАЕТ ЧИСЛО ПОЛЬЗОВАТЕЛЯ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("Введи номер игры: ");
        int play = scanner.nextInt();
        if (play == 1) {
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("-----                   ИГРА УГАДАЙ ЧИСЛО, КОТОРОЕ ЗАГАДАЛ КОМПЬЮТЕР                   -----");
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("Выбери уровень сложности:");
            System.out.println("1 - лёгкий | 2 - средний | 3 - сложный");
            System.out.print("Введи номер уровня: ");
            int lvl = scanner.nextInt();
            if (lvl == 1) {
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("---------------                      ◕‿◕ лёгкий уровень                      ---------------");
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("компьютер загадал число от 1 до 100");
                System.out.println("Правила: Бесконечное количество попыток ввода цифр. Подсказка больше или меньше число.");
                System.out.print("Введите число:");
                int number = scanner.nextInt();
                int attempts1 = 0;
                while (true) {
                    if (number >= 0 && number <= 100) {
                        if (number == num) {
                            attempts1++;
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("Ты угадал число, которое загадал компьютер: " + num);
                            System.out.println("Попыток затрачено на отгадывание числа " + attempts1);
                            break;
                        } else {
                            if (num > number) {
                                System.out.println("Компьютер загадал больше чем " + number);
                                System.out.print("Введите число:");
                                number = scanner.nextInt();
                            } else {
                                System.out.println("Компьютер загадал меньше чем " + number);
                                System.out.print("Введите число:");
                                number = scanner.nextInt();
                            }
                        }
                        attempts1++;
                    } else {
                        System.out.println("Ошибка: Вы ввели больше 100");
                        number = scanner.nextInt();
                    }
                }
            } else if (lvl == 2) {
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("---------------                     □_□ средний уровень                      ---------------");
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("компьютер загадал число от 1 до 100");
                System.out.println("Правила: 20 попыток ввода цифр. Подсказка больше или меньше число.");
                System.out.print("Введите число:");
                int number2 = scanner.nextInt();
                int attempts2 = 0;
                while (true) {
                    if (attempts2 < 20) {
                        if (number2 == num) {
                            attempts2++;
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("Ты угадал число, которое загадал компьютер: " + num);
                            System.out.println("Попыток затрачено на отгадывание числа " + attempts2);
                            break;
                        } else {
                            if (num > number2) {
                                attempts2++;
                                System.out.println("Компьютер загадал больше чем " + number2);
                                System.out.println("попытка " + attempts2 + " | осталось: " + (20 - attempts2));
                                System.out.print("Введите число:");
                                number2 = scanner.nextInt();
                            } else {
                                attempts2++;
                                System.out.println("Компьютер загадал меньше чем " + number2);
                                System.out.println("попытка " + attempts2 + " | осталось: " + (20 - attempts2));
                                System.out.print("Введите число:");
                                number2 = scanner.nextInt();
                            }
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Ты проиграл, попытки закончились 20/20");
                        break;
                    }
                }
            } else {
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("---------------                  ╰(°益°)╯ сложный уровень                    ---------------");
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("компьютер загадал число от 1 до 100");
                System.out.println("Правила: 10 попыток ввода цифр. Подсказок больше или меньше число нет.");
                System.out.print("Введите число:");
                int number3 = scanner.nextInt();
                int attempts3 = 0;
                while (true) {
                    if (attempts3 < 10) {
                        if (number3 == num) {
                            attempts3++;
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("Ты угадал число, которое загадал компьютер: " + num);
                            System.out.println("Попыток затрачено на отгадывание числа " + attempts3);
                            break;
                        } else {
                            if (num > number3) {
                                attempts3++;
                                System.out.println("Компьютер загадал другое число");
                                System.out.println("попытка " + attempts3 + " | осталось: " + (10 - attempts3));
                                System.out.print("Введите число:");
                                number3 = scanner.nextInt();
                            } else {
                                attempts3++;
                                System.out.println("Компьютер загадал другое число");
                                System.out.println("попытка " + attempts3 + " | осталось: " + (10 - attempts3));
                                System.out.print("Введите число:");
                                number3 = scanner.nextInt();
                            }
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Ты проиграл, попытки закончились 10/10");
                        break;
                    }
                }
            }
            scanner.close();
        } else {
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("-----       ПОЛЬЗОВАТЕЛЬ ВВОДИТ ЧИСЛО, А КОМПЬЮТЕР ОТГАДЫВАЕТ ЧИСЛО ПОЛЬЗОВАТЕЛЯ       -----");
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.print("Введи число, которое будет отгадывать компьютер:");
            int a = scanner.nextInt();
            int c = 0;
            while (true) {
                int b = random.nextInt(101);
                if (a==b) {
                    System.out.println("Компьютер отгадал число: " + a);
                    System.out.println("Копьютер отгадал с " + c + " попытки");
                    break;
                } else {
                    System.out.println("Компьтер вводит: " + b);
                }
                c++;
            }
        }
    }
}
//Хотел добавить сообщение, что если пользователь ввёл символы или буквы, то ему отобразиться сообщение, что надо использовать
//только цифры, но понял, что придётся использовать witch, а это case, в целом можно сделать, но использовать придётся чар
//и там значение ломается
