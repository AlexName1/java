package rasdel_5;

import java.util.Scanner;

public class _6_1_sumSquare {

    private static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        int sum = square(a) + square(b);
        System.out.println("Сумма квадратов чисел " + a + " и " + b + " равна: " + sum);
    }
}