public class Main {
    public static void main(String[] arg) {
        System.out.println("Квадрат:");
        int heightSquare = 0;
        while (heightSquare < 5) {
            heightSquare++;
            int widthSquare = 0;
            while (widthSquare < 5) {
                widthSquare++;
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("Прямоугольник:");
        int heightRectangle = 0;
        while (heightRectangle < 5) {
            heightRectangle++;
            int widthRectangle = 0;
            while (widthRectangle < 5) {
                widthRectangle++;
                if (widthRectangle <= heightRectangle) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        System.out.println("Перевёрнутый прямоугольник:");
        int heightInvertedRectangle = 0;
        while (heightInvertedRectangle < 5) {
            int widthInvertedRectangle = 5;
            while (widthInvertedRectangle > 0) {
                widthInvertedRectangle--;
                if (widthInvertedRectangle >= heightInvertedRectangle) {
                    System.out.print(" * ");
                }
            }
            heightInvertedRectangle++;
            System.out.println();
        }
        System.out.println("треугольник:");
        int heightTriangle = 0;
        while (heightTriangle < 5) {
            heightTriangle++;
            int spacesheight = 5;
            while (spacesheight > 0) {
                spacesheight--;
                if (spacesheight >= heightTriangle) {
                    System.out.print("   ");
                }
            }
            int widthTriangleLeft = 0;
            while (widthTriangleLeft < 5) {
                widthTriangleLeft++;
                if (heightTriangle >= widthTriangleLeft) {
                    System.out.print(" * ");
                }
            }
            int widthTriangleRight = 0;
            while (widthTriangleRight < 5) {
                widthTriangleRight++;
                if (widthTriangleRight < heightTriangle) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        System.out.println("Прямоугольник 2:");
        int a1 = 5; //Высота треугольника
        int b1 = 1;
        while (b1 < a1) {
            int c1 =0;
            while (c1<b1){
                System.out.print("*");
                c1++;
            }
            System.out.println();
            b1++;
        }
        System.out.println("Перевёрнутый прямоугольник 2:");
        int a2 = 5; //Высота треугольника
        int b2 = 1;
        while (b2 < a2) {
            int c2 =0;
            while (a2-b2>c2){
                System.out.print("*");
                c2++;
            }
            System.out.println();
            b2++;
        }
        System.out.println("треугольник 2:");
        int a = 5; //Высота треугольника
        int b = 1; //дополнительная переменная
        while (b < a) {
            int spaces = a - b; //пробелы перед *

            //____   <= 5-1=4
            //___    <= 5-2=3
            //__     <= 5-3=2
            //_      <= 5-4=1
            //5<5? - нет

            int star = b*2-1; //звёздочки

            //*      <= 1*2-1=1
            //**     <= 2*2-1=3
            //***    <= 3*2-1=5
            //*******<= 4*2-1=7
            //5<5 - нет

            int c = 0;
            while (c < spaces) {
                System.out.print(" ");
                c++;
            }
            //1) цикл _пробел 0<5-1=4
            //2) цикл _пробел 1<5-1=4
            //3) цикл _пробел 2<5-1=4
            //4) цикл _пробел 3<5-1=4
            //5) цикл 4<5-1=4 НЕТ, цикл завершился переход ко второму циклу. Который находиться в теле первого цикла
            //Итог:
            //____
            int d = 0;
            while (d<star) {
                System.out.print("*");
                d++;
            }
            //1) цикл 0 < 1*2-1=1 *
            //2) цикл 1 < 1*2-1=1 НЕТ, цикл завершился. Продолжает выполнять тело первого цикла.
            //Итог:
            //____*

            //println
            //b++
            System.out.println();
            b++;
        }
    }
}
//System.out.println(height + " height");
//height
//width
