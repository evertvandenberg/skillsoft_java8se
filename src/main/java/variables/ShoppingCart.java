package variables;

/**
 * Created by vdBerg on 11/12/17.
 */
public class ShoppingCart {
    public static void main(String [] args){

        String custName = "Mary Smith";
        String itemDesc = "shirt";

        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;


        String message = custName + " want to purchase " + quantity + " " + itemDesc;
        total = (price * quantity * tax);
        System.out.println(message);
        System.out.println("Total cost: " + total);




        // met array's
        String [] items = {"shirt", "boots", "scarf" , "sweater" , "gloves"};

        String message1 = custName + " wants to buy " + items.length + " items";

        System.out.println(message1);
        System.out.println("Mary definitly wants a" + items[3]);



        //loop with break
        int passmark = 12;
        boolean passed = false;
        int [] scores = {4,6,2,8,12,35,9};

        for (int unitScore : scores){
            if (unitScore > passmark){
                passed = true;
                break;
            }
        }

        System.out.println("At least one passed ? " + passed);

    }
}
