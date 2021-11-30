/**
 * Vending Machine Program
 */

import java.util.Scanner;

public class VendingMachine
{
    private Item[] items;

    public VendingMachine() {
        items = new Item[5];
        items[0] = new Item("Lays Chips", 20.0, 20);
        items[1] = new Item("Coke", 40.0, 10);
        items[2] = new Item("Fanta", 40.0, 10);
        items[3] = new Item("Sprite", 40.0, 10);
        items[4] = new Item("Kinley", 20.0, 20);
    }

    public void displayInventory() {
        for (int i = 0; i < items.length; i++)
        {
            System.out.print(items[i].getName());
            System.out.print('\t');
            System.out.print(items[i].getQty());
            System.out.println();
        }
    }

    public void dispenseItem(int itemCode) {
        Scanner in = new Scanner(System.in);
        if (items[itemCode].getQty() <= 0) {
            System.out.println("Sorry, out of stock");
        }
        else
        {
            System.out.println("MRP: " + items[itemCode].getPrice());
            System.out.print("Enter money: ");
            double amt = in.nextDouble();
            if (amt < items[itemCode].getPrice()) {
                System.out.println("Insufficient money paid, can't dispense " +
                        items[itemCode].getName());
                System.out.println("Refunding " + amt);
            }
            else
            {
                System.out.println("Dispensing one " + items[itemCode].getName());
                double changeAmt = amt - items[itemCode].getPrice();
                if (changeAmt > 0)
                    System.out.println("Here is your change amount of " + changeAmt);
                items[itemCode].reduceQty();
            }
        }
    }

    Item[] getItems() {
        return items;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();
        Item[] vmItems = vm.getItems();

        System.out.println("Vending Machine Menu");
        for (int i = 0; i < vmItems.length; i++) {
            System.out.println("Enter " + (i+1) + " for " + vmItems[i].getName());
        }

        System.out.println("Enter 6 to stop the Vending Machine");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            if (choice < 1 || choice > 6) {
                System.out.println("Incorrect choice");
            }
            else if(choice == 6) {
                System.out.println("Stopping Vending Machine...");
            }
            else {
                vm.dispenseItem(choice - 1);
            }
        } while(choice != 6);

    }
}
