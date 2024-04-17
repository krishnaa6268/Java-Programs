package in.kkcoding.Challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExeService {
    public static void main(String[] args)
    {
        try(ExecutorService service= Executors.newSingleThreadExecutor()){
            PrintNumbers task = new PrintNumbers();
            service.submit(task);
        }
    }
}
