package rasdel_2;

import java.util.Scanner;

public class _2_2_findMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Наибольшее число: " + a);
        } else {
            System.out.println("Наибольшее число: " + b);
        }
    }
}
