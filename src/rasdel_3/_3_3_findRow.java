package rasdel_3;

import java.util.Scanner;

public class _3_3_findRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = scanner.nextInt();
        int S = 0;
        for (int k = 1; k <= n; k++) {
            S += (k * k + 1);
        }
        System.out.println("Значение выражения S = (k² + 1) от k = 1 до n = " + S);
    }
}
