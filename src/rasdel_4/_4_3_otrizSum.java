package rasdel_4;

import java.util.Scanner;

public class _4_3_otrizSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Сумма отрицательных чисел массива: " + sum);
    }
}