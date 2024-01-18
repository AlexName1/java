package rasdel_2;

import java.util.Scanner;

public class _2_1_findMinimalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Наименьшее число: " + b);
        } else {
            System.out.println("Наименьшее число: " + a);
        }
    }
}

