package rasdel_4;

import java.util.Scanner;

public class _4_2_maxN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];

        for (int i = 0; i < size; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Самое большое число: " + max);
    }
}
