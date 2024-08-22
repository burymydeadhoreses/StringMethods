import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(String.class.getMethods())
                .forEach(method -> System.out.println(method + "\n"));
    }
}