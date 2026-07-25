import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (kg) : ");
        double weight = sc.nextDouble();
        System.out.println("enter your height (cm) : ");
        int height = sc.nextInt();
        double bmi = weight/(height*height);
        System.out.println("weight: " + weight + "kg");
        System.out.println("height" + height + "cm" );
    }
}