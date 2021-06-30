import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Aab");
        addInOrder(placesToVisit, "Bbc");
        addInOrder(placesToVisit, "Ffg");
        addInOrder(placesToVisit, "Dde");
        addInOrder(placesToVisit, "Eef");
        addInOrder(placesToVisit, "Ccd");
//        addInOrder(placesToVisit, "Ccd");

        printList(placesToVisit);

        visit(placesToVisit);

//        placesToVisit.add("Dhaka");
//        placesToVisit.add("Noakhali");
//        placesToVisit.add("Sylhet");
//        placesToVisit.add("Chittagang");
//        placesToVisit.add("Barishal");
//        placesToVisit.add("Khulna");

//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Mirpur");
//
//        printList(placesToVisit);
//
//        placesToVisit.remove(1);
//
//        printList(placesToVisit);


    }

    public static void printList(LinkedList<String> linkedList)
    {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext())
        {
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("============");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext())
        {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0)
            {
                System.out.println(newCity+" is already included");
                return false;
            }
            else if (comparison > 0)
            {
                //new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if (comparison < 0)
            {
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities)
    {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty())
        {
            System.out.println("No cities in the itenerary");
            return;
        }
        else {
            System.out.println("Now Visiting "+listIterator.next());
            printMenu();
        }

        while (!quit)
        {
            int action = scanner.nextInt();
//            scanner.nextInt();
            switch (action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
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