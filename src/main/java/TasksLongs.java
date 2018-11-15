import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TasksLongs {


    private List <Long> getListOfLongs () {
        List <Long> longs = new ArrayList<Long>();
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
        return longs;
    }

    private long findMaxElemnt (List <Long> longs) {
        Long minimum = Long.MIN_VALUE;

        return longs.stream()
                .max(Comparator.comparingLong(x -> Math.max(x,minimum)))
                .get();
    }

    public static void main(String[] args) {
        TasksLongs tasksLongs = new TasksLongs();

        System.out.println(tasksLongs.findMaxElemnt(tasksLongs.getListOfLongs()));
    }

}
