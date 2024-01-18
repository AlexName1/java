package rasdel_3;

import java.util.Scanner;

public class _3_2_factorial {
    public static void main(String[] args) {
        System.out.println("Введите число для факториала");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= a; ++i){
            factorial = factorial*i;
        }
        System.out.println("Факториал равен: " + factorial);
    }
}
