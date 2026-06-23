public class ArraysDemo {
    public static void main(String[] args) {
        int arr[] = {10, 25, 8, 45, 30};
        // Largest Element
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest Element: " + largest);
        // Reverse Array
        System.out.print("Reversed Array: ");
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Linear Search
        int key = 25;
        boolean found = false;
        for(int num : arr) {
            if(num == key) {
                found = true;
                break;
            }
        }

        System.out.println("25 Found: " + found);
    }
}
