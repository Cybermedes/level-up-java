package exercises.beta;

import java.util.Arrays;

public class LargestElementArray {

    // Program that find the largest element in an array
    public static void main(String[] args) {

        double[] numbers = {4.44, 5.23, 1.74, 5.32, 8.96, 17.56, 6.35, 6.00, 9.78};
        double largest = numbers[0];

        for (double number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("The largest number in the array is " + largest);
        System.out.println("The largest number in the array is " + getLargestNumber(numbers));
    }

    // Using stream API to get the  largest value
    private static double getLargestNumber(double[] numbers) {
        return Arrays.stream(numbers)
                .max()
                .orElse(0.0);
    }
}
