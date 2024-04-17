package in.kkcoding.Challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExecService {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(5)) {

            for (int i = 0; i < 10; i++) {
                SleepTask t1 = new SleepTask();
                service.submit(t1);

            }
            service.shutdown();

            if(!service.awaitTermination(10, TimeUnit.SECONDS))
            {
                System.out.println("\nEMERGENCY SHUT_DOWN...");
                service.shutdown();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
