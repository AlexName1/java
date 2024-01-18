package rasdel_1;

import java.util.Scanner;

public class _1_8_contains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String a1 = scanner.nextLine();
        System.out.println("Строка содержит !!!: " + a1.contains("!!!"));
    }
}