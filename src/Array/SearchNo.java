package Array;
import java.util.*;

public class SearchNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        // Ask the user to enter the elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Ask the user which number to search
        System.out.print("Enter the number you want to search: ");
        int x = sc.nextInt();

        // Search for the number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("Number " + x + " found at index: " + i);
            }
        }
    }
}
