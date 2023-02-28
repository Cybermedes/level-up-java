import java.util.Locale;

public class StandardDeviation {
    /*
    Program to calculate the Standard Deviation of an array.
    Standard Deviation is a measure of how spread out the numbers are.
    First, calculate the arithmetic average of all samples; then, do
    the value of each sample minus the AA; calculate each one to the power of
    2; sum all of them and then divide by the number of samples; the SD is the
    square root of the result.
     */
    public static void main(String[] args) {

        double[] myArray = {12.25, 41.45, 18.52, 20.0, 19.20, 25.12, 30.1, 28.8};
        double arraySD = calculateSD(myArray);
        System.out.printf(Locale.US,"The Standard Deviation is %.3f", arraySD);
    }

    private static double calculateSD(double[] values) {
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }

        double average = sum / values.length;
        double variance = 0.0;

        for (double value: values) {
            variance += Math.pow(value - average, 2);
        }
        return Math.sqrt(variance / values.length);
    }
}
