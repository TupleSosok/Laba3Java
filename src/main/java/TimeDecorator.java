public class TimeDecorator {
    public static long getTime(Runnable runnable){
        long startTime = System.nanoTime();
        runnable.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
