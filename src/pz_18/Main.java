package pz_18;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите:");
        System.out.println("    1 - для ввода вручную \n" +
                "    2 - для считывания данных из файла \n" +
                "    3 - для записи результата в файл");
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Введите выражение:");
            scanner.nextLine();
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
        } else if (n == 2) {
            String fileName = "C:\\Users\\ma6ap\\IdeaProjects\\pzshki_\\src\\pz_18\\input.txt";
            try {
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String input = br.readLine();
                br.close();

                String[] tokens = input.split(" ");

                if (tokens.length != 3) {
                    System.out.println("Error! Invalid input format");
                    return;
                }

                double a, b, result;
                try {
                    a = Double.parseDouble(tokens[0]);
                } catch (NumberFormatException e) {
                    System.out.println("Error! Not number");
                    return;
                }
                try {
                    b = Double.parseDouble(tokens[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Error! Not number");
                    return;
                }
                String operator = tokens[1];

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
                        if (b == 0) {
                            System.out.println("Error! Division by zero");
                            return;
                        }
                        result = a / b;
                        break;
                    default:
                        System.out.println("Operation Error!");
                        return;
                }
                System.out.println("Результат вычислений: " + result);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else if (n == 3) {
            String inputFileName = "C:\\Users\\ma6ap\\IdeaProjects\\pzshki_\\src\\pz_18\\input.txt";
            String outputFileName = "C:\\Users\\ma6ap\\IdeaProjects\\pzshki_\\src\\pz_18\\output.txt";
            try {
                BufferedReader br = new BufferedReader(new FileReader(inputFileName));
                String input = br.readLine();
                br.close();

                String[] tokens = input.split(" ");

                if (tokens.length != 3) {
                    System.out.println("Error! Invalid input format");
                    return;
                }

                double a, b, result;
                try {
                    a = Double.parseDouble(tokens[0]);
                } catch (NumberFormatException e) {
                    System.out.println("Error! Not number");
                    return;
                }
                try {
                    b = Double.parseDouble(tokens[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Error! Not number");
                    return;
                }
                String operator = tokens[1];

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
                        if (b == 0) {
                            System.out.println("Error! Division by zero");
                            return;
                        }
                        result = a / b;
                        break;
                    default:
                        System.out.println("Operation Error!");
                        return;
                }
                //System.out.println("Результат вычислений: " + result);
                writeOutput(outputFileName, "Результат вычислений: " + result);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

        private static void writeOutput(String outputFileName, String output) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
                bw.write(output);
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




