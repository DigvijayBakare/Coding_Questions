package practice.java8collection.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFromCharactersOfStream {
    public static void main(String[] args) {
        // up-to java se 10
        String sentence = "Hello Duke";
        List<String> letters =
                sentence.chars()
                        .mapToObj(codePoint -> (char) codePoint)
                        .map(Object::toString)
                        .collect(Collectors.toList());
        System.out.println("letters = "+letters);

        // after introducing toString method in java se 11
        String sentence1 = "Hello Duke";
        List<String> letters1 =
                sentence1.chars()
                        .mapToObj(Character::toString)
                        .collect(Collectors.toList());
        System.out.println("letters = " + letters1);
    }
}
