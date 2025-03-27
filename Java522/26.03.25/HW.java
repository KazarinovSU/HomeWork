import java.util.Random;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num = 0,// num - рандомное число
                numUser = 0, // numUser - ввод пользователя
                victory = 0, //victory - счёт побед
                min = 5, // min - минимальное значение рандома
                max = 10, // max - максимальное значение рандома
                count, // count - для подсчёта попыток ввода угадать число
                countLimit = 50; // countLimit - для лимита ввода попыток
        String userName = "User";// userName - Имя пользователя
        boolean clue = true,// clue - имя подсказки
                isCount = false;// isCount - включает или выключает попытки
        while (true) {
            System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
            System.out.println("\u001B[33m" + "                            ПРИКЛЮЧЕНИЕ ЖДЁТ\n" + "\u001B[0m");
            System.out.println("\u001B[0m" + "     [1] " + "\u001B[34m" + "ИГРА УГАДАЙ ЧИСЛО, КОТОРОЕ ЗАГАДАЛ КОМПЬЮТЕР" + "\u001B[0m");
            System.out.println("\u001B[0m" + "     [2] " + "\u001B[34m" + "ПОЛЬЗОВАТЕЛЬ ВВОДИТ ЧИСЛО, А КОМПЬЮТЕР ОТГАДЫВАЕТ ЧИСЛО ПОЛЬЗОВАТЕЛЯ" + "\u001B[0m");
            System.out.println("\u001B[37m" + "                                                                  ~beta test~" + "\u001B[0m");
            System.out.println("\u001B[0m" + "     [3] " + "\u001B[34m" + "Закрыть игру" + "\u001B[0m");
            System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
            System.out.print("                                                                       Ввод: ");
            numUser = scanner.nextInt();
            if (numUser == 1) {
                while (true) {
                    num = random.nextInt(max - min + 1) + min;
                    System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                    System.out.println("\u001B[33m" + "                 ИГРА УГАДАЙ ЧИСЛО, КОТОРОЕ ЗАГАДАЛ КОМПЬЮТЕР\n" + "\u001B[0m");
                    System.out.println("     \uD83C\uDFAEИГРОВОЕ МЕНЮ\uD83C\uDFAE");
                    System.out.println("     Игрок: " + userName);
                    System.out.println("     Побед: " + victory + " | Поражений: " + "\n");
                    System.out.println("     Выбери свой путь:");
                    System.out.println("\u001B[0m" + "     [1] " + "\u001B[34m" + "Продолжить" + "\u001B[0m");
                    System.out.println("\u001B[0m" + "     [2] " + "\u001B[34m" + "Начать новую игру" + "\u001B[0m");
                    System.out.println("\u001B[0m" + "     [3] " + "\u001B[34m" + "настройки" + "\u001B[0m");
                    System.out.println("\u001B[0m" + "     [4] " + "\u001B[34m" + "Выход\n" + "\u001B[0m");
                    System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                    System.out.print("                                                                       Ввод: ");
                    numUser = scanner.nextInt();
                    if (numUser == 1) {
                        System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                        System.out.println("     -----Продолжить-----");
                        System.out.println("     в разработке");
                        System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                        break;
                    } else if (numUser == 2) {
                        if (max > min) {
                            System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                            System.out.println("                \uD83C\uDF89 Добро пожаловать в игру \"Угадай число\"! \uD83C\uDF89");
                            System.out.println("        Компьютер загадал число от: [" + min + "]" + " до: [" + max + "]" + " . Попробуйте его угадать!");
                            System.out.println("\u001B[37m" + "├────────────────────────────────────────────────────────────────────────────────┤" + "\u001B[0m");
                            System.out.print("                                                                       Ввод: ");
                            ;
                            numUser = scanner.nextInt();
                            System.out.println("\u001B[37m" + "├────────────────────────────────────────────────────────────────────────────────┤" + "\u001B[0m");
                            System.out.println("                           \uD83C\uDFAF Удачи в угадывании! \uD83C\uDFAF\n");
                            count = 0;
                            while (true) {
                                if (numUser == num) {
                                    System.out.println("  \uD83C\uDF89Ты угадал загаданное число: [" + num + "]\uD83C\uDF89");
                                    System.out.println("     ты угадал за: " + count + " раз");
                                    victory++;
                                    System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                    break;
                                } else {
                                    if (clue == true) {
                                        if (num > numUser) {
                                            System.out.println("  \uD83E\uDD16 Компьютер загадал больше чем: [" + numUser + "]");
                                            System.out.print("                                                                       Ввод: ");
                                            numUser = scanner.nextInt();
                                        } else {
                                            System.out.println("  \uD83E\uDD16 Компьютер загадал меньше чем: [" + numUser + "]");
                                            System.out.print("                                                                       Ввод: ");
                                            numUser = scanner.nextInt();
                                        }
                                    } else {
                                        if (num > numUser) {
                                            System.out.println("  \uD83E\uDD16 Компьютер загадал другое число");
                                            System.out.print("                                                                       Ввод: ");
                                            numUser = scanner.nextInt();
                                        } else {
                                            System.out.println("  \uD83E\uDD16 Компьютер загадал другое число");
                                            System.out.print("                                                                       Ввод: ");
                                            numUser = scanner.nextInt();
                                        }
                                    }
                                }
                                count++;
                            }
                        } else {
                            System.out.println("измени значение max и min");
                            System.out.println("max должен быть больше min");
                            System.out.println("сейчас min [" + min + "]" + " max [" + max + "]");
                        }
                    } else if (numUser == 3) {
                        while (true) {
                            System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                            System.out.println("     \uD83D\uDD27 Настройки");
                            System.out.println("     [1] изменить имя");
                            System.out.println("     [2] изменить диапазон рандомного числа");
                            System.out.println("     [3] Включить или выключить подсказки");
                            System.out.println("     [4] Включить попытки");
                            System.out.println("     [5] Назад");
                            System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                            System.out.print("                                                                       Ввод: ");
                            numUser = scanner.nextInt();
                            if (numUser == 1) {
                                System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                                System.out.println("     \uD83D\uDCDD Изменить имя");
                                System.out.print("                                                             Введи новое имя: ");
                                userName = scanner.next();
                                System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                            } else if (numUser == 2) {
                                while (true) {
                                    System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                                    System.out.println("     \uD83D\uDCDD Поменять диапазон");
                                    System.out.println("     Диапазон [" + min + " - " + max + "]\n");
                                    System.out.println("     [1] Поменять min");
                                    System.out.println("     [2] Поменять max");
                                    System.out.println("     [3] Назад");
                                    System.out.print("                                                                       Ввод: ");
                                    numUser = scanner.nextInt();
                                    System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                    if (numUser == 1) {
                                        System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                                        System.out.println("     Поменять min:");
                                        System.out.print("                                                                       Ввод: ");
                                        min = scanner.nextInt();
                                        System.out.println("     min изменён на: " + min);
                                        System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                    } else if (numUser == 2) {
                                        System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                                        System.out.println("     Поменять max:");
                                        System.out.print("                                                                       Ввод: ");
                                        max = scanner.nextInt();
                                        System.out.println("     max изменён на: " + max);
                                        System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                    } else if (numUser == 3) {
                                        break;
                                    } else {
                                        System.out.println("не правильное значение! Используй от [1] до [3]");
                                    }
                                }
                            } else if (numUser == 3) {
                                System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                                System.out.println("     \uD83D\uDCA1 Включить или выключить подсказки");
                                System.out.println("     [1] Включить подсказки");
                                System.out.println("     [2] выключить подсказки");
                                System.out.print("                                                                       Ввод: ");
                                numUser = scanner.nextInt();
                                System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                if (numUser == 1) {
                                    clue = true;
                                    break;
                                } else if (numUser == 2) {
                                    clue = false;
                                    break;
                                } else {
                                    System.out.println("не правильное значение! Используй от [1] до [2]");
                                }
                            } else if (numUser == 5) {
                                break;
                            } else if (numUser == 4) {
                                System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                                System.out.println("     Попыток сейчас:" +countLimit);
                                System.out.println("     [1] Включить попытки");
                                System.out.println("     [2] выключить попытки");
                                System.out.println("     [3] Изменить диапазон");
                                System.out.println("     [4] назад");
                                System.out.print("                                                                       Ввод: ");
                                numUser = scanner.nextInt();
                                System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                if (numUser == 1) {
                                    System.out.println("попытки включены");
                                    isCount = true;
                                    break;
                                } else if (numUser == 2) {
                                    System.out.println("попытки выключены");
                                    isCount = false;
                                    break;
                                } else if (numUser == 3) {
                                    System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                                    System.out.println("     Попыток сейчас:" +countLimit);
                                    System.out.println("     Введите новое количество попыток");
                                    System.out.print("                                                                       Ввод: ");
                                    countLimit = scanner.nextInt();
                                    System.out.println("     Количество попыток: " + countLimit);
                                    System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                } else if (numUser == 4) {
                                    break;
                                } else {
                                    System.out.println("не правильное значение! Используй от [1] до [4]");
                                }
                            } else {
                                System.out.println("не правильное значение! Используй от [1] до [4]");
                            }
                        }

                    } else if (numUser == 4) {
                        break;
                    } else {
                        System.out.println("не правильное значение! Используй от [1] до [4]");
                    }
                }
            } else if (numUser == 2) {
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("-----       ПОЛЬЗОВАТЕЛЬ ВВОДИТ ЧИСЛО, А КОМПЬЮТЕР ОТГАДЫВАЕТ ЧИСЛО ПОЛЬЗОВАТЕЛЯ       -----");
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.print("Введи число, которое будет отгадывать компьютер:");
                int a = scanner.nextInt();
                int c = 0;
                min = 0;
                max = 100;
                while (true) {
                    int b = random.nextInt(max - min + 1) + min;
                    if (a == b) {
                        System.out.println("Компьютер отгадал число: " + a);
                        System.out.println("Копьютер отгадал с " + c + " попытки");
                        break;
                    } else if (a < b) {
                        System.out.println("Компьтер вводит: " + b);
                    } else {
                        System.out.println("Компьтер вводит: " + b);
                    }
                    c++;
                }
            } else if (numUser == 3) {
                System.out.println("Вы покинули игру");
                break;
            } else {
                System.out.println("не правильное значение! Используй от [1] до [3]");
            }
        }
    }
}

//Хотел добавить сообщение, что если пользователь ввёл символы или буквы, то ему отобразиться сообщение, что надо использовать
//только цифры, но понял, что придётся использовать witch, а это case, в целом можно сделать, но использовать придётся чар
//и там значение ломается
