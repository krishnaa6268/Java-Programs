package in.kkcoding.Challenge107;

import java.util.List;

public class StreamTesting {
    public static void main(String[] args)
    {
        List<String> names = List.of("Krishna","Manudhar","Swaroop","Brhamachari");

        names.stream().forEach(name -> System.out.println(name) );
    }
}
