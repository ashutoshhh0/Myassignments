import java.util.Scanner;

class SICI{
    public double simpleInterest(double principalAmount, int time, double interestRate){
        double calSimpleInterest = (principalAmount * interestRate * time) / 100;
        return calSimpleInterest;
    }
    public double compoundInterest(double principalAmount, int time, double interestRate){
        double calCompoundInterest = (principalAmount * Math.pow((1 + interestRate), time)) - principalAmount;
        return calCompoundInterest;
    }
}
public class BasicDSQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principalAmount = sc.nextDouble();
        int time = sc.nextInt();
        double interestRate = sc.nextDouble();
        SICI obj = new SICI();
        System.out.println("Simple interest: " + obj.simpleInterest(principalAmount, time, interestRate));
        System.out.println("Compound Interest: " + obj.compoundInterest(principalAmount, time, interestRate));
    }
}
