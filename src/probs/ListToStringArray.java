package probs;

import java.util.Arrays;
import java.util.List;

public class ListToStringArray {
    public static void main(String[] args) {
        // Sample list of tags
        List<String> tags = List.of("tag1", "tag2", "tag3");

        // Convert List<String> to String[]
        String[] tagsArray = tags.toArray(new String[0]);

        System.out.println(Arrays.toString(tagsArray));
    }
}
