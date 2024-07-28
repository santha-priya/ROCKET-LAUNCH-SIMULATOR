public class RocketLaunchSimulator {
    public static void main(String[] args) {
        int stage = 1;
        int fuel = 100;
        int altitude = 0;
        int speed = 1000;

        System.out.println("Launching the rocket...");
        for (int i = 1; i <= 10; i++) {
            if (fuel <= 0) {
                System.out.println("Mission Failed due to insufficient fuel.");
                return;
            }
            altitude += 10;
            fuel -= 10;
            System.out.println("Stage: " + stage + ", Fuel: " + fuel + "%, Altitude: " + altitude + " km, Speed: " + speed + " km/h");

            if (i == 5) {
                System.out.println("Stage 1 complete. Separating stage. Entering Stage 2.");
                stage = 2;
            }
        }
        System.out.println("Orbit achieved! Mission Successful.");
    }
}
