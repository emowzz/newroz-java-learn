import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static int[] baseData = new int[10];

    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit)
        {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Search");
                    break;


            }
        }


    }


    public static void printInstructions()
    {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add items in the list");
        System.out.println("\t 3 - To modify items in the list");
        System.out.println("\t 4 - To remove items from the list");
        System.out.println("\t 5 - To search items in the list");
        System.out.println("\t 6 - To copy arrayList to another array");
        System.out.println("\t 7 - To quit the application");
    }

    public static void addItem()
    {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem()
    {
        System.out.println("Enter current item : ");
        String itemNo = scanner.nextLine();
//        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem()
    {
        System.out.println("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem()
    {
        System.out.println("Item to search for ..");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem))
        {
            System.out.println("Found "+searchItem+" in our grocery list ");
        }
        else {
            System.out.println(searchItem+" is not in the shopping list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        System.out.println(newArray+" has been copied");

        String[] myArray = new String[groceryList.getGroceryList().size()];

        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
