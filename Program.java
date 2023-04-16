import java.util.List;

public class Program {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 45, 36, 27, 58, 48, 53, 79, 26, 26, 16 };
        DoublyLinkedList list = new DoublyLinkedList(List.of(array));
        System.out.println("Original list: ");
        System.out.println(list);

        list.reverse();
        System.out.println();
        System.out.println("Reversed list: ");
        System.out.println(list);
    }
}