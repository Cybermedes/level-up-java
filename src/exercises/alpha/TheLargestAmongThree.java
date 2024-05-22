package exercises.alpha;

public class TheLargestAmongThree {

    //Program that finds the largest number between 3 numbers
    public static void main(String[] args) {

        int myNum1 = 14, myNum2 = 45, myNum3 = 8;

        if (myNum1 >= myNum2 && myNum1 >= myNum3) {
            System.out.println(myNum1 + " is the largest number.");
        } else if (myNum2 >= myNum1 && myNum2 >= myNum3) {
            System.out.println(myNum2 + " is the largest number.");
        } else {
            System.out.println(myNum3 + " is the largest number.");
        }
    }
}