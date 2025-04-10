import java.util.Random;

public class HW {
    private static int NumberTask = 1;

    public static void fence() {
        System.out.println("\n--------------------------------------------------------------------------------------------");
        if (NumberTask <= 10) {
            System.out.println("Номер задания: " + NumberTask+"\n");
            NumberTask++;
        } else {
            System.out.println("Все задания выполнены.");
        }
    }

    public static void sayHi() {
        System.out.println("Привет!");
    }

    public static int square(int number) {
        return number * number;
    }

    public static void greetByName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isPositive(int number) {
        if (number > 0) {
            return true;
        }
        return false;
    }

    public static int[] doubleArray(int[] arr) {
        int[] arrMultiply = new int[arr.length];
        System.out.print("\nумноженный массив на 2: ");
        for (int i = 0; i < arrMultiply.length; i++) {
            arrMultiply[i] = arr[i] * 2;
            System.out.print(arrMultiply[i] + " ");
        }
        return arrMultiply;
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        int[] arrSum = new int[arr.length];
        for (int i = 0; i < arrSum.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int a, int b, int c) {
        return (double) (a + b + c) / 3;//просто написал в скобках дабл чтобы жёлтым не подчеркивало,
        //чтобы программа знала, что я ожидаю нецелое число
        //можно и double sum = (a + b + c) / 3;
        //а потом return sum;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
        //долго думал над Local variable 'randomNum' is redundant
        //не мог понять почему работает и говорит, что является избыточной
    }

    public static int[] fillTheArray(int[] arr) {
        int[] arry = new int[arr.length];
        System.out.print("Обычный массив: ");
        for (int i = 0; i < arry.length; i++) {
            arry[i] += i + 1;
            System.out.print(arry[i] + " ");
        }
        return arry;
    }

    public static void main(String[] args) {
//        /*
//        ✅ 1. Метод sayHi()
//        Принимает: ничего
//        Возвращает: void
//        Что делает: выводит "Привет!" в консоль
//        */
//        fence();
//        sayHi();
//        /*
//        ✅ 2. Метод square(int number)
//        Принимает: одно int число
//        Возвращает: int
//        Что делает: возвращает квадрат числа
//        */
//        fence();
//        int numberSecondTask = 3;
//        int resultSecondTask = square(numberSecondTask);
//        System.out.println(resultSecondTask);
//        /*
//        ✅ 3. Метод greetByName(String name)
//        Принимает: строку name
//        Возвращает: void
//        Что делает: печатает "Привет, <имя>!"
//        */
//        fence();
//        String nameThirdTask = "Vova";
//        greetByName(nameThirdTask);
//        /*
//        ✅ 4. Метод sum(int a, int b)
//        Принимает: два int числа
//        Возвращает: int
//        Что делает: возвращает их сумму
//        */
//        fence();
//        int a = 9;
//        int b = 1;
//        int resultFourthTask = sum(a, b);
//        System.out.println(resultFourthTask);
//        /*
//        ✅ 5. Метод isPositive(int number)
//        Принимает: одно int число
//        Возвращает: boolean
//        Что делает: возвращает true, если число положительное
//        */
//        fence();
//        int numberFifthTask = 10;
//        boolean resultFifthTask = isPositive(numberFifthTask);
//        System.out.println(resultFifthTask);
//        /*
//        ✅ 6. Метод doubleArray(int[] arr)
//        Принимает: массив целых чисел
//        Возвращает: новый массив int[]
//        Что делает: возвращает массив, где каждый элемент умножен на 2
//        */
//        fence();
//        int[] arrSixthTask = new int[10];
//        System.out.print("Обычный массив: ");
//        for (int i = 0; i < arrSixthTask.length; i++) {
//            arrSixthTask[i] = i + 1;
//            System.out.print(arrSixthTask[i] + " ");
//        }
//        arrSixthTask = doubleArray(arrSixthTask);
//        System.out.print("\nумноженный массив: ");
//        for (int i = 0; i < arrSixthTask.length; i++) {
//            System.out.print(arrSixthTask[i] + " ");
//        }
//        System.out.println();
//        /*
//        ✅ 7. Метод arraySum(int[] arr)
//        Принимает: массив целых чисел
//        Возвращает: int
//        Что делает: возвращает сумму всех элементов массива
//        */
//        fence();
//        System.out.print("Обычный массив: ");
//        int[] arrSeventhTask = new int[15];
//        for (int i = 0; i < arrSeventhTask.length; i++) {
//            arrSeventhTask[i] = i + 1;
//            System.out.print(arrSeventhTask[i] + " ");
//        }
//        int sumSeventhTask = arraySum(arrSeventhTask);
//        System.out.println("\nСумма всех элементов: " + sumSeventhTask);
//        /*
//        ✅ 8. Метод average(int a, int b, int c)
//        Принимает: три числа
//        Возвращает: double
//        Что делает: возвращает среднее арифметическое
//        */
//        fence();
//        int FirstNumber = 10;
//        int SecondNumber = 16;
//        int ThirdNumber = 8;
//        double sum = average(FirstNumber, SecondNumber, ThirdNumber);
//        System.out.println(sum);
//        /*
//        ✅ 9. Метод isEven(int number)
//        Принимает: одно число
//        Что делает: возвращает true, если число чётное
//        */
//        fence();
//        int numberNinthTask = 10;
//        boolean resoultNinthTask = isEven(numberNinthTask);
//        System.out.println(resoultNinthTask);
//        /*
//        ✅ 10. Метод generateRandomNumber(int min, int max)
//        Принимает: два числа min, max
//        Возвращает: int
//        Что делает: возвращает случайное число от min до max
//        */
//        fence();
//        int minTenthTask = 50;
//        int maxTenthTask = 100;
//        int resultTenthTask = generateRandomNumber(minTenthTask,maxTenthTask);
//        System.out.println(resultTenthTask);


        fence();
        sayHi();//1
        fence();
        int numberSecondTask = 3, a = 9, b = 1, numberFifthTask = 10, numberNinthTask = 10;
        int resultSecondTask = square(numberSecondTask), resultFourthTask = sum(a, b);
        String nameThirdTask = "Vova";
        boolean resultFifthTask = isPositive(numberFifthTask);
        System.out.println(resultSecondTask);//2
        fence();
        greetByName(nameThirdTask);//3
        fence();
        System.out.println(resultFourthTask);//4
        fence();
        System.out.println(resultFifthTask);//5
        fence();
        int[] arrSixthTask = new int[10];//6
        arrSixthTask = fillTheArray(arrSixthTask);//заполнить массив от 1 до arr.length
        arrSixthTask = doubleArray(arrSixthTask);//умножить на 2 каждый элемент массива
        fence();
        int[] arrSeventhTask = new int[15];//7
        arrSeventhTask = fillTheArray(arrSeventhTask);//заполнить массив от 1 до arr.length
        int sumSeventhTask = arraySum(arrSeventhTask);
        System.out.println("\nСумма всех элементов: " + sumSeventhTask);
        fence();
        int FirstNumber = 10, SecondNumber = 16, ThirdNumber = 8;//8
        double sum = average(FirstNumber, SecondNumber, ThirdNumber);
        System.out.println(sum);
        fence();
        boolean resoultNinthTask = isEven(numberNinthTask);//9
        System.out.println(resoultNinthTask);
        fence();
        int minTenthTask = 50, maxTenthTask = 100;//10
        int resultTenthTask = generateRandomNumber(minTenthTask, maxTenthTask);
        System.out.println(resultTenthTask);
        fence();

    }
}