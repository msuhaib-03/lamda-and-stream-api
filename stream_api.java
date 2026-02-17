import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class stream_api{
    public static void main(String[] args)
    {
        List<Integer> num = Arrays.asList(4,5,6,7,9);
        Stream<Integer> data = num.stream();

        // YOU CAN ONLY USE THE STREAM ONCE, AFTER THAT IT WILL BE CLOSED //
        // SO IF I RUN COUNT ON MY STREAM, I CANNOT USE IT AGAIN TO PRINT THE NUMBERS //
       // System.out.println(data.count());

        // HERE I AM TRYING TO PRINT THE NUMBERS IN THE STREAM, BUT IT WILL GIVE AN ERROR BECAUSE THE STREAM IS ALREADY CLOSED //
       // data.forEach(n -> System.out.println(n));
    }
}