import java.util.Scanner;

public class ExceptionQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        try{
            System.out.println(num1 / num2);
        }
        catch(ArithmeticException e){
            throw new UnsupportedOperationException();
        }
    }
}
