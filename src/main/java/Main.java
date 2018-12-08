public class Main {


    public static void main(String[] args) {


        TasksLongs tasksLongs = new TasksLongs();
        System.out.println("TASKS LONGS");
        tasksLongs.execute();
        System.out.println();
        System.out.println("TASKS INTS");
        TasksInts tasksInts = new TasksInts();
        tasksInts.execute();
        System.out.println();
        System.out.println("TASKS LISTS");
        TasksLists tasksLists = new TasksLists();
        tasksLists.execute();
        System.out.println("TASKS MAPS");
        TasksMaps tasksMaps = new TasksMaps();
        tasksMaps.execute();


    }
}
