import linear.*;
import sorting.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== JAVA DATA STRUCTURES & ALGORITHMS SUITE ===");
        
        System.out.println("\n1. Linked List Operations:");
        LinkedList<String> list = new LinkedList<>();
        list.insert("Node 1");
        list.insert("Node 2");
        list.insert("Node 3");
        list.display();

        System.out.println("\n2. Sorting Demonstration (QuickSort):");
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original: " + Arrays.toString(numbers));
        SortingAlgorithms.quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted:   " + Arrays.toString(numbers));
    }
}
