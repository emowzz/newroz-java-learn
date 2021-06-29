import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListTraverse {


    public static boolean AddLast(LinkedList<String> linkedList, String addFirst)
    {

        if(linkedList.isEmpty()){
            return false;
        }
        else {
            linkedList.addLast(addFirst);
            return true;
        }

    }

    public static void visit(LinkedList<String> linkedList)
    {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        boolean goingForward = true;

        ListIterator listIterator = linkedList.listIterator();

        while (!quit)
        {
            System.out.println("Available actions:\npress");
            System.out.println("0 - to quit\n"+
                    "1 - go to next city\n"+
                    "2 - go to previous city\n"+
                    "3 - print menu options");

            int action = scanner.nextInt();
            switch (action)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!goingForward)
                    {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }

                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now Visiting "+listIterator.next());
                    }
                    else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious())
                    {
                        System.out.println("Now visiting "+listIterator.previous());
                    }
                    else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu()
    {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n"+
                "1 - go to next city\n"+
                "2 - go to previous city\n"+
                "3 - print menu options");
    }


}
