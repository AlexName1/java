package rasdel_5;

import java.util.Scanner;

public class _6_5_deleteNumber {
    public static int[] removeDuplicates(int[] arr1, int number) {
        int newSize = 0;
        //индикатор первого вхождения числа повторы которого надо убрать
        int pervVhozhd1 = 0;
        // Создаем размер второго массива
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == number && pervVhozhd1 == 0) {
                pervVhozhd1 = 1;
                newSize++;
            }
            // Если после первого вхождения проверяемого числа оно встрчается снова, то размер нового массива не увеличивается и цикл переходит к следующей итерации.
            else if (arr1[i] == number && pervVhozhd1 == 1) {
                continue;
            } else {
                newSize++;
            }
        }
        System.out.println("Новый размер массива: " + newSize);
        // Заполняем новый массив числами и пропускаем все повторы
        int[] arr2 = new int[newSize];
        int pervVhozhd2 = 0;
        int index2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == number && pervVhozhd2 == 0) {
                arr2[index2] = arr1[i];
                pervVhozhd2 = 1;
                index2++;
            } else if (arr1[i] == number && pervVhozhd1 == 1) {
                continue;
            } else {
                arr2[index2] = arr1[i];
                index2++;
            }
        }
        //Выводим новый массив
        return arr2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Введите число, дупликаты которого надо убрать: ");
        int duplicate = scanner.nextInt();
        // Создаем новый массив и присваиваем ему работу метода
        int[] arr2 = removeDuplicates(arr, duplicate);
        System.out.println("Новый массив: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
