public class ArrayTryCatch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println("Accessing element at index 5: " + numbers[5]); // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
            System.out.println("Exception details: " + e.getMessage());
        }
        System.out.println("Program finished.");
    }
}