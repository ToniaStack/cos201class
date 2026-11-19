public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Physics physics = new Physics();
        System.out.println("Potential Energy: " + physics.potentialEnergy(50, 56));
        System.out.println("Velocity v: " + physics.v(10, 5, 2));
        System.out.println("Gravity: " + physics.getGravity());

        Loops loops = new Loops();
        loops.loop();
    }
}