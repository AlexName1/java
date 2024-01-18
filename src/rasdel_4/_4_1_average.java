package rasdel_4;

import java.util.Scanner;

public class _4_1_average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / size;
        System.out.println("Среднее арифметическое: " + average);
    }
}
