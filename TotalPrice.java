import java.text.DecimalFormat;
import java.util.Scanner;
 
public class TotalPrice {
 
    public static void main(String[] args) {
        // Declare variables and constants
        double itemPrice, totalPrice, discountPrice;
        final double DISCOUNT = 0.5, VAT = 0.15;
        
        // Instantiate --> Create the Scanner object
        Scanner input = new Scanner(System.in);
        
        // Instantiate --> Create the DecimalFormat and pass 0.00 to signal of two places
        DecimalFormat df = new DecimalFormat("0.00");
        
        // Display purpose of this program
        System.out.println("Create an application called TotalPrice that will get an item price from a user, \n" +
                           "add 15% VAT the price, also determine the total price discount of 50% and thereafter \n" + 
                           "display the item price, total price, and discount price.");
        
        // Prompt for user to enter the item price
        System.out.print("\nPlease enter the item price: R");
        
        // Read a double from the keyboard, and store it in itemPrice
        itemPrice = input.nextDouble();
        
        // Update the price
        totalPrice = itemPrice + (VAT * itemPrice);
        
        // Determine the discount price
        discountPrice = totalPrice - (DISCOUNT * totalPrice);
        
        // Display the item price, total price and discount price
        System.out.println("\nThe item price is R" + df.format(itemPrice) + "\n" +
                           "The total price is R" + df.format(totalPrice) + "\n" +
                           "The discount price is R" + df.format(discountPrice));
    }
    
}
