package exercises.alpha;

public class SwapTwoNumbers {

    /*
    Swap two numbers in java. One by using a temporary variable
    the second doesn't use temporary variable
    */
    public static void main(String[] args) {

        int first = 15634;
        int second = 93641;
        System.out.println("------Before------");
        System.out.println("First= " + first);
        System.out.println("Second= " + second);

        int temporario = first;
        first = second;
        second = temporario;

        System.out.println("------After------");
        System.out.println("First= " + first);
        System.out.println("Second= " + second);

        int third = 1456;
        int fourth = 5385;

        System.out.println("------Before------");
        System.out.println("First= " + third);
        System.out.println("Second= " + fourth);

        third = third - fourth;
        fourth = third + fourth;
        third = fourth - third;

        System.out.println("------After------");
        System.out.println("Third= " + third);
        System.out.println("Fourth= " + fourth);
    }
}