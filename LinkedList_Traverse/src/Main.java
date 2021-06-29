import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ListIterator listIterator = ll.listIterator();

        ListIterator li = ll.listIterator();

        System.out.println("Enter first element to the linked list");

        String addElement = scanner.nextLine();

        ll.addFirst(addElement);

        System.out.println(ll);

        boolean quit = false;


        while(!quit)
        {
            System.out.println("1 -> to add element at the last\n"+
                    "2 -> to add element at the beginning\n"+
                    "3 -> to add element at desired index\n"+
                    "4 -> to remove element at the last\n"+
                    "5 -> to remove element at the beginning\n"+
                    "6 -> to remove element at desired index\n"+
                    "7 -> to traverse to next element\n"+
                    "8 -> to traverse to previous element\n"+
                    "9 -> to see the full list\n");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 1:
                    System.out.println("1 tapped");
                    System.out.println("What you want to add ?");
                    String lastAdd = scanner.nextLine();
                    LinkedListTraverse linkedList = new LinkedListTraverse();
                    boolean check = linkedList.AddLast(ll , lastAdd);
                    if (check) {
                        System.out.println("Successfully added ");
                    }
                    break;
                case 2:
                    System.out.println("2 tapped");
                    System.out.println("What you want to add ?");
                    String firstAdd = scanner.nextLine();
                    ll.addFirst(firstAdd);
                    break;
                case 3:
                    System.out.println("3 tapped");
                    System.out.println("What you want to add ?");
                    String addAtAnyPosition = scanner.nextLine();
                    System.out.println("In which index you want to add ?");
                    int indexPosition = scanner.nextInt();
                    ll.add(indexPosition, addAtAnyPosition);
                    break;
                case 4:
                    if (ll.isEmpty())
                    {
                        System.out.println("Nothing to remove");
                        break;
                    }
                    System.out.println("4 tapped");
                    System.out.println("Remove from the last");
                    ll.removeLast();
                    break;
                case 5:
                    System.out.println("5 tapped");
                    System.out.println("Remove from the first");
                    ll.removeFirst();
                    break;
                case 6:
                    System.out.println("6 tapped");
                    System.out.println("Input your index no to remove ");
                    int removeIndex = scanner.nextInt();
                    ll.remove(removeIndex);
                    break;
                case 7:
                    if (ll.isEmpty())
                    {
                        System.out.println("Nothing in the list");
                        break;
                    }
                    else {
                        if(li.hasNext())
                        {
                            System.out.println("Now vising -> "+listIterator.next());
                            break;
                        }else{
                            break;
                        }
                    }

                case 8:
                    if (li.hasPrevious())
                    {
                        System.out.println("Now visiting -> "+li.hasPrevious());
                        break;
                    }else{
                        System.out.println("Nothing to show");
                        break;
                    }

                case 9:
                    if (ll.isEmpty())
                    {
                        System.out.println("Nothing to show");
                        break;
                    }
                    System.out.println(ll);
                    break;
            }
        }
    }



}
