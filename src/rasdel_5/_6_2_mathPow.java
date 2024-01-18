package rasdel_5;

import java.util.Scanner;

public class _6_2_mathPow {
    private static int mathPow(int a, int b) {
        int result = a;
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            System.out.println("Возведение невозможно");
            return 0;
        } else {
            for (int i = 0; i < b - 1; i++) {
                result *= a;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите в какую степень его надо возвести: ");
        int b = scanner.nextInt();
        System.out.println("Результат возведения в степень: " + mathPow(a, b));
    }
}
