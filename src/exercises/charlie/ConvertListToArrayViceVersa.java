package exercises.charlie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertListToArrayViceVersa {

    // Program that converts a list to array and vice versa
    public static void main(String[] args) {
        List<String> programming = new LinkedList<>(List.of("Java", "Go", "Python", "Lua", "C"));

        String[] languages = programming.toArray(String[]::new);
        System.out.println("Array: " + Arrays.toString(languages));
        List<String> list = Arrays.asList(languages);
        System.out.println("List: " + list);
    }
}
