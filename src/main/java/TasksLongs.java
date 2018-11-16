import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TasksLongs {


    private List <Long> getListOfLongs() {
        List<Long> longs = new ArrayList<Long>();
        longs.add(1234L);
        longs.add(1345L);
        longs.add(345345L);
        longs.add(154545L);
        longs.add(345687L);
        longs.add(346958L);
        longs.add(234567L);
        longs.add(213498L);
        longs.add(2349875L);
        longs.add(123856L);
        longs.add(2340978L);
        longs.add(12L);
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

    public static void main(String[] args) {
        TasksLongs tasksLongs = new TasksLongs();

        System.out.println(tasksLongs.findMaxElemnt(tasksLongs.getListOfLongs()));
        System.out.println();
        System.out.println(tasksLongs.findMinElemnt(tasksLongs.getListOfLongs()));
        System.out.println();
        System.out.println(tasksLongs.findMedianElement(tasksLongs.getSimpleList()));
        System.out.println();
    }

}
