import java.util.*;

class ArmstrongNumBetweenRange
{
    public int[] armstrongNumbersInRange(int min, int max)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=min ;i<max;i++)
        {
            if(armstrongOrNot(i))
            {
                list.add(i);
            }
        }
        int ar[] = new int[list.size()];
        int x =0;
        for(int i: list)
        {
            ar[x] = i;
            x++;
        }

        return ar;
    }
    boolean armstrongOrNot(int num)
    {
        int sum =0;
        int x = num;
        while(x!=0)
        {
            int rem = x%10;
            x=x/10;
            sum = sum+(rem*rem*rem);
        }
        if(num==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class A1Q2
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
        int ar[] = obj.armstrongNumbersInRange(min,max);
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
