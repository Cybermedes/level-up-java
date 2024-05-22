package exercises.beta;

public class LargestElementArray {

    public static void main(String[] args) {

        double[] numbers = {4.44, 5.23, 1.74, 5.32, 8.96, 17.56, 6.35, 6.00, 9.78};
        double largest = numbers[0];

        for (double number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number in the array is " + largest);
    }
}