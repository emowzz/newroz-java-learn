import java.util.LinkedList;

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
}
