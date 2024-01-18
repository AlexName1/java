import java.util.Scanner;

public class kontrolnaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите оператор: ");
        char operator = sc.next().charAt(0);
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        int result;
        try {
            result = calculate(a, operator, b);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            return;
        }
        System.out.println("Результат: " + result);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return a / b;
    }

    private static int power(int a, int b) throws IllegalArgumentException {
        if (b < 0) {
            throw new IllegalArgumentException("Возведение в отрицательную степень недоступно");
        }
        return (int) Math.pow(a, b);
    }

    private static int calculate(int a, char operator, int b) throws ArithmeticException, IllegalArgumentException {
        switch (operator) {
            case '+':
                return add(a, b);
            case '-':
                return subtract(a, b);
            case '*':
                return multiply(a, b);
            case '/':
                return divide(a, b);
            case '^':
                return power(a, b);
            default:
                throw new IllegalArgumentException("Неизвестный оператор");
        }
    }
}
