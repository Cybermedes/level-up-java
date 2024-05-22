package exercises.beta;

public class CheckStringNullEmpty {

    //Program that checks if a string is null, empty or neither
    public static void main(String[] args) {
        String[] myStrings = {null, "", "ABC"};
        for (String myString : myStrings) {
            System.out.println("The string is " + checkNullEmpty(myString));
        }
    }

    static String checkNullEmpty(String userStr) {
        if (userStr == null) {
            return "NULL";
        } else if (userStr.isEmpty()) {
            return "EMPTY";
        } else {
            return "neither NULL or EMPTY";
        }
    }
}
