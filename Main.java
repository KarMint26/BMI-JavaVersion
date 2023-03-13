import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int height, weight, resultBMI;
    public static String inputUser(String index) {
        System.out.print(index + " : ");
        return scanner.nextLine();
    }
    public static void calculateBMI(){
        System.out.println("\n  Calculate BMI Menu");
        System.out.println("======================");
        int weight = Integer.parseInt(inputUser("What is your weight"));
        int height = Integer.parseInt(inputUser("What is your height"));
        BMI bmi = new BMI(weight, height);
        bmi.printResult();
    }
    public static void viewApp(){
        label:
        while(true) {
            System.out.println();
            System.out.println("  Welcome to Application BMI");
            System.out.println("==============================");
            System.out.println("1. Calculate BMI");
            System.out.println("2. Out Application");
            String choose = inputUser("What is your choose");
            switch (choose) {
                case "1" -> calculateBMI();
                case "2" -> {
                    System.out.println("Out Application.....");
                    break label;
                }
                default -> {
                    System.out.println("\nYour Choose not valid...");
                }
            }
        }
    }
    public static void main(String[] args) {
        viewApp();
    }
}