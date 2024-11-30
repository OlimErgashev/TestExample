import java.util.Scanner;

public class Main {
    public static String calc(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Вы ввели неправильный формат выражения! Введите, например: 6 + 8");
            return "";
        }
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String operator = parts[1];

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            System.out.println("Числа должны быть от 1 до 10");
            return "";
        }

        int result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Введите правильный оператор");
                return "";
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите арифметическое выражение:");
            String input = scanner.nextLine();
            String result = calc(input);
            System.out.println(result);
        }
    }
}
