package rasdel_3;

import java.util.Scanner;

public class _3_1_abSquare {
    public static void main(String[] args) {
        System.out.println("Введите число A: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите число B: ");
        int b = scanner.nextInt();
        while (a <= b) {
            int a_square = a * a;
            System.out.println("Квадрат числа " + a + ": " + a_square);
            a++;
        }
    }
}
