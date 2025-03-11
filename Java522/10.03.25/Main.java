import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//SWITCH
//1) Напишите программу, которая проверяет день недели по его номеру
// (1 — Понедельник, 2 — Вторник и т.д.) и выводит название дня недели.
        Scanner scannerChar = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("___________________________________________________________");
        System.out.print("Задания написанные оператором SWITCH: ");
        System.out.print("___________________________________________________________");
        System.out.print("\nВведите номер дня недели: ");
        byte dayOfTheWeek = scanner.nextByte();
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("ОШИБКА: недопустимое значение" + " " + "\"" + dayOfTheWeek + "\"" + " " + "не является днем недели.");
                break;
        }
//2)Напишите программу, которая проверяет, какой месяц по номеру введен пользователем
// (1 — Январь, 2 — Февраль и т.д.) и выводит его название.
        System.out.print("\nВведите номер месяца: ");
        byte month = scanner.nextByte();
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("ОШИБКА: недопустимое значение" + " " + "\"" + month + "\"" + " " + "не является месяцем.");
                break;
        }
//3) Напишите программу, которая проверяет номер счета (от 1 до 5) и выводит текст
// "Выбран первый счет", "Выбран второй счет" и так далее, в зависимости от номера.
        System.out.print("\nВведите номер счёта: ");
        byte bankAccount = scanner.nextByte();
        switch (bankAccount) {
            case 1:
                System.out.println("Выбран первый счет");
                break;
            case 2:
                System.out.println("Выбран второй счет");
                break;
            case 3:
                System.out.println("Выбран третий счет");
                break;
            case 4:
                System.out.println("Выбран четвёртый счет");
                break;
            case 5:
                System.out.println("Выбран пятый счет");
                break;
            default:
                System.out.println("ОШИБКА: номер счёта" + " " + "\"" + bankAccount + "\"" + " " + "не найден.");
                break;
        }
//4) Напишите программу, которая принимает на вход оценку (целое число от 1 до 5) и выводит соответствующую строку:
// "Неудовлетворительно", "Удовлетворительно", "Хорошо", "Отлично".
        System.out.print("\nВведите оценку: ");
        byte schoolGrade = scanner.nextByte();
        switch (schoolGrade) {
            case 1:
                System.out.println("Неудовлетворительно");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("ОШИБКА: оценка" + " " + "\"" + schoolGrade + "\"" + " " + "неидентифицирована.");
                break;
        }
//5) Напишите программу, которая проверяет введенную букву (A-Z) и выводит сообщение о том,
// является ли она гласной (A, E, I, O, U, Y) или согласной.
        System.out.print("\nВведите букву (A-Z): ");
        char alphabetLetter = scanner.next().toUpperCase().charAt(0);
        switch (alphabetLetter) {
            case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u':
                System.out.println("Гласные звуки английского алфавита");
                break;
            case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z',
                 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z':
                System.out.println("Согласные звуки английского алфавита");
                break;
            case 'Y', 'y':
                System.out.println("Буква «Y» может обозначать как согласный, так и гласный звуки (yes, yet, но many, only)");
                break;
            case 'W', 'w':
                System.out.println("Буква «W» самостоятельно означает согласный звук (when, sweet), " +
                        "\nно используется и в составе диграфов, обозначающих гласные звуки (cow, dew, raw и так далее)");
                break;
            default:
                System.out.println("ОШИБКА: Буква" + " " + "\"" + alphabetLetter + "\"" + " " + "неидентифицирована.");
                break;
        }
//6) Напишите программу, которая по введенному символу определяет его тип:
// цифра, буква или специальный символ.
        System.out.print("\nВведите символ, чтобы определить его тип: ");
        char symbol = scannerChar.nextLine().charAt(0);
        switch (symbol) {
            case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z', 'Y',
                 'W', 'A', 'E', 'I', 'O', 'U',
                 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z', 'y',
                 'w', 'a', 'e', 'i', 'o', 'u':
                System.out.println("Буква");
                break;
            case '!', '@', '"', '#', ';', '$'://и тд)
                System.out.println("специальный символ");
                break;
            case '1', '2', '3', '4', '5', '6', '7', '8', '9'://и тд)
                System.out.println("Цифра");
                break;
            default:
                System.out.println("ОШИБКА: я не смог распознать" + " " + "\"" + symbol + "\"" + " " + "(ಥ﹏ಥ).");
                break;
// Единственное, что пришло в голову загнать всё как cимволы в ''
        }
