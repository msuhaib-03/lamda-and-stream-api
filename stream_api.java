import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class stream_api{
    public static void main(String[] args)
    {
        List<Integer> num = Arrays.asList(4,5,6,7,9);
        Stream<Integer> data = num.stream();

        // HERE I AM MAPPING THE NUMBERS IN THE STREAM TO THEIR DOUBLE VALUE, AND THEN PRINTING THEM OUT //
        // MAP FUNCTION TAKES A FUNCTION AS AN ARGUMENT AND APPLIES IT TO EACH ELEMENT IN THE STREAM, RETURNING A NEW STREAM WITH THE MAPPED VALUES //
        Stream<Integer> mappedData = data.map(n -> n*2);
        mappedData.forEach(n -> System.out.println(n));

        // YOU CAN ONLY USE THE STREAM ONCE, AFTER THAT IT WILL BE CLOSED //
        // SO IF I RUN COUNT ON MY STREAM, I CANNOT USE IT AGAIN TO PRINT THE NUMBERS //
       // System.out.println(data.count());

        // HERE I AM TRYING TO PRINT THE NUMBERS IN THE STREAM, BUT IT WILL GIVE AN ERROR BECAUSE THE STREAM IS ALREADY CLOSED //
       // data.forEach(n -> System.out.println(n));

        // THE PURPOSE OF THE STREAM IS TO PERFORM OPERATIONS ON THE DATA, NOT TO STORE IT. SO IF YOU WANT TO USE THE STREAM MULTIPLE TIMES, YOU NEED TO CREATE A NEW STREAM EACH TIME //
        // MOREOVER IT HELPS PREVENT DATA LEACKAGE OR CORRUPTION AND PREVENTS USE OF UNUSED RESOURCES //
    }
}