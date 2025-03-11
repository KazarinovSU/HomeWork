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
Так как в Unicode значение символа `'A'` (65) меньше значения символа `'B'` (66).

Таким образом, `Character` — это полезный класс для работы с символами на более высоком уровне, чем примитивный тип `char`.
Он предоставляет множество методов для манипуляций с символами, таких как преобразование регистра, проверка типа символа и работа с Unicode.
