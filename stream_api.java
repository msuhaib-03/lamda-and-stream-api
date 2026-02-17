import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class stream_api{
    public static void main(String[] args)
    {
        List<Integer> num = Arrays.asList(6,3,2,1,7);
//        Stream<Integer> data = num.stream();

        // YOU CAN ONLY USE THE STREAM ONCE, AFTER THAT IT WILL BE CLOSED //
        // SO IF I RUN COUNT ON MY STREAM, I CANNOT USE IT AGAIN TO PRINT THE NUMBERS //
//         System.out.println(data.count());

        // HERE I AM TRYING TO PRINT THE NUMBERS IN THE STREAM, BUT IT WILL GIVE AN ERROR BECAUSE THE STREAM IS ALREADY CLOSED //
//         data.forEach(n -> System.out.println(n));

        // HERE I AM MAPPING THE NUMBERS IN THE STREAM TO THEIR DOUBLE VALUE, AND THEN PRINTING THEM OUT //
        // MAP FUNCTION TAKES A FUNCTION AS AN ARGUMENT AND APPLIES IT TO EACH ELEMENT IN THE STREAM, RETURNING A NEW STREAM WITH THE MAPPED VALUES //
//        Stream<Integer> mappedData = data.map(n -> n*2);
//        mappedData.forEach(n -> System.out.println(n));

        // MOST IMPORTANTLY THAT YOU CAN DO THAT IN ONE SINGLE LINE AS WELL LIKE THIS
        // We are getting a list and on that we are creating a stream and on that stream we are applying map
        // and it creates a stream and on that stream we are ruuning a forEach loop and print values //
//        num.stream()
//                .filter(n -> n%2==1)
//                .sorted()
//                .map(n -> n*2)
//                .forEach(n -> System.out.println(n));
        // 3 streams are created here and we are not wasting resources because it is not copying data from one to another //
        // in .filter we are creating a stream of only odd numbers.

        // Now if we want to see how filter works and what does it contain, we can write it as well like this:
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                return n%2==1;
//            }
//        };
//        // Amazingly all the above code can be converted to lambda expression as well like this:
//        Predicate<Integer> predicate1 = n-> n%2==1;
        // and all this is written in .filter which does all the thing for you.

        // Next thing that can be done is that if wedon't want to print values but add them up, we use .reduce()
        // it takes identifier as zero, which is always 0, and then takes the values and add them up.
        int sum = num.stream()
                .filter(n -> n%2==1)
                .map(n -> n*2)
                .reduce(0, (a,b) -> a+b);
        System.out.println(sum);

        // THE PURPOSE OF THE STREAM IS TO PERFORM OPERATIONS ON THE DATA, NOT TO STORE IT. SO IF YOU WANT TO USE THE STREAM MULTIPLE TIMES, YOU NEED TO CREATE A NEW STREAM EACH TIME //
        // MOREOVER IT HELPS PREVENT DATA LEACKAGE OR CORRUPTION AND PREVENTS USE OF UNUSED RESOURCES //
    }
}