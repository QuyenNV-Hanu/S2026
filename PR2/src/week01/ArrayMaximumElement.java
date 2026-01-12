package week01;

public class ArrayMaximumElement {
    public static void main(String[] args) {
        int[] arr = {8, 10, 1, 14, 6, 9, 20, 3, 5, -300, 0};
        int max = findMax(arr);
        System.out.println("Maximum element is " + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0]; // Assign max to the first element of the array
        // Compare current max value with other elements in the array
        for (int i = 1; i < arr.length; i++) {
            // if max < current element => max = current element
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // SIMILARITIES:
    // DIFFERENCES:
    // Explanation:
}