//7) Напишите программу, которая выводит название операционной системы в зависимости от введенного кода:
// 1 — Windows, 2 — Linux, 3 — macOS.
        System.out.print("\nВведи цифру (1-3): ");
        byte operatingSystem = scanner.nextByte();
        switch (operatingSystem) {
            case 1:
                System.out.println("Windows");
                break;
            case 2:
                System.out.println("Linux");
                break;
            case 3:
                System.out.println("macOS");
                break;
            default:
                System.out.println("ОШИБКА: я не смог распознать" + " " + "\"" + operatingSystem + "\"" + " " + "(ಥ﹏ಥ).");
                break;
        }
//8) Напишите программу, которая по введенному возрасту (в годах) выводит категорию человека:
// "Ребенок", "Подросток", "Взрослый", "Пожилой".
        System.out.println("\nВведи возраст для определения возрастной периодизации: ");
        short age = scanner.nextShort();
        switch (age) {
            case 0, 1:
                System.out.println("Младенчество");
                break;
            case 2, 3:
                System.out.println("Ранний возраст");
                break;
            case 4, 5, 6, 7:
                System.out.println("Дошкольный возраст");
                break;
            case 8, 9, 10, 11, 12:
                System.out.println("Младший школьный возраст");
                break;
            case 13, 14, 15:
                System.out.println("Подростковый возраст");
                break;
            case 16, 17, 18, 19, 20:
                System.out.println("Юношеский возраст");
                break;
            case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35:
                System.out.println("Средний возраст 'первый период'");
                break;
            case 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55:
                System.out.println("Средний возраст'второй период'");
                break;
            case 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75:
                System.out.println("Пожилые люди");
                break;
            case 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90:
                System.out.println("Старческий возраст");
                break;
            case 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112,
                 113, 114, 115, 116, 117, 118, 119, 120, 121, 122:
                System.out.println("Долгожители");
                break;
            default:
                System.out.println("ВЫ ПОБИЛИ РЕКОРД: 'старейших людей в мире'＼(º □ º l|l)/");
                break;
        }
//9) Напишите программу, которая по введенному числу месяца (от 1 до 12) выводит сезон года:
// "Зима", "Весна", "Лето", "Осень".
        System.out.println("\nВведи число месяца для вывода сезона года: ");
        byte season = scanner.nextByte();
        switch (season) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("\"ОШИБКА: я не смог распознать " + "\"" + season + "\" " + "месяц");
                break;
        }
//10) Напишите программу, которая по введенному коду валюты (USD, EUR, GBP)
// выводит название валюты на русском языке: "Доллар США", "Евро", "Британский фунт".
        System.out.println("\nВведи код валюты (RUB, USD, EUR, GBP)"); //RUB важная валюта))
        String currency = scanner.next();
        switch (currency) {
            case "RUB":
                System.out.println("Рубли");
                break;
            case "USD":
                System.out.println("Доллар США");
                break;
            case "EUR":
                System.out.println("Евро");
                break;
            case "GBP":
                System.out.println("Британский фунт");
                break;
            default:
                System.out.println("\"ОШИБКА: Валюта " + "\"" + currency + "\" " + "неидифицирована");
                break;
        }
        System.out.print("\n___________________________________________________________");
        System.out.print("Задания написанные оператором IF: ");
        System.out.print("___________________________________________________________");
        System.out.print("\nВНИМАНИЕ извращение кода слабонервным не смотреть (╮°-°)╮┳━━┳ ( ╯°□°)╯ ┻━━┻");
//if
//1) Напишите программу, которая проверяет день недели по его номеру
// (1 — Понедельник, 2 — Вторник и т.д.) и выводит название дня недели.
        System.out.print(" ");
        System.out.print("\nВведите номер дня недели: ");
        byte dayOfTheWeekIf = scanner.nextByte();
        if (dayOfTheWeekIf == 1) {
            System.out.println("Понедельник");
        } else if (dayOfTheWeekIf == 2) {
            System.out.println("Вторник");
        } else if (dayOfTheWeekIf == 3) {
            System.out.println("Среда");
        } else if (dayOfTheWeekIf == 4) {
            System.out.println("четверг");
        } else if (dayOfTheWeekIf == 5) {
            System.out.println("пятница");
        } else if (dayOfTheWeekIf == 6) {
            System.out.println("суббота");
        } else if (dayOfTheWeekIf == 7) {
            System.out.println("воскресенье");
        } else {
            System.out.println("ОШИБКА: недопустимое значение" + " " + "\"" + dayOfTheWeekIf + "\"" + " " + "не является днем недели.");
        }
