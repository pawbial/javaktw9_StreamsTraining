import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class TasksLongs {


    public void execute() {
        List<Long> knownArrayOfLongs = getListOfLongs();
        List<Long> knownArrayOfRandomLongs = getListOfRandomPositiveLongs(100000);

        Long maxElement1 = findMaxElemnt(knownArrayOfLongs);
        System.out.println("Max element from known list is " + maxElement1);
        Long maxElement2 = findMaxElemnt(knownArrayOfRandomLongs);
        System.out.println("Max element from random list is " + maxElement2);


        Long minElement1 = findMinElemnt(knownArrayOfLongs);
        System.out.println("Min element from known list is " + minElement1);
        Long minElement2 = findMinElemnt(knownArrayOfRandomLongs);
        System.out.println("Min element from random list is " + minElement2);

        Long medianElement1 = findMedianElement(knownArrayOfLongs);
        System.out.println("Median element from known list is " + medianElement1);
        Long medianElement2 = findMedianElement(knownArrayOfRandomLongs);
        System.out.println("Median element from random list is " + medianElement2);

        Long countGreaterThen1 = countLongsGreaterThan(knownArrayOfLongs, 1000L);
        System.out.println("Amount of elements greater then 1000 is " + countGreaterThen1);
        Long countGreaterThen2 = countLongsGreaterThan(knownArrayOfRandomLongs, Long.MAX_VALUE / 2);
        System.out.println("Amount of random elements greater then 1000000000 is " + countGreaterThen2);
    }


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

    private List <Long> getSimpleListofLongs() {
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

    private List<Long> getListOfRandomPositiveLongs(int amountOfLongs) {
        List<Long> longs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < amountOfLongs; i++) {
            long randomLong = random.nextLong();
            randomLong = randomLong > 0 ? randomLong : randomLong * (-1);
            longs.add(randomLong);
        }
        return longs;
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


}
