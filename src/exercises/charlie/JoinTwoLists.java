package exercises.charlie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JoinTwoLists {

    // Program that joins two lists using different methods
    public static void main(String[] args) {
        List<String> programmingOne = new ArrayList<>(List.of("Java", "Go","Python"));

        List<String> programmingTwo = new ArrayList<>(List.of("Scala", "Kotlin", "C"));

        System.out.println("List one:");
        programmingOne.forEach(System.out::println);

        System.out.println("List two:");
        programmingTwo.forEach(System.out::println);

        System.out.println("Combined lists:");
        System.out.println(joinListsUsingInstanceMethod(programmingOne, programmingTwo));
        System.out.println(joinListsUsingStream(programmingOne, programmingTwo));
    }

    private static List<String> joinListsUsingInstanceMethod(List<String> listOne, List<String> listTwo) {
        List<String> finalList = new ArrayList<>();
        finalList.addAll(listOne);
        finalList.addAll(listTwo);
        return finalList;
    }

    private static List<String> joinListsUsingStream(List<String> listOne, List<String> listTwo) {
        return Stream.concat(listOne.stream(), listTwo.stream())
                .toList();
    }
}
