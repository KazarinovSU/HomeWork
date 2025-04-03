import java.util.Random;
import java.util.Scanner;

public class HW {

    private static final String RESET = "\033[0m";
    private static final String LIGHT_GREY = "\033[90m";
    private static final String ORANGE = "\033[38;5;214m";
    private static final String BLUE = "\033[34m";
    private static final String RED = "\033[31m";
    private static final String GREEN = "\033[32m";

    public static void main(String[] args) {

        System.out.println(LIGHT_GREY + "----------------------------------------------------------------------------------------------" + RESET);
// 1. Создать статический массив из 10 чисел и вывести его на экран.

        System.out.println(ORANGE + "1. Создать статический массив из 10 чисел и вывести его на экран.\n" + RESET + "   a) Первый пример вывод на экран инициализированные чисел в массиве:");
        int[] firstTaskA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("   ");
        for (int i = 0; i < firstTaskA.length; i++) {
            System.out.print(BLUE + firstTaskA[i] + " " + RESET);
        }
        //Первый цикл:
        //i=0<10? - да!
        //Выведи на экран firstTask[i]
        //firstTask[0] = 1
        //В этом примере мы сразу иницилизировали значения от 1 до 10, то есть от 0 индекса массива до 9

        System.out.println("\n   b) Второй пример выводит на экран без инициализации в массиве:");
        System.out.print("   ");
        int[] firstTaskB = new int[10];
        for (int i = 0; i < firstTaskB.length; i++) {
            firstTaskB[i] = i + 1;
        }
        for (int i = 0; i < firstTaskB.length; i++) {
            System.out.print(BLUE + firstTaskB[i] + " " + RESET);
        }
        //Первый цикл:
        //i=0<10? - да!
        //firstTaskB[0] = 0 + 1
        //firstTaskB[0] = 1
        //выведи firstTaskB[i] и сделай пробел
        //firstTaskB[0] 1 + " "
        //и тд.
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 2. Ввести с клавиатуры 5 чисел в статический массив и посчитать их сумму.
        System.out.println(ORANGE + "2. Ввести с клавиатуры 5 чисел в статический массив и посчитать их сумму." + RESET);
        Scanner scanner = new Scanner(System.in);
        int[] secondTask = new int[5];
        for (int i = 0; i < secondTask.length; i++) {
            System.out.print("Веди число для " + BLUE + "[" + i + "]" + RESET + " индекса: ");
            secondTask[i] = scanner.nextInt();
        }
        int sumSecondTask = 0;
        for (int i = 0; i < secondTask.length; i++) {
            sumSecondTask = sumSecondTask + secondTask[i];
        }
        System.out.println("Сумма длины массива на " + BLUE + "5" + RESET + " элементов: " + RED + sumSecondTask + RESET);
        System.out.println(LIGHT_GREY + "----------------------------------------------------------------------------------------------" + RESET);
// 3. Создать статический массив из 8 элементов и вывести его в обратном порядке.
        System.out.println(ORANGE + "3. Создать статический массив из 8 элементов и вывести его в обратном порядке." + RESET);
        int[] thirdTask = new int[8];
        System.out.print("статический массив из " + BLUE + "8" + RESET + " элементов: ");
        for (int i = 0; i < thirdTask.length; i++) {
            thirdTask[i] = i + 1;
            System.out.print(BLUE + thirdTask[i] + " " + RESET);
        }
        System.out.print("\nстатический массив из " + BLUE + "8" + RESET + " элементов в обратном порядке: ");
        for (int i = thirdTask.length - 1; i >= 0; i--) {
            System.out.print(BLUE + thirdTask[i] + " " + RESET);
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 4. Заполнить статический массив из 12 элементов числами от 1 до 12 и найти среднее арифметическое.
        System.out.println(ORANGE + "4. Заполнить статический массив из 12 элементов числами от 1 до 12 и найти среднее арифметическое." + RESET);
        int sumFourthTask = 0;
        int[] fourthTask = new int[12];
        for (int i = 0; i < fourthTask.length; i++) {
            fourthTask[i] = i + 1;
            System.out.print(BLUE + fourthTask[i] + " " + RESET);
        }
        for (int i = 0; i < fourthTask.length; i++) {
            sumFourthTask += fourthTask[i];
        }
        System.out.println("\nРезультат сложения чисел массива: " + RED + sumFourthTask + RESET);
        System.out.println("Среднее арифметическое: " + RED + (double) sumFourthTask / fourthTask.length + RESET);
        System.out.println(LIGHT_GREY + "----------------------------------------------------------------------------------------------" + RESET);
// 5. Заполнить статический массив из 10 элементов случайными числами и вывести только четные числа.
        System.out.println(ORANGE + "5. Заполнить статический массив из 10 элементов случайными числами и вывести только четные числа." + RESET);
        Random random = new Random();
        int[] fifthTask = new int[10];
        System.out.print("Случайные числа " + BLUE + "10" + RESET + " элементов массива: ");
        for (int i = 0; i < fifthTask.length; i++) {
            fifthTask[i] = random.nextInt(100);
            System.out.print(BLUE + fifthTask[i] + " " + RESET);
        }
        System.out.print("\nВывод чётных чисел масива: ");
        for (int i = 0; i < fifthTask.length; i++) {
            if (fifthTask[i] % 2 == 0) {
                System.out.print(BLUE + fifthTask[i] + " " + RESET);
            }
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 6. Заполнить статический массив из 15 элементов случайными числами от 1 до 100 и найти максимальное значение.
        System.out.println(ORANGE + "6. Заполнить статический массив из 15 элементов случайными числами от 1 до 100 и найти максимальное значение." + RESET);
        int numSixthTask = 0;
        int[] sixthTask = new int[15];
        for (int i = 0; i < sixthTask.length; i++) {
            sixthTask[i] = random.nextInt(100) + 1;
            System.out.print(BLUE + sixthTask[i] + " " + RESET);
        }
        System.out.println();
        for (int i = 0; i < sixthTask.length; i++) {
            if (sixthTask[i] > numSixthTask) {
                numSixthTask = sixthTask[i];
            }
            System.out.println(numSixthTask + " Больше " + sixthTask[i]);
        }
        System.out.print("Максимальное значение массива: " + RED + numSixthTask + RESET);
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 7. Заполнить статический массив из 15 элементов четными числами от 2 до 30.
        System.out.println(ORANGE + "7. Заполнить статический массив из 15 элементов четными числами от 2 до 30." + RESET);
        int[] seventhTask = new int[15];
        for (int i = 0; i < seventhTask.length; i++) {
            seventhTask[i] = 2 + i * 2;
            System.out.print(BLUE + seventhTask[i] + " " + RESET);
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 8. Ввести статический массив из 6 чисел и посчитать количество положительных элементов.
        System.out.println(ORANGE + "8. Ввести статический массив из 6 чисел и посчитать количество положительных элементов." + RESET);
        int countEighthTask = 0;
        int[] eighthTask = new int[6];
        for (int i = 0; i < eighthTask.length; i++) {
            eighthTask[i] = random.nextInt(21) - 10;
            System.out.print(BLUE + eighthTask[i] + " " + RESET);
            if (eighthTask[i] > 0) {
                countEighthTask++;
            }
        }
        System.out.println("\nКолличество положительных чисел: " + RED + countEighthTask + RESET);
        System.out.println(LIGHT_GREY + "----------------------------------------------------------------------------------------------" + RESET);
// 9. Заполнить статический массив из 10 элементов случайными числами от -10 до 10 и вывести только отрицательные элементы.
        System.out.println(ORANGE + "9. Заполнить статический массив из 10 элементов случайными числами от -10 до 10 и вывести только отрицательные элементы." + RESET);
        int[] ninthTask = new int[10];
        for (int i = 0; i < ninthTask.length; i++) {
            ninthTask[i] = random.nextInt(20) - 10;//0-10 20-10
            System.out.print(BLUE + ninthTask[i] + " " + RESET);
        }
        System.out.print("\nотрицательные числа: ");
        for (int i = 0; i < ninthTask.length; i++) {
            if (ninthTask[i] < 0) {
                System.out.print(RED + ninthTask[i] + " " + RESET);
            }
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 10. Создать статический массив из 10 элементов и заменить все нечетные числа на 0.
        System.out.print(ORANGE + "10. Создать статический массив из 10 элементов и заменить все нечетные числа на 0." + RESET);
        int[] tenthTask = new int[10];
        System.out.print("\nстатический массив из " + BLUE + "10" + RESET + " элементов: ");
        for (int i = 0; i < tenthTask.length; i++) {
            tenthTask[i] = i + 1;
            if (tenthTask[i] % 2 == 0) {
            } else {
                tenthTask[i] = 0;
            }
            System.out.print(BLUE + tenthTask[i] + " " + RESET);
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 11. Заполнить массив из 7 элементов случайными числами от 0 до 50 и вывести их сумму.
        System.out.println(ORANGE + "11. Заполнить массив из 7 элементов случайными числами от 0 до 50 и вывести их сумму." + RESET);
        int sumEleventhTask = 0;
        int[] eleventhTask = new int[7];
        System.out.print("массив из " + BLUE + "7" + RESET + " элементов c случайными числами от 0 до 50: ");
        for (int i = 0; i < eleventhTask.length; i++) {
            eleventhTask[i] = random.nextInt(50);
            System.out.print(BLUE + eleventhTask[i] + " " + RESET);
        }
        for (int i = 0; i < eleventhTask.length; i++) {
            sumEleventhTask = sumEleventhTask + eleventhTask[i];
        }
        System.out.print("\nСумма массива из " + BLUE + "7" + RESET + " элементов: ");
        System.out.print(RED + sumEleventhTask + RESET);
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 12. Создать массив из 10 элементов и посчитать количество четных и нечетных элементов.
        System.out.println(ORANGE + "12. Создать массив из 10 элементов и посчитать количество четных и нечетных элементов." + RESET);
        System.out.print("массив из " + BLUE + "10" + RESET + " элементов: ");
        int evenNumber = 0;
        int oddNumber = 0;
        int[] twelfthTask = new int[10];
        for (int i = 0; i < twelfthTask.length; i++) {
            twelfthTask[i] = i + 1;
            System.out.print(BLUE + twelfthTask[i] + " " + RESET);
        }
        for (int i = 0; i < twelfthTask.length; i++) {
            if (twelfthTask[i] % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.print("\nКоличество чётных элементов: " + RED + evenNumber + RESET);
        System.out.print("\nКоличество нечётных элементов: " + RED + oddNumber + RESET);
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
//----------------------------------------------------------------------------------------------------------------------
// 13. Заполнить массив из 15 элементов числами, которые вводит пользователь, и найти минимальное значение.
        System.out.print(ORANGE + "13. Заполнить массив из 15 элементов числами, которые вводит пользователь, и найти минимальное значение." + RESET);
        System.out.println("\nТак и не понял :С логику кода оставил");
//        int numThirteenthTask = 0;
//        int[] thirteenthTask = new int[15];
//        for (int i = 0; i < thirteenthTask.length; i++) {
//            System.out.print("Веди число: ");
//            thirteenthTask[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < thirteenthTask.length; i++) {
//            if (thirteenthTask[i] > numThirteenthTask) {
//                numThirteenthTask = thirteenthTask[i];
//            } else {
//                numThirteenthTask = numThirteenthTask;
//            }
//        }
//        System.out.print("МИН знач: " + numThirteenthTask);
//----------------------------------------------------------------------------------------------------------------------
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 14. Создать массив из 8 элементов и заменить все отрицательные числа на их модули.
        System.out.print(ORANGE + "14. Создать массив из 8 элементов и заменить все отрицательные числа на их модули." + RESET);
        int[] fourteenthTask = new int[8];
        System.out.print("\nМассив из " + BLUE + "8" + RESET + " элементов: ");
        for (int i = 0; i < fourteenthTask.length; i++) {
            fourteenthTask[i] = random.nextInt(20) - 10;
            System.out.print(BLUE + fourteenthTask[i] + " " + RESET);
        }
        System.out.print("\nВсе отрицательные числа поменяны на их модули: ");
        for (int i = 0; i < fourteenthTask.length; i++) {
            if (fourteenthTask[i] < 0) {
                fourteenthTask[i] = -fourteenthTask[i];
                System.out.print(RED + fourteenthTask[i] + " " + RESET);
            } else {
                System.out.print(BLUE + fourteenthTask[i] + " " + RESET);
            }
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 15. Заполнить массив из 12 элементов случайными числами от -20 до 20 и вывести произведение всех положительных элементов.
        System.out.println(ORANGE + "15. Заполнить массив из 12 элементов случайными числами от -20 до 20 и вывести произведение всех положительных элементов." + RESET);
        int sumFifteenthTask = 0;
        int[] fifteenthTask = new int[12];
        System.out.print("Массив из " + BLUE + "12" + RESET + " элементов заполнен случайными числами от -20 до 20: ");
        for (int i = 0; i < fifteenthTask.length; i++) {
            fifteenthTask[i] = random.nextInt(40) - 20;
            System.out.print(BLUE + fifteenthTask[i] + " " + RESET);
        }
        System.out.print("\nПроизведение всех положительных элементов: ");
        for (int i = 0; i < fifteenthTask.length; i++) {
            if (fifteenthTask[i] > 0) {
                sumFifteenthTask += fifteenthTask[i];
            }
        }
        System.out.print(RED + sumFifteenthTask + RESET);
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 16. Создать массив из 9 элементов и вывести индексы всех нулевых элементов.
        System.out.println(ORANGE + "16. Создать массив из 9 элементов и вывести индексы всех нулевых элементов." + RESET);
        System.out.print("Массив из " + BLUE + "9" + RESET + " элементов: ");
        int[] sixteenthTask = new int[9];
        for (int i = 0; i < sixteenthTask.length; i++) {
            sixteenthTask[i] = random.nextInt(6) - 3;
            System.out.print(BLUE + sixteenthTask[i] + " " + RESET);
        }
        System.out.print("\nИндексы нулевых элементов: ");
        for (int i = 0; i < sixteenthTask.length; i++) {
            if (sixteenthTask[i] == 0) {
                System.out.print(RED + "[" + i + "] " + RESET);
            }
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 17. Заполнить массив из 10 элементов последовательностью 1, 2, 3, 4, ..., 10 и вывести сумму элементов с четными индексами.
        System.out.print(ORANGE + "17. Заполнить массив из 10 элементов последовательностью 1, 2, 3, 4, ..., 10 и вывести сумму элементов с четными индексами." + RESET);
        int sumSeventeenthTask = 0;
        int[] seventeenthTask = new int[10];
        System.out.print("\nмассив из " + BLUE + "10" + RESET + " элементов последовательностью от 1 до 10: ");
        for (int i = 0; i < seventeenthTask.length; i++) {
            seventeenthTask[i] = i + 1;
            System.out.print(BLUE + seventeenthTask[i] + " " + RESET);
        }
        for (int i = 0; i < seventeenthTask.length; i++) {
            if (seventeenthTask[i] % 2 == 0) {
                sumSeventeenthTask += i;
            }
        }
        System.out.print("\nСумму элементов с четными индексами: " + RED + sumSeventeenthTask + RESET);
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 18. Создать массив из 6 элементов и проверить, есть ли в нем хотя бы один отрицательный элемент.
        System.out.println(ORANGE + "18. Создать массив из 6 элементов и проверить, есть ли в нем хотя бы один отрицательный элемент." + RESET);
        System.out.print("массив из " + BLUE + "6" + RESET + " элементов: ");
        int[] eighteenthTask = new int[6];
        for (int i = 0; i < eighteenthTask.length; i++) {
            eighteenthTask[i] = random.nextInt(6) - 3;
            System.out.print(BLUE + eighteenthTask[i] + " " + RESET);
        }
        System.out.print("\nОтрицательные элементы: ");
        for (int i = 0; i < eighteenthTask.length; i++) {
            if (eighteenthTask[i] < 0) {
                System.out.print(RED + eighteenthTask[i] + " " + RESET);
            }
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 19. Заполнить массив из 11 элементов числами от 11 до 1 в обратном порядке.
        System.out.println(ORANGE + "19. Заполнить массив из 11 элементов числами от 11 до 1 в обратном порядке." + RESET);
        int[] nineteenthTask = new int[11];
        System.out.print("массив из " + BLUE + "11" + RESET + " элементов числами от 11 до 1: ");
        for (int i = nineteenthTask.length - 1; i >= 0; i--) {
            nineteenthTask[i] = i + 1;
            System.out.print(BLUE + nineteenthTask[i] + " " + RESET);
        }
        System.out.print("\nВ обратном порядке: ");
        for (int i = 0; i < nineteenthTask.length; i++) {
            System.out.print(RED + nineteenthTask[i] + " " + RESET);
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 20. Создать массив из 5 элементов, заполнить его случайными числами и определить, сколько элементов больше среднего арифметического.
        System.out.print(ORANGE + "20. Создать массив из 5 элементов, заполнить его случайными числами и определить, сколько элементов больше среднего арифметического." + RESET);
        int sumTwentyTask = 0, arithmeticMean = 0, counterTwentyTask = 0;
        System.out.print("\nМассив из " + BLUE + "5" + RESET + " элементов: ");
        int[] twentyTask = new int[5];
        for (int i = 0; i < twentyTask.length; i++) {
            twentyTask[i] = random.nextInt(10) + 1;
            System.out.print(BLUE + twentyTask[i] + " " + RESET);
        }
        System.out.print("\nСумма из " + BLUE + "5" + RESET + " элементов: ");
        for (int i = 0; i < twentyTask.length; i++) {
            sumTwentyTask += twentyTask[i];
        }
        System.out.print(RED + sumTwentyTask + RESET);
        arithmeticMean += sumTwentyTask / twentyTask.length;
        System.out.print("\nСреднее арифметическое: " + RED + (double) arithmeticMean + RESET);
        System.out.print("\nсколько элементов больше среднего арифметического: ");
        for (int i = 0; i < twentyTask.length; i++) {
            if (twentyTask[i] > arithmeticMean) {
                counterTwentyTask++;
            }
        }
        System.out.print(RED + counterTwentyTask + RESET);
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 21. Заполнить массив из 10 элементов кубами индексов (0, 1, 8, 27, ...).
        System.out.println(ORANGE + "21. Заполнить массив из 10 элементов кубами индексов (0, 1, 8, 27, ...)." + RESET);
        int[] twentyFirstTask = new int[10];
        System.out.print("массив из " + BLUE + "10" + RESET + " элементов заполненный кубами индексов: ");
        for (int i = 0; i < twentyFirstTask.length; i++) {
            twentyFirstTask[i] = i * i * i;
            System.out.print(RED + twentyFirstTask[i] + " " + RESET);
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 22. Создать массив из 7 элементов и посчитать, сколько раз в нем меняется знак числа при переходе от элемента к элементу.
        System.out.print(ORANGE + "22. Создать массив из 7 элементов и посчитать, сколько раз в нем меняется знак числа при переходе от элемента к элементу." + RESET);
        int[] twentySecondTask = new int[7];
        int countTwentySecondTask = 0;
        System.out.print("\nмассив из " + BLUE + "7" + RESET + " элементов: ");
        for (int i = 0; i < twentySecondTask.length; i++) {
            twentySecondTask[i] = random.nextInt(6) - 3;
            System.out.print(BLUE + twentySecondTask[i] + " " + RESET);
        }
        for (int i = 1; i < twentySecondTask.length; i++) {
            if (
                    (twentySecondTask[i - 1] > 0 && twentySecondTask[i] < 0) || (twentySecondTask[i - 1] < 0 && twentySecondTask[i] > 0)
            ) {
                countTwentySecondTask++;
            }
        }
        System.out.print("\nЗнак меняется: " + RED + countTwentySecondTask + RESET + " раз");
        System.out.print(LIGHT_GREY + "\n   Работает пока не зарандомит 0 поскольку он в не диапозона 0>0 and 0<0" + RESET);
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 23. Заполнить массив из 12 элементов случайными числами от 1 до 100 и вывести числа, кратные 5.
        System.out.println(ORANGE + "23. Заполнить массив из 12 элементов случайными числами от 1 до 100 и вывести числа, кратные 5." + RESET);
        int[] twentyThirdTask = new int[12];
        System.out.print("массив из " + BLUE + "12" + RESET + " элементов случайными числами от 1 до 100: ");
        for (int i = 0; i < twentyThirdTask.length; i++) {
            twentyThirdTask[i] = random.nextInt(100) + 1;
            System.out.print(BLUE + twentyThirdTask[i] + " " + RESET);
        }
        System.out.print("\nчисла кратные " + BLUE + "5" + RESET + ": ");
        for (int i = 0; i < twentyThirdTask.length; i++) {
            if (twentyThirdTask[i] % 5 == 0) {
                System.out.print(RED + twentyThirdTask[i] + " " + RESET);
            }
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 24. Создать массив из 9 элементов и поменять местами первый и последний элементы.
        System.out.println(ORANGE + "24. Создать массив из 9 элементов и поменять местами первый и последний элементы." + RESET);
        int numberTwentyFourTask = 0;
        int[] twentyFourTask = new int[9];
        System.out.print("массив из " + BLUE + "9" + RESET + " элементов: ");
        for (int i = 0; i < twentyFourTask.length; i++) {
            twentyFourTask[i] = i + 1;
            numberTwentyFourTask = twentyFourTask[0];
            System.out.print(BLUE + twentyFourTask[i] + " " + RESET);
        }
        System.out.print("\nпоменять местами первый и последний элементы: ");
        twentyFourTask[0] = twentyFourTask[8];
        twentyFourTask[8] = numberTwentyFourTask;

        System.out.print(RED + twentyFourTask[0] + " " + RESET);
        System.out.print(BLUE + twentyFourTask[1] + " " + RESET);
        System.out.print(BLUE + twentyFourTask[2] + " " + RESET);
        System.out.print(BLUE + twentyFourTask[3] + " " + RESET);
        System.out.print(BLUE + twentyFourTask[4] + " " + RESET);
        System.out.print(BLUE + twentyFourTask[5] + " " + RESET);
        System.out.print(BLUE + twentyFourTask[6] + " " + RESET);
        System.out.print(BLUE + twentyFourTask[7] + " " + RESET);
        System.out.print(RED + twentyFourTask[8] + " " + RESET);
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 25. Заполнить массив из 8 элементов случайными числами и найти разницу между максимальным и минимальным элементами.
        System.out.println(ORANGE + "25. Заполнить массив из 8 элементов случайными числами и найти разницу между максимальным и минимальным элементами." + RESET);
        System.out.println("так и не разобрался как найти минимальное значение:С");
//----------------------------------------------------------------------------------------------------------------------
//        System.out.print("\n массив из 8 элементов случайными числами: ");
//        int sumMaxTwentyFiveTask = 0, sumMinTwentyFiveTask = 0;
//        int[] twentyFiveTask = new int[8];
//        for (int i = 0; i < twentyFiveTask.length; i++) {
//            twentyFiveTask[i] = random.nextInt(10) + 1;
//            System.out.print(twentyFiveTask[i] + " ");
//        }
//        for (int i = 0; i < twentyFiveTask.length; i++) {
//            if (twentyFiveTask[i] > sumMaxTwentyFiveTask) {
//                sumMaxTwentyFiveTask += twentyFiveTask[i];
//            }
//        }
//        System.out.print("\nМаксимальное число: " + sumMaxTwentyFiveTask);
//        for (int i = 0; i < twentyFiveTask.length-1; i++) {
//            if (twentyFiveTask[i] > sumMinTwentyFiveTask && twentyFiveTask[i] < twentyFiveTask[i + 1]) {
//                sumMinTwentyFiveTask = twentyFiveTask[i];
        // какое-то условие, но какое..
//            }
//        }
//        System.out.print("\nМинимальное число: " + sumMinTwentyFiveTask);
//----------------------------------------------------------------------------------------------------------------------
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 26. Создать массив из 10 элементов и посчитать, сколько элементов равны заданному числу.
        System.out.println(ORANGE + "26. Создать массив из 10 элементов и посчитать, сколько элементов равны заданному числу." + RESET);
        int numScanerUser = 0, countTwentySixTask = 0;
        System.out.println("Сравниваем число, которое вы ввели с теми, что сгенерировал рандом.\nГлавное условие ведите число от " + GREEN + "[0]" + RESET + " до " + GREEN + "[10]" + RESET + " Рандом генерирует от " + BLUE + "1" + RESET + " до " + BLUE + "10" + RESET);
        System.out.print("Введи число:");
        numScanerUser = scanner.nextInt();
        System.out.print("массив из " + BLUE + "10" + RESET + " элементов: ");
        int[] twentySixTask = new int[10];
        for (int i = 0; i < twentySixTask.length; i++) {
            twentySixTask[i] = random.nextInt(10) + 1;
            System.out.print(BLUE + twentySixTask[i] + " " + RESET);
        }
        System.out.print("\nКоличество элементов равные заданному числу: ");
        for (int i = 0; i < twentySixTask.length; i++) {
            if (twentySixTask[i] == numScanerUser) {
                countTwentySixTask++;
            }
        }
        System.out.print(RED + countTwentySixTask + RESET);
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 27. Заполнить массив из 6 элементов квадратами чисел от 1 до 6.
        System.out.println(ORANGE + "27. Заполнить массив из 6 элементов квадратами чисел от 1 до 6." + RESET);
        System.out.print("массив из " + BLUE + "6" + RESET + " элементов заполнен квадратами чисел от 1 до 6: ");
        int[] twentySevenTask = new int[6];
        for (int i = 1; i < twentySevenTask.length; i++) {
            twentySevenTask[i] = i * i * i;
            System.out.print(RED + twentySevenTask[i] + " " + RESET);
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 28. Создать массив из 9 элементов и заменить каждый элемент на противоположный по знаку.
        System.out.println(ORANGE + "28. Создать массив из 9 элементов и заменить каждый элемент на противоположный по знаку." + RESET);
        int[] twentyEightTask = new int[9];
        System.out.print("массив из " + BLUE + "9" + RESET + " элементов: ");
        for (int i = 0; i < twentyEightTask.length; i++) {
            twentyEightTask[i] = random.nextInt(6) - 3;
            System.out.print(BLUE + twentyEightTask[i] + " " + RESET);
        }
        System.out.print("\nзаменены элементы на противоположный знак: ");
        for (int i = 0; i < twentyEightTask.length; i++) {
            twentyEightTask[i] = -twentyEightTask[i];
            System.out.print(RED + twentyEightTask[i] + " " + RESET);
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 29. Заполнить массив из 12 элементов так, чтобы значения элементов с четными индексами были равны 0, а с нечетными индексами - равны их индексам.
        System.out.println(ORANGE + "29. Заполнить массив из 12 элементов так, чтобы значения элементов с четными индексами были равны 0, а с нечетными индексами - равны их индексам." + RESET);
        System.out.print("массив на " + BLUE + "12" + RESET + " элементов: ");
        int[] twentyNineTask = new int[12];
        for (int i = 0; i < twentyNineTask.length; i++) {
            twentyNineTask[i] = i;
            System.out.print(BLUE + twentyNineTask[i] + " " + RESET);
        }
        System.out.print("\nИтог задания: ");
        for (int i = 0; i < twentyNineTask.length; i++) {
            if (twentyNineTask[i] % 2 == 0) {
                twentyNineTask[i] = 0;
            }
            System.out.print(RED + twentyNineTask[i] + " " + RESET);
        }
        System.out.println(LIGHT_GREY + "\n----------------------------------------------------------------------------------------------" + RESET);
// 30. Создать массив из 10 элементов и найти сумму элементов, стоящих на позициях, кратных 3.
        System.out.println(ORANGE+"30. Создать массив из 10 элементов и найти сумму элементов, стоящих на позициях, кратных 3."+RESET);
        System.out.print("массив из "+BLUE+"10"+RESET+" элементов: ");
        int sumThirtyTask = 0;
        int[] thirtyTask = new int[10];
        for (int i = 0; i < thirtyTask.length; i++) {
            thirtyTask[i] = random.nextInt(3) + 1;
            System.out.print(BLUE+thirtyTask[i] + " "+RESET);
        }
        System.out.print("\nсумма элементов, стоящих на позициях, кратных 3: ");
        for (int i = 0; i < thirtyTask.length; i++) {
            if (i % 3 == 0) {
                sumThirtyTask += thirtyTask[i];
            }
        }
        System.out.println(RED+sumThirtyTask+RESET);
        System.out.println(LIGHT_GREY + "----------------------------------------------------------------------------------------------" + RESET);
    }
}
