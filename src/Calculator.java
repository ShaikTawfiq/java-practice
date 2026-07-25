import java.util.Scanner;
public class Calculator {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Addition=" +(num1+num2));
        System.out.println("subraction=" +(num1-num2));
        System.out.println("multiplication="+(num1*num2));
        System.out.println("division="+(num1/num2));
        sc.close();

    }

}