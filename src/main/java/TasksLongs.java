import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TasksLongs {


    private List <Long> getListOfLongs() {
        List<Long> longs = new ArrayList<Long>();
        longs.add(1251L);
        longs.add(716L);
        longs.add(2616L);
        longs.add(2L);
        longs.add(172L);
        longs.add(95L);
        longs.add(723L);
        longs.add(307L);
        longs.add(251L);
        longs.add(628L);
        longs.add(1232L);
        return longs;
    }

    private List <Long> getSimpleList () {
        List <Long> simpleList = new ArrayList<>();
        simpleList.add(1L);
        simpleList.add(2L);
        simpleList.add(3L);
        simpleList.add(4L);
        simpleList.add(5L);
        simpleList.add(6L);
        simpleList.add(7L);

        return simpleList;
    }


    private long findMaxElemnt(List<Long> longs) {
        Long minimum = Long.MIN_VALUE;

        return longs.stream()
                .max(Comparator.comparingLong(x -> Math.max(x, minimum)))
                .get();
    }

    private long findMinElemnt(List<Long> longs) {
        Long minimum = Long.MAX_VALUE;

        return longs.stream()
                .min(Comparator.comparingLong(x -> Math.min(x, minimum)))
                .get();
    }

    private long findMedianElement(List<Long> longs) {

        Object[] medianValue = longs.stream()
                .sorted()
                .toArray();
        return (long) medianValue[medianValue.length / 2];
    }

    private long countLongsGreaterThan (List<Long> longs, long minimalLongValue) {

        return longs.stream()
                .filter(x -> x > minimalLongValue)
                .count();

    }

    public static void main(String[] args) {
        TasksLongs tasksLongs = new TasksLongs();

        System.out.println(tasksLongs.findMaxElemnt(tasksLongs.getListOfLongs()));
        System.out.println();
        System.out.println(tasksLongs.findMinElemnt(tasksLongs.getListOfLongs()));
        System.out.println();
        System.out.println(tasksLongs.findMedianElement(tasksLongs.getSimpleList()));
        System.out.println();
        System.out.println(tasksLongs.countLongsGreaterThan(tasksLongs.getSimpleList(), 2L));
    }

}
