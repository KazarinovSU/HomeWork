# Character
В Java класс `Character` — это обертка для примитивного типа данных `char`.
Он предоставляет набор статических методов, которые позволяют работать с символами более гибко и удобно.
Класс `Character` является частью библиотеки Java и находится в пакете `java.lang`.

Основные функции и особенности класса `Character`:
1. **Преобразования и проверки символов:** Класс `Character` предоставляет методы для проверки, является ли символ цифрой, буквой, пробелом и т.д., а также для преобразования символов в верхний или нижний регистр.

Примеры методов:
+ `Character.isLetter(char c)` — проверяет, является ли символ буквой.
+ `Character.isDigit(char c)` — проверяет, является ли символ цифрой.
+ `Character.toLowerCase(char c)` — преобразует символ в нижний регистр.
+ `Character.toUpperCase(char c)` — преобразует символ в верхний регистр.
Пример использования:
```java
public class CharacterExample {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(Character.isLetter(ch));  // true
        System.out.println(Character.isDigit(ch));   // false
        System.out.println(Character.toLowerCase(ch));  // a
    }
}
```
2. **Константы:** Класс `Character` также содержит несколько полезных констант, например, `Character.MIN_VALUE` (минимальное значение для `char`, что равно `\u0000`) и `Character.MAX_VALUE` (максимальное значение для `char`, что равно `\uffff`).
3. **Обертка примитивного типа** `char`: Класс `Character` является оберткой для типа `char`, что позволяет использовать его в коллекциях, таких как `ArrayList`, так как примитивные типы не могут быть использованы в этих структурах данных.

4. Пример с использованием обертки `Character`:
```java
   import java.util.ArrayList;

public class CharacterWrapperExample {
    public static void main(String[] args) {
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        charList.add('C');
        
        for (Character c : charList) {
            System.out.println(c);
        }
    }
}
```
4. **Конструктор** `Character` **и методы:** Конструктор класса `Character` в основном используется для создания объектов этого класса, но чаще всего мы работаем с его статическими методами.
5. **Сравнение символов:** Для сравнения символов в классе `Character` также есть методы, например, `Character.compare(char c1, char c2)`, который сравнивает два символа по их порядковым номерам в Unicode.
Вот пример кода на языке Java, который демонстрирует использование метода `Character.compare(char c1, char c2)` для сравнения двух символов по их порядковым номерам в Unicode:
```java
public class CharacterComparison {
    public static void main(String[] args) {
        // Определим два символа
        char char1 = 'A';
        char char2 = 'B';

        // Сравнение символов с помощью Character.compare
        int result = Character.compare(char1, char2);

        // Вывод результата сравнения
        if (result < 0) {
            System.out.println(char1 + " меньше, чем " + char2);
        } else if (result > 0) {
            System.out.println(char1 + " больше, чем " + char2);
        } else {
            System.out.println(char1 + " равно " + char2);
        }
    }
}
```
### Пояснение:
+ Метод Character.compare`(char c1, char c2)` возвращает целое число
  + Если `c1` меньше `c2`, возвращается отрицательное число.
  + Если `c1` больше `c2`, возвращается положительное число.
  + Если символы равны, возвращается 0.

В этом примере символы `'A'` и `'B'` сравниваются по их Unicode значению, и результат сравнения выводится на экран.

Вывод для этого кода будет:
```CSS
A меньше, чем B
```
Так как в Unicode значение символа `'a'` (61) меньше значения символа `'b'` (62).

Таким образом, `Character` — это полезный класс для работы с символами на более высоком уровне, чем примитивный тип `char`.
Он предоставляет множество методов для манипуляций с символами, таких как преобразование регистра, проверка типа символа и работа с Unicode.
___
Вот таблица символов латиницы в кодировке Unicode с их номерами:
### Строчные латинские буквы (a-z):
|Буква|Unicode|   
|-|-|
|a	|U+0061|
|b	|U+0062|
|c	|U+0063|
|d	|U+0064|
|e	|U+0065|
|f	|U+0066|
|g	|U+0067|
|h	|U+0068|
|i	|U+0069|
|j	|U+006A|
|k	|U+006B|
|l	|U+006C|
|m	|U+006D|
|n	|U+006E|
|o	|U+006F|
|p	|U+0070|
|q	|U+0071|
|r	|U+0072|
|s	|U+0073|
|t	|U+0074|
|u	|U+0075|
|v	|U+0076|
|w	|U+0077|
|x	|U+0078|
|y	|U+0079|
|z	|U+007A|
