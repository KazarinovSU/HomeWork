import java.util.Random;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
//  - 1 Создать двумерный массив 2x5 и вывести его на экран.
        System.out.println("\n--------------------------------------------------------------------------------------------");
        System.out.println("1. Создать двумерный массив 2x5 и вывести его на экран.\n");
        int[][] firstTask = new int[2][5];                   //создали двумерный массив
        for (int i = 0; i < firstTask.length; i++) {         //первый цикл смотрит длину массива это 2
            System.out.print("     Строка " + i + ": ");     //выводит на экран "строка" и i(номер цикла от 0 до 1 (2<2)=false)
            for (int j = 0; j < firstTask[i].length; j++) {  //второй цикл работает во внутреннем массиве
                firstTask[i][j] = j;                         //сохраняет переменную j во внутренний массив
                System.out.print(firstTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  - 2 Ввести с клавиатуры 2 строки по 3 числа и посчитать сумму всех элементов массива.
        System.out.println("\n2. Ввести с клавиатуры 2 строки по 3 числа и посчитать сумму всех элементов массива.");
        int arrayLength, internalArrayLength, sumSecondTask = 0;
        System.out.print("\n     Введи длину массива. Пример: 2, то будет: { {0} , {1} }\n     Ввод: ");
        arrayLength = scanner.nextInt();
        System.out.print("     Введи внутреннюю длину массива. Пример: 3, то будет: { {0,1,2} , {0,1,2} }\n     Ввод: ");
        internalArrayLength = scanner.nextInt();
        int[][] secondTask = new int[arrayLength][internalArrayLength];
        for (int i = 0; i < secondTask.length; i++) {
            System.out.println("     " + (i + 1) + "й массив:");
            for (int j = 0; j < secondTask[i].length; j++) {
                System.out.print("     индекс [" + j + "] введи число для индекса: ");
                secondTask[i][j] = scanner.nextInt();
                sumSecondTask += secondTask[i][j];
            }
        }
        System.out.println();
        for (int i = 0; i < secondTask.length; i++) {
            System.out.print("     Массив " + (i + 1) + ": {");
            for (int j = 0; j < secondTask[i].length; j++) {
                System.out.print(" " + secondTask[i][j] + " ");
            }
            System.out.println("}");
        }
        System.out.println("\n     Сумма всех элементов: " + sumSecondTask);
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  - 3 Создать двумерный массив 2x4 и вывести все элементы в обратном порядке (от последнего к первому).
        System.out.println("\n3 Создать двумерный массив 2x4 и вывести все элементы в обратном порядке (от последнего к первому).\n");
        int[][] thirdTask = new int[2][4];
        System.out.println("     Создан двумерный массив 2x4:");
        for (int i = 0; i < thirdTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < thirdTask[i].length; j++) {
                thirdTask[i][j] = j;
                System.out.print(thirdTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("     Вывести все элементы в обратном порядке:");
        for (int i = 0; i < thirdTask.length; i++) {
            System.out.print("     ");
            for (int j = thirdTask[i].length - 1; j >= 0; j--) {
                System.out.print(thirdTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  - 4 Заполнить двумерный массив 3x4 числами от 1 до 12 и найти их среднее арифметическое.
        System.out.println("\n4. Заполнить двумерный массив 3x4 числами от 1 до 12 и найти их среднее арифметическое.\n");
        int sumFourthTask = 0, countFourthTask = 0;
        int[][] fourthTask = new int[3][4];
        System.out.println("     Создан двумерный массив 3x4:");
        for (int i = 0; i < fourthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < fourthTask[i].length; j++) {
                fourthTask[i][j] = random.nextInt(12) + 1;
                sumFourthTask += fourthTask[i][j];
                countFourthTask++;
                System.out.print(fourthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n     Сумма всех элементов массива: " + sumFourthTask);
        System.out.println("     Среднее арифметическое: " + (double) sumFourthTask / countFourthTask);
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  - 5 Заполнить двумерный массив 2x5 случайными числами от 0 до 100 и вывести только чётные числа.
        System.out.println("\n5 Заполнить двумерный массив 2x5 случайными числами от 0 до 100 и вывести только чётные числа.\n");
        int[][] FifthTask = new int[2][5];
        System.out.println("     Двумерный массив 2x5 заполнен случайными числами:");
        for (int i = 0; i < FifthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < FifthTask[i].length; j++) {
                FifthTask[i][j] = random.nextInt(100) + 1;
                System.out.print(FifthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("     вывести только чётные числа:");
        for (int i = 0; i < FifthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < FifthTask[i].length; j++) {
                if (FifthTask[i][j] % 2 == 0) {
                    System.out.print(FifthTask[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  - 6 Заполнить двумерный массив 3x5 случайными числами от 1 до 100 и найти максимальное значение.
        System.out.println("\n6. Заполнить двумерный массив 3x5 случайными числами от 1 до 100 и найти максимальное значение.");
        int numMaxsixthTask = 0;
        int[][] sixthTask = new int[3][5];
        System.out.print("\n     двумерный массив 3x5 заполнен случайными числами от 1 до 100:\n");
        for (int i = 0; i < sixthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < sixthTask[i].length; j++) {
                sixthTask[i][j] = random.nextInt(100) + 1;
                System.out.print(sixthTask[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < sixthTask.length; i++) {
            for (int j = 0; j < sixthTask[i].length; j++) {
                if (sixthTask[i][j] > numMaxsixthTask) {
                    numMaxsixthTask = sixthTask[i][j];
                }
            }
        }
        System.out.println("\n     Максимальное значение: " + numMaxsixthTask);
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  - 7 Заполнить двумерный массив 3x5 чётными числами от 2 до 30 по порядку.
        System.out.println("\n7. Заполнить двумерный массив 3x5 чётными числами от 2 до 30 по порядку.");
        int evenNumberSeventhTask = 0;
        int[][] seventhTask = new int[3][5];
        System.out.println("\n     двумерный массив 3x5: ");
        for (int i = 0; i < seventhTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < seventhTask[i].length; j++) {
//                seventhTask[i][j] = (j+1)*2*(i+1);
//                System.out.print(seventhTask[i][j]+" ");
//                сначала думал так..
                evenNumberSeventhTask += 2;
                seventhTask[i][j] = evenNumberSeventhTask;
                System.out.print(seventhTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  - 8 Ввести двумерный массив 2x3 с клавиатуры и посчитать количество положительных элементов.
        System.out.println("\n8. Ввести двумерный массив 2x3 с клавиатуры и посчитать количество положительных элементов.\n");
        int positiveNumbersEighthTask = 0;
        int[][] eighthTask = new int[2][3];
        for (int i = 0; i < eighthTask.length; i++) {
            System.out.println("     " + (i + 1) + "й массив:");
            for (int j = 0; j < eighthTask[i].length; j++) {
                System.out.print("     индекс [" + j + "] введи число для индекса: ");
                eighthTask[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n     Двумерный массив 2x3 с клавиатуры:");
        for (int i = 0; i < eighthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < eighthTask[i].length; j++) {
                System.out.print(" " + eighthTask[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < eighthTask.length; i++) {
            for (int j = 0; j < eighthTask[i].length; j++) {
                if (eighthTask[i][j] > 0) {
                    positiveNumbersEighthTask++;
                }
            }
        }
        System.out.println("     Количество положительных элементов: " + positiveNumbersEighthTask);
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  - 9 Заполнить двумерный массив 2x5 случайными числами от -10 до 10 и вывести только отрицательные числа.
        System.out.println("\n9. Заполнить двумерный массив 2x5 случайными числами от -10 до 10 и вывести только отрицательные числа.\n");
        int[][] ninthTask = new int[2][5];
        System.out.println("     двумерный массив 2x5:");
        for (int i = 0; i < ninthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < ninthTask[i].length; j++) {
                ninthTask[i][j] = random.nextInt(21) - 10;
                System.out.print(ninthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("     Отрицательные числа:");
        for (int i = 0; i < ninthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < ninthTask[i].length; j++) {
                if (ninthTask[i][j] < 0) {
                    System.out.print(ninthTask[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  -10 Создать двумерный массив 2x5 и заменить все нечётные числа на 0.
        System.out.println("\n10 Создать двумерный массив 2x5 и заменить все нечётные числа на 0.\n");
        int[][] tenthTask = new int[2][5];
        System.out.println("     двумерный массив 2x5 от 1 до 5:");
        for (int i = 0; i < tenthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < tenthTask[i].length; j++) {
                tenthTask[i][j] = j + 1;
                System.out.print(tenthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("     все нечётные числа заменены на 0:");
        for (int i = 0; i < tenthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < tenthTask[i].length; j++) {
                if (tenthTask[i][j] % 2 == 0) {
                } else {
                    tenthTask[i][j] = 0;
                }
                System.out.print(tenthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  -11 Заполнить двумерный массив 1x7 случайными числами от 0 до 50 и вывести их сумму.
        System.out.println("\n11. Заполнить двумерный массив 1x7 случайными числами от 0 до 50 и вывести их сумму.");
        System.out.println("\n     двумерный массив 1x7 случайными числами от 0 до 50");
        int numEleventhTask = 0;
        int[][] eleventhTask = new int[1][7];
        for (int i = 0; i < eleventhTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < eleventhTask[i].length; j++) {
                eleventhTask[i][j] = random.nextInt(51);
                System.out.print(eleventhTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < eleventhTask.length; i++) {
            for (int j = 0; j < eleventhTask[i].length; j++) {
                numEleventhTask += eleventhTask[i][j];
            }
        }
        System.out.println("     Сумма элементов массива: " + numEleventhTask);
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  -12 Создать двумерный массив 2x5 и посчитать количество чётных и нечётных элементов.
        System.out.println("\n12 Создать двумерный массив 2x5 и посчитать количество чётных и нечётных элементов.\n");
        System.out.println("     Двумерный массив 2x5:");
        int evenNumberTwelfthTask = 0, oddNumberTwelfthTask = 0, numTwelfthTask = 0;
        int[][] twelfthTask = new int[2][5];
        for (int i = 0; i < twelfthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < twelfthTask[i].length; j++) {
                numTwelfthTask += 1;
                twelfthTask[i][j] = numTwelfthTask;
                System.out.print(twelfthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < twelfthTask.length; i++) {
            for (int j = 0; j < twelfthTask[i].length; j++) {
                if (twelfthTask[i][j] % 2 == 0) {
                    evenNumberTwelfthTask++;
                } else {
                    oddNumberTwelfthTask++;
                }
            }
        }
        System.out.println("     Количество чётных: " + evenNumberTwelfthTask);
        System.out.println("     Количество нечётных: " + oddNumberTwelfthTask);
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  -13 Ввести с клавиатуры двумерный массив 3x5 и найти минимальное значение.
        System.out.println("\n13. Ввести с клавиатуры двумерный массив 3x5 и найти минимальное значение.\n");
        int minNumberThirteenthTask = 1000;
        int[][] ThirteenthTask = new int[3][5];
        for (int i = 0; i < ThirteenthTask.length; i++) {
            System.out.println("     " + (i + 1) + "й Массив");
            for (int j = 0; j < ThirteenthTask[i].length; j++) {
                System.out.print("     индекс [" + j + "] введи число для индекса: ");
                ThirteenthTask[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println("     Двумерный массив 3x5:");
        for (int i = 0; i < ThirteenthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < ThirteenthTask[i].length; j++) {
                System.out.print(ThirteenthTask[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < ThirteenthTask.length; i++) {
            for (int j = 0; j < ThirteenthTask[i].length; j++) {
                if (minNumberThirteenthTask > ThirteenthTask[i][j]) {
                    minNumberThirteenthTask = ThirteenthTask[i][j];
                }
            }
        }
        System.out.println("     Минимальное число: " + minNumberThirteenthTask);
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  -14 Создать двумерный массив 2x4 и заменить все отрицательные числа на их модули.
        System.out.println("\n14. Создать двумерный массив 2x4 и заменить все отрицательные числа на их модули.\n");
        System.out.println("     Двумерный массив 2x4:");
        int[][] FourteenthTask = new int[2][4];
        for (int i = 0; i < FourteenthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < FourteenthTask[i].length; j++) {
                FourteenthTask[i][j] = random.nextInt(21) - 10;
                System.out.print(FourteenthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("     заменить все отрицательные числа на их модули:");
        for (int i = 0; i < FourteenthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < FourteenthTask[i].length; j++) {
                if (FourteenthTask[i][j] < 0) {
                    FourteenthTask[i][j] = -FourteenthTask[i][j];
                }
                System.out.print(FourteenthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  -15 Заполнить двумерный массив 3x4 случайными числами от -20 до 20 и найти произведение всех положительных элементов.
        System.out.println("\n15 Заполнить двумерный массив 3x4 случайными числами от -20 до 20 и найти произведение всех положительных элементов.\n");
        System.out.println("     Двумерный массив 3x4 случайными числами от -20 до 20:");
        int numFifteenthTask = 0;
        int[][] FifteenthTask = new int[3][4];
        for (int i = 0; i < FifteenthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < FifteenthTask[i].length; j++) {
                FifteenthTask[i][j] = random.nextInt(21) - 10;
                System.out.print(FifteenthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < FifteenthTask.length; i++) {
            for (int j = 0; j < FifteenthTask[i].length; j++) {
                if (FifteenthTask[i][j] > 0) {
                    numFifteenthTask += FifteenthTask[i][j];
                }
            }
        }
        System.out.println("     Сумма всех положительных элементов: " + numFifteenthTask);
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  -16 Создать двумерный массив 3x3, заполнить случайными числами от -5 до 5 и вывести индексы всех нулевых элементов.
        System.out.println("\n16 Создать двумерный массив 3x3, заполнить случайными числами от -5 до 5 и вывести индексы всех нулевых элементов.\n");
        int netu = 0;
        int[][] SixteenthTask = new int[3][3];
        System.out.println("     Двумерный массив 3x3, заполнить случайными числами от -5 до 5:");
        for (int i = 0; i < SixteenthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < SixteenthTask[i].length; j++) {
                SixteenthTask[i][j] = random.nextInt(11) - 5;
                System.out.print(SixteenthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("     вывести индексы всех нулевых элементов");
        for (int i = 0; i < SixteenthTask.length; i++) {
            System.out.print("     Строка " + (i + 1));
            netu = 0;
            for (int j = 0; j < SixteenthTask[i].length; j++) {
                if (SixteenthTask[i][j] == 0) {
                    SixteenthTask[i][j] = j;
                    System.out.print(" индекс [" + j + "]");
                    netu++;
                }
            }
            if (netu == 0) {
                System.out.print(" нету ¯\\_(ツ)_/¯");
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  -17 Заполнить двумерный массив 2x5 числами от 1 до 10 и найти сумму элементов с чётными индексами (строка и столбец одновременно чётные).
        System.out.println("\n17. Заполнить двумерный массив 2x5 числами от 1 до 10 и найти сумму элементов с чётными индексами (строка и столбец одновременно чётные).\n");
        System.out.println("     двумерный массив 2x5 числами от 1 до 10:");
        int numSeventeenthTask = 0, sumOfElementsSeventeenthTask = 0;
        int[][] SeventeenthTask = new int[2][5];
        for (int i = 0; i < SeventeenthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < SeventeenthTask[i].length; j++) {
                numSeventeenthTask += 1;
                SeventeenthTask[i][j] = numSeventeenthTask;
                System.out.print(SeventeenthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < SeventeenthTask.length; i++) {
            for (int j = 0; j < SeventeenthTask[i].length; j++) {
                if (j % 2 == 0) {
                    sumOfElementsSeventeenthTask += SeventeenthTask[i][j];
                }
            }
        }
        System.out.println("     сумму элементов: "+sumOfElementsSeventeenthTask);
        System.out.println("\n--------------------------------------------------------------------------------------------");
//  -18 Создать двумерный массив 2x3 и проверить, есть ли в нём хотя бы один отрицательный элемент.
        System.out.println("\n18 Создать двумерный массив 2x3 и проверить, есть ли в нём хотя бы один отрицательный элемент.\n");
        System.out.println("     двумерный массив 2x3:");
        int[][] EighteenthTask = new int[2][3];
        for (int i = 0; i < EighteenthTask.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < EighteenthTask[i].length; j++) {
                EighteenthTask[i][j] = random.nextInt(21) - 10;
                System.out.print(EighteenthTask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < EighteenthTask.length; i++) {
            for (int j = 0; j < EighteenthTask[i].length; j++) {
                if (EighteenthTask[i][j] < 0) {
                    System.out.println("     Есть отрицательный элемент индекс: [" + i + "] " + "[" + j + "] " + "элемент: " + EighteenthTask[i][j]);
                }
            }
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");
    }
}
