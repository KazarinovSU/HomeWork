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
                countLimit = 50, // countLimit - для лимита ввода попыток
                countLimit2 = 50,
                defeat = 0; // - счёт поражений
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
                    System.out.println("     Побед: " + victory + " | Поражений: " + defeat + "\n");
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
                            System.out.println("                           \uD83C\uDFAF Удачи в угадывании! \uD83C\uDFAF\n");
                            System.out.println("\u001B[37m" + "├────────────────────────────────────────────────────────────────────────────────┤" + "\u001B[0m");
                            System.out.print("                                                                       Ввод: ");
                            numUser = scanner.nextInt();
                            count = 0;
                            countLimit = countLimit2;
                            while (true) {
                                if (isCount == false) {
                                    if (numUser == num) {
                                        count++;
                                        System.out.println("  \uD83C\uDF89Ты угадал загаданное число: [" + num + "]\uD83C\uDF89");
                                        System.out.println("     ты угадал за: " + count + " раз");
                                        victory++;
                                        System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                        break;
                                    } else {
                                        if (clue == true) {
                                            if (num > numUser) {
                                                count++;
                                                System.out.println("  \uD83E\uDD16 Компьютер загадал больше чем: [" + numUser + "]");
                                                System.out.print("                                                                       Ввод: ");
                                                numUser = scanner.nextInt();
                                            } else {
                                                count++;
                                                System.out.println("  \uD83E\uDD16 Компьютер загадал меньше чем: [" + numUser + "]");
                                                System.out.print("                                                                       Ввод: ");
                                                numUser = scanner.nextInt();
                                            }
                                        } else {
                                            if (num > numUser) {
                                                count++;
                                                System.out.println("  \uD83E\uDD16 Компьютер загадал другое число");
                                                System.out.print("                                                                       Ввод: ");
                                                numUser = scanner.nextInt();
                                            } else {
                                                count++;
                                                System.out.println("  \uD83E\uDD16 Компьютер загадал другое число");
                                                System.out.print("                                                                       Ввод: ");
                                                numUser = scanner.nextInt();
                                            }
                                        }
                                    }
                                } else {
                                    if (countLimit>0) {
                                        if (numUser == num) {
                                            count++;
                                            System.out.println("  \uD83C\uDF89Ты угадал загаданное число: [" + num + "]\uD83C\uDF89");
                                            System.out.println("     ты угадал за: " + count + " раз");
                                            victory++;
                                            System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                            break;
                                        } else {
                                            if (clue == true) {
                                                if (countLimit > 0) {
                                                    if (num > numUser) {
                                                        count++;
                                                        countLimit--;
                                                        System.out.println("     Осталось попыток: " + countLimit);
                                                        System.out.println("  \uD83E\uDD16 Компьютер загадал больше чем: [" + numUser + "]");
                                                        System.out.print("                                                                       Ввод: ");
                                                        numUser = scanner.nextInt();
                                                    } else {
                                                        count++;
                                                        countLimit--;
                                                        System.out.println("     Осталось попыток: " + countLimit);
                                                        System.out.println("  \uD83E\uDD16 Компьютер загадал меньше чем: [" + numUser + "]");
                                                        System.out.print("                                                                       Ввод: ");
                                                        numUser = scanner.nextInt();
                                                    }
                                                } else {
                                                    if (num > numUser) {
                                                        count++;
                                                        countLimit--;
                                                        System.out.println("     Осталось попыток: " + countLimit);
                                                        System.out.println("  \uD83E\uDD16 Компьютер загадал другое число");
                                                        System.out.print("                                                                       Ввод: ");
                                                        numUser = scanner.nextInt();
                                                    } else {
                                                        count++;
                                                        countLimit--;
                                                        System.out.println("     Осталось попыток: " + countLimit);
                                                        System.out.println("  \uD83E\uDD16 Компьютер загадал другое число");
                                                        System.out.print("                                                                       Ввод: ");
                                                        numUser = scanner.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("     Вы проиграли!");
                                                defeat++;
                                                break;
                                            }
                                        }
                                    }else {
                                        System.out.println("     Вы проиграли!");
                                        defeat++;
                                        break;
                                    }
                                }
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
                            System.out.println("\u001B[0m" + "     [1] " + "\u001B[34m" + "изменить имя");
                            System.out.println("\u001B[0m" + "     [2] " + "\u001B[34m" + "изменить диапазон рандомного числа");
                            System.out.println("\u001B[0m" + "     [3] " + "\u001B[34m" + "Включить или выключить подсказки");
                            System.out.println("\u001B[0m" + "     [4] " + "\u001B[34m" + "Включить попытки");
                            System.out.println("\u001B[0m" + "     [5] " + "\u001B[34m" + "Назад" + "\u001B[0m");
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
                                    System.out.println("\u001B[0m" + "     [1] " + "\u001B[34m" + "Поменять min");
                                    System.out.println("\u001B[0m" + "     [2] " + "\u001B[34m" + "Поменять max");
                                    System.out.println("\u001B[0m" + "     [3] " + "\u001B[34m" + "Назад" + "\u001B[0m");
                                    System.out.print("\u001B[0m" + "                                                                       Ввод: ");
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
                                System.out.println("\u001B[0m" + "     [1] " + "\u001B[34m" + "Включить подсказки");
                                System.out.println("\u001B[0m" + "     [2] " + "\u001B[34m" + "выключить подсказки" + "\u001B[0m");
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
                                while (true) {
                                    if (isCount == false) {
                                        System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                                        System.out.println("     Попыток сейчас:" + countLimit2 + "\u001B[33m" + " Выключены");
                                        System.out.println("\u001B[0m" + "     [1] " + "\u001B[34m" + "Включить попытки");
                                        System.out.println("\u001B[0m" + "     [2] " + "\u001B[34m" + "выключить попытки");
                                        System.out.println("\u001B[0m" + "     [3] " + "\u001B[34m" + "Изменить диапазон");
                                        System.out.println("\u001B[0m" + "     [4] " + "\u001B[34m" + "назад" + "\u001B[0m");
                                        System.out.print("                                                                       Ввод: ");
                                        numUser = scanner.nextInt();
                                        System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                    } else {
                                        System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                                        System.out.println("     Попыток сейчас:" + countLimit2 + "\u001B[33m" + " Включены");
                                        System.out.println("\u001B[0m" + "     [1] " + "\u001B[34m" + "Включить попытки");
                                        System.out.println("\u001B[0m" + "     [2] " + "\u001B[34m" + "выключить попытки");
                                        System.out.println("\u001B[0m" + "     [3] " + "\u001B[34m" + "Изменить диапазон");
                                        System.out.println("\u001B[0m" + "     [4] " + "\u001B[34m" + "назад" + "\u001B[0m");
                                        System.out.print("                                                                       Ввод: ");
                                        numUser = scanner.nextInt();
                                        System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                    }
                                    if (numUser == 1) {
                                        System.out.println("попытки включены");
                                        isCount = true;
                                    } else if (numUser == 2) {
                                        System.out.println("попытки выключены");
                                        isCount = false;
                                    } else if (numUser == 3) {
                                        System.out.println("\u001B[37m" + "┌────────────────────────────────────────────────────────────────────────────────┐" + "\u001B[0m");
                                        System.out.println("     Попыток сейчас:" + countLimit2);
                                        System.out.println("     Введите новое количество попыток");
                                        System.out.print("                                                                       Ввод: ");
                                        countLimit2 = scanner.nextInt();
                                        System.out.println("     Количество попыток: " + countLimit2);
                                        System.out.println("\u001B[37m" + "└────────────────────────────────────────────────────────────────────────────────┘" + "\u001B[0m");
                                    } else if (numUser == 4) {
                                        break;
                                    } else {
                                        System.out.println("не правильное значение! Используй от [1] до [4]");
                                    }
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
