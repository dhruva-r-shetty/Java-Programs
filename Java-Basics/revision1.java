import java.util.Scanner;
class revision1{
    public static void main(String [] args){
        Scanner retailBill = new Scanner(System.in);

        //Items Entry
        System.out.print("Enter the item name: ");
        String item=retailBill.nextLine();
        System.out.print("Enter the quantity: ");
        int quant=retailBill.nextInt();
        System.out.print("Enter the price of single item: $");
        double price=retailBill.nextDouble();

        //Discount
        double disct=0.10f;
        int ship_fee=5;
        System.out.println("The discount of 10% and shipping fee of $5 is applied to all.");

        //Rates
        double gross_amt= quant*price;
        System.out.println("The gross amount is: $"+ gross_amt);
        double disct_amt=gross_amt*disct;
        System.out.println("The discounted amount is: $"+ disct_amt);
        double net_amt=gross_amt-disct_amt+ship_fee;
        System.out.println("The net amount is: $"+net_amt);

        //Type conversion
        int net_amot=(int)net_amt;
        System.out.println("The Total Amount is: $"+ net_amot);

        //Operator
        boolean member=(quant>=5)&&(net_amot>=50);
        System.out.println("Congratulations! Are you qualified for our 'Premium Subscription'?");
        System.out.print("Premium Subscription: "+ member);

        retailBill.close();
    }
}