//2)Напишите программу, которая проверяет, какой месяц по номеру введен пользователем
// (1 — Январь, 2 — Февраль и т.д.) и выводит его название.
        System.out.print("\nВведите номер месяца: ");
        byte monthIf = scanner.nextByte();
        if (monthIf == 1) {
            System.out.println("Январь");
        } else if (monthIf == 2) {
            System.out.println("февраль");
        } else if (monthIf == 3) {
            System.out.println("март");
        } else if (monthIf == 4) {
            System.out.println("апрель");
        } else if (monthIf == 5) {
            System.out.println("май");
        } else if (monthIf == 6) {
            System.out.println("июль");
        } else if (monthIf == 7) {
            System.out.println("июнь");
        } else if (monthIf == 8) {
            System.out.println("август");
        } else if (monthIf == 9) {
            System.out.println("сентябрь");
        } else if (monthIf == 10) {
            System.out.println("октябрь");
        } else if (monthIf == 11) {
            System.out.println("ноябрь");
        } else if (monthIf == 12) {
            System.out.println("декабрь");
        } else {
            System.out.println("ОШИБКА: недопустимое значение" + " " + "\"" + monthIf + "\"" + " " + "не является месяцем.");
        }
//3) Напишите программу, которая проверяет номер счета (от 1 до 5) и выводит текст
// "Выбран первый счет", "Выбран второй счет" и так далее, в зависимости от номера.
        System.out.print("\nВведите номер счёта: ");
        byte bankAccountIf = scanner.nextByte();
        if (bankAccountIf == 1) {
            System.out.println("Выбран первый счет");
        } else if (bankAccountIf == 2) {
            System.out.println("Выбран второй счет");
        } else if (bankAccountIf == 3) {
            System.out.println("Выбран третий счет");
        } else if (bankAccountIf == 4) {
            System.out.println("Выбран четвёртый счет");
        } else if (bankAccountIf == 5) {
            System.out.println("Выбран пятый счет");
        } else {
            System.out.println("ОШИБКА: номер счёта" + " " + "\"" + bankAccountIf + "\"" + " " + "не найден.");
        }
//4) Напишите программу, которая принимает на вход оценку (целое число от 1 до 5) и выводит соответствующую строку:
// "Неудовлетворительно", "Удовлетворительно", "Хорошо", "Отлично".
        System.out.print("\nВведите оценку: ");
        byte schoolGradeIf = scanner.nextByte();
        if (bankAccountIf == 1) {
            System.out.println("Неудовлетворительно");
        } else if (bankAccountIf == 2) {
            System.out.println("Неудовлетворительно");
        } else if (bankAccountIf == 3) {
            System.out.println("Удовлетворительно");
        } else if (bankAccountIf == 4) {
            System.out.println("Хорошо");
        } else if (bankAccountIf == 5) {
            System.out.println("Отлично");
        } else {
            System.out.println("ОШИБКА: оценка" + " " + "\"" + schoolGradeIf + "\"" + " " + "неидентифицирована.");
        }
//5) Напишите программу, которая проверяет введенную букву (A-Z) и выводит сообщение о том,
// является ли она гласной (A, E, I, O, U, Y) или согласной.
        System.out.print("\nВведите букву (A-Z): ");
        char alphabetLetterIf = scanner.next().toUpperCase().charAt(0);
        if (alphabetLetterIf == 'A' && alphabetLetterIf == 'E' && alphabetLetterIf == 'I' && alphabetLetterIf == 'O' && alphabetLetterIf == 'U') {
            System.out.println("Гласные звуки английского алфавита");
        } else if (alphabetLetterIf == 'Y') {
            System.out.println("Буква «Y» может обозначать как согласный, так и гласный звуки (yes, yet, но many, only)");
        } else if (alphabetLetterIf == 'W') {
            System.out.println("Буква «W» самостоятельно означает согласный звук (when, sweet), " +
                    "\nно используется и в составе диграфов, обозначающих гласные звуки (cow, dew, raw и так далее)");
        } else if (alphabetLetterIf == 'B' && alphabetLetterIf == 'C' && alphabetLetterIf == 'D' && alphabetLetterIf == 'F'
                && alphabetLetterIf == 'G' && alphabetLetterIf == 'H' && alphabetLetterIf == 'J' && alphabetLetterIf == 'K'
                && alphabetLetterIf == 'L' && alphabetLetterIf == 'M' && alphabetLetterIf == 'N' && alphabetLetterIf == 'P'
                && alphabetLetterIf == 'Q' && alphabetLetterIf == 'R' && alphabetLetterIf == 'S' && alphabetLetterIf == 'T'
                && alphabetLetterIf == 'V' && alphabetLetterIf == 'X' && alphabetLetterIf == 'Z') {
            System.out.println("Буква «W» самостоятельно означает согласный звук (when, sweet), " +
                    "\nно используется и в составе диграфов, обозначающих гласные звуки (cow, dew, raw и так далее)");
        } else {
            System.out.println("ОШИБКА: я не смог распознать" + " " + "\"" + symbol + "\"" + " " + "(ಥ﹏ಥ).");
        }
