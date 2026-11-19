public class Loops {

    void loop() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "). RUMBLING!!!");
            System.out.println();
            for (int j = 0; j <= 3; j++) {
                System.out.print("It's coming.");
            }
            System.out.println(); // moves to a new line after inner loop
        }
    }

    // Keeping your earlier loops in case you need them for practice
    void whileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    void doWhileLoop() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }

    // Class exercises noted at the bottom of the screenshot:
    // 1. Make a loop to find the first 500 prime numbers using a for loop
    // 2. Write a method in Java that generates the first n numbers of the Fibonacci sequence
    //    (starting with 0 and 1 and adding the 2 previous numbers)
}