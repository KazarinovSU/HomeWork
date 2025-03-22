public class Main {
    public static void main(String[] arg) {
        int height = 8;
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Квадрат:");
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < height; j++) {
                if (i == 1 || i == height - 1 || j == 1 || j == height - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Прямоугольный треугольник:");
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < height; j++) {
                if (i == height - 1 || j == 1 || j == i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Прямоугольный треугольник:");
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < height; j++) {
                if (i == 1 || j == height - 1 || i == j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Треугольник:");
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < height; j++) {
                if (i == height - 1 || i == 5 && j == 2 || i == 3 && j == 3 || i == 1 && j == 4 || i == 3 && j == 5 || i == 5 && j == 6) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Треугольник2:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                if (k == 0 || i == height - 1 && k % 3 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int m = height; m >= 0; m--) {
                if (i == height - 1 && m % 3 == 0 || m == height - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Треугольник3:");
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < height; j++) {
                if (i == height - 7 && j % 4 == 0 || i == height - 5 && 15 % j == 0 && j > 1 || i == height - 3 && 6 % j == 0 && j > 1&&j!=3|| i == height - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Треугольник4:");
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                if (k == 0||i==height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int m = 1; m <= height; m++) {
                if(i==m&&i>0||i==height) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("ромб:");
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                if (k == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int m = 1; m <= height; m++) {
                if (i == m && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = height; k >= i; k--) {
                if (k == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int l = height; l >= i; l--) {
                if (l==i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ромб2:");
        for (int i = 1; i < height * 2; i++) {
            for (int j = 1; j < height * 2; j++) {
                if (
                        i > 0 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 7 && i != 8 && i != 9 && i != 10 && i != 11 && i != 12 && i != 13 && i != 14 //15
                                && j % 8 == 0
                                || i > 1 && i != 3 && i != 4 && i != 5 && i != 6 && i != 7 && i != 8 && i != 9 && i != 10 && i != 11 && i != 12 && i != 13 && i != 15//14
                                && 63 % j == 0 && j > 3
                                || i > 2 && i != 4 && i != 5 && i != 6 && i != 7 && i != 8 && i != 9 && i != 10 && i != 11 && i != 12 && i < 14//13
                                && 60 % j == 0 && j > 5 && j < 11
                                || i > 3 && i != 5 && i != 6 && i != 7 && i != 8 && i != 9 && i != 10 && i != 11 && i < 13//12
                                && 55 % j == 0 && j > 1
                                || i > 4 && i != 6 && i != 7 && i != 8 && i != 9 && i != 10 && i < 12//11
                                && 12 % j == 0 && j > 3 && j != 6
                                || i > 5 && i != 7 && i != 8 && i != 9 && i < 11//10
                                && 39 % j == 0 && j > 1
                                || i > 6 && i != 8 && i < 10//9
                                && 28 % j == 0 && j > 1 && j != 4 && j != 7
                                || i == 8
                                && 15 % j == 0 && j != 3 && j != 5
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
