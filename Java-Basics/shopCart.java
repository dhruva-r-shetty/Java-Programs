import java.util.Scanner;

class shopCart
{
    public static void main(String args[])
    {
        Scanner item=new Scanner(System.in);
        
        System.out.print("Enter the item required: ");
        String name=item.nextLine();

        System.out.print("Enter the price of the item: ");
        double price=item.nextDouble();

        System.out.print("Enter the quantity: ");
        int quant=item.nextInt();

        double total=price*quant;

        System.out.println("You have brought " +quant+ " " +name+ "/s");
        System.out.println("Your total is: Rs."+total);

        item.close();
    }
}