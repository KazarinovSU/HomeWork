public class Main {
    public static void main(String[] args) {
//1. Инкремент числа
//Объявите переменную a = 5. Используйте только ++ для увеличения a на 3 единицы.
        int a = 5;
        a++;
        a++;
        a++;
        System.out.println(a);
//2. Декремент числа
//Объявите переменную b = 10. Используйте только -- для уменьшения b на 4 единицы.
        int b = 10;
        b--;
        b--;
        b--;
        b--;
        System.out.println(b);
//3. Инкремент и сложение
//Объявите две переменные x = 2 и y = 3.
// Используйте инкремент ++ и сложение +, чтобы получить сумму x + y после увеличения обеих переменных на 1.
        int x = 2, y = 3;
        x++;
        y++;
        System.out.println(x + y);
//4. Декремент и вычитание
//Объявите две переменные m = 8 и n = 5.
//Используйте декремент -- и вычитание -, чтобы получить разность m - n после уменьшения обеих переменных на 2.
        int m = 8, n = 5;
        m--;
        m--;
        n--;
        n--;
        System.out.println(m - n);
//5. Инкремент в выражении
//Объявите переменную p = 4. Используйте выражение result = ++p + p++ и сохраните результат в переменной result.
        int p = 4;
        int result = ++p + p++;
        System.out.println(result);
//6. Декремент в выражении
//Объявите переменную q = 7. Используйте выражение output = --q - q-- и сохраните результат в переменной output.
        int q = 7;
        int output = --q - q--;
        System.out.println(output);
//7. Остаток от деления с инкрементом
//Объявите переменную r = 9. Используйте инкремент ++ и операцию %,
// чтобы вычислить остаток от деления r на 5 после увеличения r на 2.
        int r = 9;
        r++;
        r = r % 5;
        r++;
        r++;
        System.out.println(r);
//8. Остаток от деления с декрементом
//Объявите переменную s = 15. Используйте декремент -- и операцию %,
// чтобы вычислить остаток от деления s на 4 после уменьшения s на 3.
        int s = 15;
        s--;
        s = s % 4;
        s--;
        s--;
        s--;
        System.out.println(s);
//9. Смешанное использование инкремента и декремента
//Объявите переменную t = 6. Используйте выражение result = ++t - t-- + t++, чтобы сохранить значение в result.
        int t = 6;
        result = ++t - t-- + t++;
        System.out.println(result);
//10. Комбинация инкремента, декремента и остатка от деления
//Объявите переменную u = 12. Используйте выражение finalResult = u-- % ++u + --u, чтобы сохранить результат в finalResult.
        int u = 12;
        int finalResult = u-- % ++u + --u;
        System.out.println(finalResult);
    }
}
