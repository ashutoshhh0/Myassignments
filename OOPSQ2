package IntermediateOOPSAssignment;

import java.util.ArrayList;

class Manager extends OOPSQ2{
    @Override
    public int getSalary(int salary){
        int incentive = 5000;
        return incentive + salary;
    }
}
class Labour extends OOPSQ2{
    @Override
    public int getSalary(int salary){
        int overtime = 500;
        return overtime + salary;
    }
}
public class OOPSQ2 {
    int salary = 10000;
    public int getSalary(int salary){
        return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int totalSalary = 0;
        for(int val : employeeSalaries)
            totalSalary += val;
        return totalSalary;
    }
    public static void main(String[] args) {
        Manager managerObj = new Manager();
        Labour labourObj = new Labour();
        OOPSQ2 obj = new OOPSQ2();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(managerObj.getSalary(obj.salary));
        list.add(labourObj.getSalary(obj.salary));
        System.out.println(obj.totalEmployeesSalary(list));
    }
}
