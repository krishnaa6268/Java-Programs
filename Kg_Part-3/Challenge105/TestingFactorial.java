package in.kkcoding.Challenge105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial  {
    public static void main(String[] args)
    {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {

            List<Future<Integer>> list= new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                FactorialCalculator task= new FactorialCalculator(i);
                //directly add the returned future by 'service: <Future<Integer>>' into tha list
                list.add(service.submit(task));
            }
            for (Future<Integer> future : list) {
                System.out.printf("\n Result is %d.", future.get());
            }
            service.shutdown();
            if(!service.awaitTermination(10, TimeUnit.SECONDS))
            {
                System.out.println("\nBahut hua bs...");
                service.shutdown();
            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
