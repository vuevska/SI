import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Master branch");
        System.out.println("vto branch");

        System.out.println(generateRandomNNumberLessThanM(10, 100));
    }

    // counts even numbers in an integer list
    public static int countEven(List<Integer> list) {
        return (int) list.stream().filter(i -> i % 2 == 0).count();
    }

    public static List<Integer> generateRandomNNumberLessThanM(int n, int m) {
        Random random = new Random();
        return random.ints(n, 0, m).boxed().collect(Collectors.toList());
    }
}
