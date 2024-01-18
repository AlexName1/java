package rasdel_5;

import java.util.Scanner;

public class _6_3_checkNumber {
    public static void checkParity(int a) {
        if ((a % 2) == 1) {
            System.out.println("Число нечетное");
        } else {
            System.out.println("Число четное");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        checkParity(a);
    }
}
