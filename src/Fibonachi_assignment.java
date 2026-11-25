public class Fibonachi_assignment {
    public static void main(String[] args) {
        long first = 0;
        long second = 1;

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": " + first);

            long next = first + second;
            first = second;
            second = next;
        }
    }
}
