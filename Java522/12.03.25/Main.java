import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 Вывести числа от 10 до 1 в обратном порядке.
        System.out.println("\n---------------------------Вывести числа от 10 до 1 в обратном порядке---------------------------");
        for (int i = 10; i > 0; i--) {
            System.out.println("i - " + i);
        }
//Вводим значения от 10 до 1
        System.out.println("\n---------------------------Нечётные числа от 1 до 50---------------------------");
        //2 Вывести все нечётные числа от 1 до 50.
        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0) {
            } else {
                System.out.println("i - " + i);
            }
        }
//Вводим значения от 1 до 50
//При помощи оператора if создаём условие "если i делиться без остатка на 0" то это чётные числа. (True)
//Используем else альтернативное действие, если условие ложное.
//Таким образом мы просим вывести оставшиеся числа от 1 до 50 которые не попали в условие if
//Следовательно это нечётные числа
        System.out.println("\n---------------------------сумму всех чётных чисел от 1 до N.---------------------------");
        //3 Посчитать сумму всех чётных чисел от 1 до N.
        System.out.print("Введи число: ");
        Scanner scanner = new Scanner(System.in);
        int number3 = scanner.nextInt();
//Создаём сканер ввода + .next -ввод до пробела
        int sum = 0;
//Создаём переменную для хранения суммы чётных чисел sum
        for (int i = 1; i <= number3; i++) {
            if (i % 2 == 0) {
                //Gроверяем чётное ли число
                sum += i;
//Каждый раз, когда цикл будет проходить через 3й блок он будет сохранять значение в переменную sum
//Пример ввод N => 5 => (0=0+2) (2=2+4) sum = 6
            }
        }
        System.out.println("Вывод сложенных чётных числе от 1 до N: " + sum);
        System.out.println("\n---------------------------Найти количество чисел, кратных 5, в диапазоне от 1 до 100---------------------------");
        //4 Найти количество чисел, кратных 5, в диапазоне от 1 до 100.
        int amount = 0;
