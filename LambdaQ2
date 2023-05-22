import java.util.ArrayList;

public class LambdaQ2 {
    private int totalPrice;
    private String status;

    public static ArrayList<LambdaQ2> listOfOrders(ArrayList<LambdaQ2> orders) {
        ArrayList<LambdaQ2> ansList = new ArrayList<>();
        orders.forEach(assignmentObj -> {
            if((assignmentObj.totalPrice > 10000) && (assignmentObj.status.equals("ACCEPTED")) || (assignmentObj.status.equals("COMPLETED"))){
                ansList.add(assignmentObj);
            }
        });
        return ansList;
    }
    public static void main(String[] args) {
        LambdaQ2 obj1 = LambdaQ2();
        obj1.totalPrice = 20000;
        obj1.status = "ACCEPTED";

        LambdaQ2 obj2 = new LambdaQ2();
        obj2.totalPrice = 30000;
        obj2.status = "COMPLETED";

        LambdaQ2 obj3 = new LambdaQ2();
        obj3.totalPrice = 10000;
        obj3.status = "ACCEPTED";

        LambdaQ2 obj4 = new LambdaQ2();
        obj4.totalPrice = 2000;
        obj4.status = "NOT COMPLETED";

        LambdaQ2 obj5 = new LambdaQ2();
        obj5.totalPrice = 50000;
        obj5.status = "COMPLETED";

        ArrayList<LambdaQ2> orders = new ArrayList<>();
        orders.add(obj1);
        orders.add(obj2);
        orders.add(obj3);
        orders.add(obj4);
        orders.add(obj5);

        ArrayList<LambdaQ2> listObtained = listOfOrders(orders);
        listObtained.forEach(mainObj -> System.out.println("Total Price: " + mainObj.totalPrice + " Status: " + mainObj.status));
    }
}