//6) Напишите программу, которая по введенному символу определяет его тип:
// цифра, буква или специальный символ.
        System.out.print("\nВведите символ, чтобы определить его тип: ");
        char symbolIf = scannerChar.nextLine().charAt(0);
        if (symbolIf >= 'a' && symbolIf <= 'z') {
            System.out.println(symbolIf + " <=" + " Буква");
        } else if (Character.isDigit(symbolIf)) {
// Хотел запихнуть в '' от 1 до 9 но программа не дала, не устраивает её этот синтекс (。。)
// Потом уже нашёл метод В Java Character. isDigit()
// который возвращает значение true, если переданный символ цифра.
// там-же нашел метод isLetter() возвращает значение true, если переданный символ буква.
// Можно было уже короче оставить, через литер, но решил такой вариант оставить.
            System.out.println(symbolIf + " <=" + " Число");
        } else {
            System.out.println(symbolIf + " <=" + " Символ");
        }
//7) Напишите программу, которая выводит название операционной системы в зависимости от введенного кода:
// 1 — Windows, 2 — Linux, 3 — macOS.
        System.out.print("\nВведи цифру (1-3): ");
        byte operatingSystemIf = scanner.nextByte();
        if (operatingSystemIf == 1) {
            System.out.println("Windows");
        } else if (operatingSystemIf == 2) {
            System.out.println("Linux");
        } else if (operatingSystemIf == 3) {
            System.out.println("macOS");
        } else {
            System.out.println("ОШИБКА: я не смог распознать" + " " + "\"" + operatingSystemIf + "\"" + " " + "(ಥ﹏ಥ).");
        }
//8) Напишите программу, которая по введенному возрасту (в годах) выводит категорию человека:
// "Ребенок", "Подросток", "Взрослый", "Пожилой".
        System.out.println("\nВведи возраст для определения возрастной периодизации: ");
        short ageIf = scanner.nextShort();
        if (ageIf >= 0 && ageIf <= 1) {
            System.out.println("Младенчество");
        } else if (ageIf >= 2 && ageIf <= 3) {
            System.out.println("Ранний возраст");
        } else if (ageIf >= 4 && ageIf <= 7) {
            System.out.println("Дошкольный возраст");
        } else if (ageIf >= 8 && ageIf <= 12) {
            System.out.println("Младший школьный возраст");
        } else if (ageIf >= 13 && ageIf <= 15) {
            System.out.println("Подростковый возраст");
        } else if (ageIf >= 16 && ageIf <= 20) {
            System.out.println("Юношеский возраст");
        } else if (ageIf >= 21 && ageIf <= 35) {
            System.out.println("Средний возраст 'первый период'");
        } else if (ageIf >= 36 && ageIf <= 55) {
            System.out.println("Средний возраст'второй период'");
        } else if (ageIf >= 56 && ageIf <= 75) {
            System.out.println("Пожилые люди");
        } else if (ageIf >= 76 && ageIf <= 90) {
            System.out.println("Старческий возраст");
        } else if (ageIf >= 91 && ageIf <= 122) {
            System.out.println("Долгожители");
        } else {
            System.out.println("ВЫ ПОБИЛИ РЕКОРД: 'старейших людей в мире'＼(º □ º l|l)/");
        }
//9) Напишите программу, которая по введенному числу месяца (от 1 до 12) выводит сезон года:
// "Зима", "Весна", "Лето", "Осень".
        System.out.println("\nВведи число месяца для вывода сезона года: ");
        byte seasonIf = scanner.nextByte();
        if (seasonIf == 12 && seasonIf == 1 && seasonIf == 2) {
            System.out.println("Зима");
        } else if (seasonIf == 3 && seasonIf == 4 && seasonIf == 5) {
            System.out.println("Весна");
        } else if (seasonIf == 6 && seasonIf == 7 && seasonIf == 8) {
            System.out.println("Лето");
        } else if (seasonIf == 9 && seasonIf == 10 && seasonIf == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("\"ОШИБКА: я не смог распознать " + "\"" + seasonIf + "\" " + "месяц");
        }
