package pz_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Operation Error!");
            return;
        }

        double a, b;
        try {
            a = Double.parseDouble(parts[0]);
            b = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error! Not number");
            return;
        }

        try {
            double result;
            switch (parts[1]) {
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                case "*" -> result = a * b;
                case "/" -> {
                    if (b == 0) {
                        System.out.println("Error! Division by zero");
                        return;
                    }
                    result = a / b;
                }
                default -> {
                    System.out.println("Operation Error!");
                    return;
                }
            }
            System.out.println(" = " + result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
