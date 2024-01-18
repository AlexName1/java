package rasdel_4;

import java.util.Arrays;
import java.util.Scanner;

public class _5_1_vozrastArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] Array = new int[size];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < size; i++) {
            Array[i] = scanner.nextInt();
        }
        Arrays.sort(Array);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(Array[i]);
        }
    }
}
