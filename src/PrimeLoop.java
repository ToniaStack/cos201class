public class PrimeLoop {

    public static void main(String[] args) {

        int count = 0;

        for (int j = 2; count < 500; j++) {
            boolean isPrime = true;

            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(j);
                count++;
            }
        }
    }
}