//Код не работает. Ответ на ошибку ниже
//10) Напишите программу, которая по введенному коду валюты (USD, EUR, GBP)
// выводит название валюты на русском языке: "Доллар США", "Евро", "Британский фунт".
        System.out.println("\nВведи код валюты (RUB, USD, EUR, GBP)"); //RUB важная валюта))
        Scanner scannerif = new Scanner(System.in);
        String currencyIf = scannerif.nextLine().toUpperCase();
        if (currencyIf.equals("RUB")) {
            System.out.println("Рубли");
        } else if (currencyIf.equals("USD")) {
            System.out.println("Доллар США");
        } else if (currencyIf.equals("EUR")) {
            System.out.println("Евро");
        } else if (currencyIf.equals("GBP")) {
            System.out.println("Британский фунт");
        } else {
            System.out.println("\"ОШИБКА: Валюта " + "\"" + currencyIf + "\" " + "неидифицирована");
        }
//Метод .equals в Java не затрагивали ещё, но без него не получиться сравнить два объекта
//"Оператор == сравнивает не свойства объектов, а ссылки" в итоге если использовать .equals RUB/rub => Рубли
//SWITCH + if
        System.out.print("\n___________________________________________________________");
        System.out.print("Задания написанные оператором IF + SWITCH: ");
        System.out.print("___________________________________________________________");
//5) Напишите программу, которая проверяет введенную букву (A-Z) и выводит сообщение о том,
// является ли она гласной (A, E, I, O, U, Y) или согласной.
        System.out.print("\nВведите букву (A-Z): ");
        char alphabetLetterIfSwitch = scanner.next().toUpperCase().charAt(0);
//toUpperCase(): делает заглавную букву "a" => "A".
//charAt(0) берет первый символ этой строки
        switch (alphabetLetterIfSwitch) {
            case 'A', 'E', 'I', 'O', 'U':
                System.out.println(alphabetLetterIfSwitch + " гласный звук английского алфавита");
                break;
            case 'Y':
                System.out.println("Буква «Y» может обозначать как согласный, так и гласный звуки (yes, yet, но many, only)");
                break;
            case 'W':
                System.out.println("Буква «W» самостоятельно означает согласный звук (when, sweet), " +
                        "\nно используется и в составе диграфов, обозначающих гласные звуки (cow, dew, raw и так далее)");
                break;
            default:
                if (alphabetLetterIfSwitch >= 'A' && alphabetLetterIfSwitch <= 'Z') {
                    System.out.println(alphabetLetterIfSwitch + " - Согласный звук английского алфавита");
                } else {
                    System.out.println("ОШИБКА: Буква" + " " + "\"" + alphabetLetterIfSwitch + "\"" + " " + "неидентифицирована.");
                }
                break;
        }
//6) Напишите программу, которая по введенному символу определяет его тип:
// цифра, буква или специальный символ.
        System.out.print("\nВведите символ, чтобы определить его тип: ");
        char symbolIfSwitch = scanner.next().charAt(0);
//scanner.next() считывание только первого слова до пробела. => next() будет читать только первое слово, если там несколько слов.
        switch (Character.getType(symbolIfSwitch)){
//Метод .getType() возвращает одно из следующих значений, каждое из которых обозначает конкретный тип символа.
//В Java Character – это специальный "контейнер" для хранения одного символа, например, буквы или цифры.
            case Character.DECIMAL_DIGIT_NUMBER:
//Character.DECIMAL_DIGIT_NUMBER — десятичная цифра (0-9).
//Создаём кейс если это десятичное число то заходи сюда.
                System.out.println(symbolIfSwitch + " - Цифра");
                break;
            case Character.LOWERCASE_LETTER:
            case Character.UPPERCASE_LETTER:
//Создаём кейс если строчная буква/заглавная буква, то заходи сюда.
//Character.LOWERCASE_LETTER — строчная буква.
//Character.UPPERCASE_LETTER — заглавная буква.
                System.out.println(symbolIfSwitch + " - Буцква");
                break;
            default:
                System.out.println(symbolIfSwitch+ " - специальный символ.");
                break;
        }
    }
}