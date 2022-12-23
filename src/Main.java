import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(5,6,7,8,9,10);

        Stream ar = Stream.concat(list1.stream(), list2.stream());
        List<Integer> all = (List<Integer>) ar.collect(Collectors.toList());
        System.out.println("All eleent in list: " + all);
        HashSet<Integer> uniqueelement = (HashSet<Integer>)all.stream().collect(Collectors.toSet());
        System.out.println("unique element " + uniqueelement);
    }
}