package rasdel_2;

import java.util.Scanner;

public class _2_6_lengthString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        String s1 = scanner.nextLine();

        System.out.println("Введите вторую строку: ");
        String s2 = scanner.nextLine();

        System.out.println("Введите третью строку: ");
        String s3 = scanner.nextLine();

        String longestLine;

        int s1length = s1.length();
        int s2length = s2.length();
        int s3length = s3.length();

        if (s1length >= s2length && s1length >= s3length) {
            longestLine = s1;
        } else if (s2length >= s1length && s2length >= s3length) {
            longestLine = s2;
        } else {
            longestLine = s3;
        }

        System.out.println("Самая длинная строка: " + longestLine);
    }
}

