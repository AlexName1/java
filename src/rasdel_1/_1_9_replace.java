package rasdel_1;

import java.util.Scanner;

public class _1_9_replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String a1 = scanner.nextLine();
        a1 = a1.replace("a", "b");
        System.out.println(a1);
    }
}