//Создаём переменную для хранения количества кратных 5
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                amount = amount + 1;
//Если цикл проходит через условие, то amount +1
//Пример ввод N => 10 => ( 5 % 5 == 0) 5 делиться на 5 без остатка? Да! Значит Сохрани значение amount(0) = amount(0) + 1
// (10 % 5 == 0) 10 делиться на 5 без остатка? Да! Значит сохрани значение amount(1) = amount(1) + 1
// Следовательно ответ будет amount = 2 (Два числа кратных 5, в диапазоне от 1 до 10)
            }
        }
        System.out.println("Найти количество чисел, кратных 5, в диапазоне от 1 до 100: " + amount);
        System.out.println("\n---------------------------квадраты чисел от 1 до 10---------------------------");
        //5 Вывести квадраты чисел от 1 до 10.
        System.out.println("Первый Вариант:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "^2 = " + i * i);
//Не совсем понял на сколько это практично, но первое, что пришло в голову
        }
        int numberSquared = 1;
        System.out.println("Второй Вариант:");
        for (int i = 1; i <= 10; i++) {
            numberSquared = i * i;
            System.out.println(i + "^2 = " + numberSquared);
//Здесь у нас уже есть переменная, которая присваивает себе значения каждого пройденного цикла
//Пример Условие i<=3
//numberSquared(1) = 1 * 1 (Первый круг) Поскольку у нас i++, то её значение станет уже выше на 1 единицу =2; numberSquared стал равный 1
//numberSquared(1) = 2 * 2 (Второй круг) Поскольку у нас i++, то её значение станет уже выше на 1 единицу =3; numberSquared стал равный 2
//numberSquared(2) = 3 * 3 (Третий круг) Поскольку у нас i++, то её значение станет уже выше на 1 единицу =4; numberSquared стал равный 3
        }
        System.out.println("\n---------------------------Вывести числа от 1 до N. Посчитать сколько там: ---------------------------");
        //6 Вывести числа от 1 до N. Посчитать сколько там
        //   -четных
        //   -нечетных
        //   -деляться без остатка на 5 и на 6
        //   -деляться без остатка на 2 и на 3
        //   -деляться без остатка на 2 или на 10
        //   -деляться без остатка на 2 или на 4
        //   -деляться без остатка на 7 и на 3
        int evenNumber = 0;
        int oddNumber = 0;
        int shares5And6 = 0;
        int shares2And3 = 0;
        int shares7And3 = 0;
        int shares2or10 = 0;
        int shares2or4 = 0;
        System.out.print("Введи число: ");
        int number6 = scanner.nextInt();
        for (int i = 1; i < number6; i++) {
            if (i % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
            if (i % 5 == 0 && i % 6 == 0) {
                shares5And6++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                shares2And3++;
            }
            if (i % 7 == 0 && i % 3 == 0) {
                shares7And3++;
            }
            if (i % 2 == 0 || i % 10 == 0) {
                shares2or10++;
            }
            if (i % 2 == 0 || i % 4 == 0) {
                shares2or4++;
            }
        }
        System.out.println("Чётные числа от 1 до " + number6 + ": " + evenNumber);
        System.out.println("Нечётные числа от 1 до " + number6 + ": " + oddNumber);
        System.out.println("Кол-во чисел которое делиться на 5 и 6 без остатка: " + shares5And6);
        System.out.println("Кол-во чисел которое делиться на 2 и 3 без остатка: " + shares2And3);
        System.out.println("Кол-во чисел которое делиться на 7 и 3 без остатка: " + shares7And3);
        System.out.println("Кол-во чисел которое делиться на 2 или 10 без остатка: " + shares2or10);
        System.out.println("Кол-во чисел которое делиться на 2 или 4 без остатка: " + shares2or4);

        System.out.println("\n---------------------------Вывести числа от 1 до 100, которые делятся на 3 без остатка: ---------------------------");
        //7 Вывести числа от 1 до 100, которые делятся на 3 без остатка.
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("i =" + i);
            }
        }
        //8 Вывести сумму чисел от 1 до 50.
        System.out.println("\n---------------------------Вывести сумму чисел от 1 до 50: ---------------------------");
        int number8 = 0;
        for (int i = 1; i <= 50; i++) {
            number8 = number8 + i;
        }
        System.out.println("Сумма чисел от 1 до 50: " + number8);
        //9 Вывести все числа от 1 до N в одну строку через пробел.
        System.out.println("\n---------------------------Вывести все числа от 1 до N в одну строку через пробел: ---------------------------");
        System.out.print("Введи число: ");
        int number9 = scanner.nextInt();
        for (int i = 1; i <= number9; i++) {
            System.out.print(i + " ");
        }
        //10 Вывести произведение чисел от 1 до N.
        System.out.println("\n---------------------------Вывести произведение чисел от 1 до N: ---------------------------");
        System.out.print("Введи число: ");
        int number10 = scanner.nextInt();
        int sum10 = 1;
        for (int i = 1; i <= number10; i++) {
            sum10 = sum10 * i;
        }
        System.out.println("произведение чисел от 1 до " + number10 + " = " + sum10);

        //11 Найти количество чисел от 1 до N, которые делятся на 2 или 5.
        System.out.println("\n---------------------------чисел от 1 до N, которые делятся на 2 или 5: ---------------------------");
        System.out.print("Введи число: ");
        int number11 = scanner.nextInt();
        int sum11 = 0;
        for (int i = 1; i <= number11; i++) {
            if (i % 2 == 0 || i % 5 == 0) {
                sum11 = sum11 + 1;
            }
        }
        System.out.println(sum11);
        //12 Вывести сумму чисел от 1 до N.
        System.out.println("\n---------------------------Вывести сумму чисел от 1 до N: ---------------------------");
        System.out.print("Введи число: ");
        int number12 = scanner.nextInt();
        int sum12 = 0;
        for (int i = 1; i <= number12; i++){
            sum12 = sum12 + i;
//Пример ввода N=3 => (Sum12(0)=Sum12(0)+1) Sum= 1 первый цикл i++
// (Sum12(1)=Sum12(1)+2) Sum= 3 второй цикл i++
// (Sum12(3)=Sum12(3)+3) Sum=6 третий цикл i++
        }
        System.out.println("Сумма чисел от 1 до " + number12 + ": " + sum12);
    }
}
