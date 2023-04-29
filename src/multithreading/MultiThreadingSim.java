package multithreading;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.lang3.time.StopWatch;


public class MultiThreadingSim {
    public static void main(String[] args) {
        int n = 1000;
        StopWatch sw = StopWatch.createStarted();
        int numberOfCores =  Runtime.getRuntime().availableProcessors();
        Executor executor = Executors.newFixedThreadPool(90000);

        List<CompletableFuture<Void>> futures = IntStream.range(0,n)
                .boxed()
                .map(i -> (CompletableFuture.runAsync(()->{
                    try{
                        Thread.sleep(Math.min(1000 * i, 100000));
                        for (int j = 0; j < i; j++);
                        System.out.println("job done by me " + i);
                    } catch (Exception e) {
                        e.printStackTrace(System.out);
                    }
                },executor))).collect(Collectors.toList());
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()])).join();

    }
}
