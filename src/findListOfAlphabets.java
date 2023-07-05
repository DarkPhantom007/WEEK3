//Problem: Find alphabets that are within A-G from a list of Alphabet-character.
//        List<Character> listOfAlphabets = Arrays.asList('a','r', 'w', 'u', 'e', 'c', 'g');
//        */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findListOfAlphabets {
    public static void main(String[] args) {
        List<Character> listOfAlphabets = Arrays.asList('a', 'r', 'w', 'u', 'e', 'c', 'g');
        List<Character> result = new ArrayList<>();


        for (char alphabet : listOfAlphabets) {
            if (alphabet >= 'a' && alphabet <= 'g') {
                result.add(alphabet);
            }
        }

        System.out.println(result);
    }
}

