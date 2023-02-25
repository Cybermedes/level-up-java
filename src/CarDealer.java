import java.util.Scanner;

public class CarDealer {

    public static void main(String[] args) {

        System.out.println("You are the owner of a car dealership.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of cars do you sell?");
        String dataEntry = scanner.next();
        System.out.println(dataEntry);

    }
}