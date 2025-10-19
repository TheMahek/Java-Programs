public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {25, 12, 89, 5, 46, 78};

        int max = arr[0];
        int min = arr[0];

        // Loop to find max and min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
