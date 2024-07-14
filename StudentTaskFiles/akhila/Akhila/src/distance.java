import java.util.Scanner;

public class BridgeLengthCalculator {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the train (in metres): ");
        double trainLength = scanner.nextDouble();

        System.out.print("Enter the speed of the train (in km/hr): ");
        double speedKmPerHour = scanner.nextDouble();

        System.out.print("Enter the time taken to cross the bridge (in seconds): ");
        double timeInSeconds = scanner.nextDouble();

        
        double speedInMetersPerSecond = speedKmPerHour * 1000 / 3600;

        
        double bridgeLength = (speedInMetersPerSecond * timeInSeconds) - trainLength;


        System.out.println("Length of the bridge = " + bridgeLength + " metres");

        
        scanner.close();
    }
}
