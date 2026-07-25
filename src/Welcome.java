import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name + "!");
        System.out.println("Day 1: Java Class");
        System.out.println("What happened in class:");
        System.out.println("- Introduction to Java");
        System.out.println("- Setting up Java environment");
        System.out.println("- Writing first program: Hello World");
        System.out.println("-variables and primitive data types");
        System.out.println("- Basics of Scanner for input");
        sc.close();
    }
}