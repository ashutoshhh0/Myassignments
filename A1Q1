import java.util.*;
public class Assignment1Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArmstrongOrNot obj = new ArmstrongOrNot();
        if(obj.armstrongCheck(num))
        {
            System.out.println(num+" is a armstrong number");
        }
        else
        {
            System.out.println(num+" is not a armstrong number");
        }
    }
}
class ArmstrongOrNot
{
    public boolean armstrongCheck(int num)
    {
        int x = num;
        int sum =0;
        while(x!=0)
        {
            int rem = x%10;
            x=x/10;
            sum = sum +(rem*rem*rem);
        }
        if(sum ==num) {

            return true;
        }
        else
        {

            return false;
        }

    }
}
