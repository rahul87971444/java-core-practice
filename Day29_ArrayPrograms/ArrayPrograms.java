import java.util.Arrays;
public class ArrayPrograms {
    // 1. Largest Element
    static void largest(int arr[]) {
        int max = arr[0];
        for(int num : arr) {
            if(num > max)
                max = num;
        }
        System.out.println("Largest : " + max);
    }
    // 2. Smallest Element
    static void smallest(int arr[]) {
        int min = arr[0];
        for(int num : arr) {
            if(num < min)
                min = num;
        }
        System.out.println("Smallest : " + min);
    }
    // 3. Reverse Array
    static void reverse(int arr[]) {
        System.out.print("Reverse : ");
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // 4. Sum of Elements
    static void sum(int arr[]) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        System.out.println("Sum : " + sum);
    }
    // 5. Average
    static void average(int arr[]) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        System.out.println("Average : " +
                (double)sum / arr.length);
    }
    // 6. Linear Search
    static void linearSearch(int arr[], int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Found at Index : " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
    // 7. Sort Array
    static void sort(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Sorted : " +
                Arrays.toString(arr));
    }
    // 8. Second Largest
    static void secondLargest(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Second Largest : " +
                arr[arr.length - 2]);
    }
    // 9. Check Sorted
    static void checkSorted(int arr[]) {
        boolean sorted = true;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println("Sorted : " + sorted);
    }
    // 10. Count Even & Odd
    static void evenOdd(int arr[]) {
        int even = 0;
        int odd = 0;
        for(int num : arr) {
            if(num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
    }
    public static void main(String[] args) {
        int arr[] = {10, 50, 30, 20, 40};
        largest(arr);
        smallest(arr);
        reverse(arr);
        sum(arr);
        average(arr);
        linearSearch(arr, 30);
        sort(arr);
        secondLargest(arr);
        checkSorted(arr);
        evenOdd(arr);
    }
}
