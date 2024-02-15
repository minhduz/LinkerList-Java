import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
//        MyLinkerList<Integer> linkedList = new MyLinkerList<>();

        // Adding elements
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(12);
        linkedList.add(5);

        System.out.println("Initial Linked List: " + linkedList);

        // Removing an element
        int elementToRemove = 7;
        if (linkedList.remove(Integer.valueOf(elementToRemove))) {
            System.out.println("Element " + elementToRemove + " removed.");
        } else {
            System.out.println("Element " + elementToRemove + " not found.");
        }

        System.out.println("Linked List after removal: " + linkedList);
    }
}