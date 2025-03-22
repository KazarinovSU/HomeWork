public class Main {
    public static void main(String[] arg) {
        System.out.println("Квадрат:");
        int b = 0;
        do {
            int a = 0;
            do {
                System.out.print(" * ");
                a++;
            } while (a < 5);
            System.out.println();
            b++;
        } while (b < 5);
//------------------------------------------------------------------------
//Первый цикл:
//b = 0 Выводит тело цикла, условие не смотрит в первый раз
        //Второй цикл в теле первого цикла:
        //a = 0 Выводит на экран '*' тк в первый раз не проверяет условие a++;
        //a = 1<5? ДА - Выводит *
        //a = 2<5? ДА - Выводит *
        //a = 3<5? ДА - Выводит *
        //a = 4<5? ДА - Выводит *
        //a = 5<5? НЕТ - Конец цикла, условие не выполнено
        //Итог:
        //*****
//Переход на новую строку
//b++;
//------------------------------------------------------------------------
        System.out.println("Прямоугольник:");
        int d = 1;
        do {
            int c = 0;
            do {
                c++;
                System.out.print(" * ");
            } while (c < d);
            System.out.println();
            d++;
        } while (d < 5);
        System.out.println("Перевёрнутый прямоугольник:");
        int f = 1;
        int f2 = 5;
        do {
            int e = 0;
            do {
                System.out.print(" * ");
                e++;
            } while (e < f2 - f);
            System.out.println();
            f++;
        } while (f < 5);
        System.out.println("Треугольник:");
        int g = 1;
        int h = 5;
        do {
            int i = 0;
            do {
                System.out.print("   ");
                i++;
            } while (i < h - g);
            int j = 0;
            int k = g*2-1;
            do {
                System.out.print(" * ");
                j++;
            } while (j < k);
            System.out.println();
            g++;
        } while (g < 5);
    }
}
