package rasdel_2;

import java.util.Scanner;

public class _2_3_chetNechet {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        if (a1 % 2 == 0) {
            System.out.println("Число является " + a1 + " четным");
        } else {
            System.out.println("Число является " + a1 + " нечетным");
        }
    }
}
