package rasdel_3;

import java.util.Scanner;

public class _3_4_chetCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число");
        String num = scanner.next();
        int chetCount = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) % 2 == 0) {
                chetCount++;
            }
        }
        System.out.println("Количество четных цифр в числе " + num + " = " + chetCount);
    }
}
