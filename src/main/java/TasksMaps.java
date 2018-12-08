import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TasksMaps {


    public void execute() {

        List<String> flattened = flattenPreserveDuplicates(getMapOfString());
        System.out.println("Flattened with duplicates: " + flattened);

        List<String> flattenedNoDuplicates = flattenNoDuplicates(getMapOfString());
        System.out.println("Flattened with no duplicates: " + flattenedNoDuplicates);
    }

    private List<String> flattenPreserveDuplicates(Map<String, List<String>> mapOfString) {
        return mapOfString.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    private List<String> flattenNoDuplicates(Map<String, List<String>> mapOfString) {
        return mapOfString.values().stream()
                .filter(x -> x.remove("Duplicate-1"))
                .filter(x -> x.remove("Duplicate-2"))
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    private Map<String,List<String>> getMapOfString() {
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                list.add("List" + i +"-String" + j);
            }
            list.add("Duplicate-1");
            list.add("Duplicate-2");
            map.put("ListNumber" + i, list);
        }
        return map;
    }

}
