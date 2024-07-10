public class BridgeLengthCalculator {
    public static void main(String[] args) {
        
        int trainLength = 130; 
        int speed = 45;         
        int time = 30; 

        
        double speedMS = speed * 1000.0 / 3600.0;


        double distanceCovered = speedMS * time;

        
        double bridgeLength = distanceCovered - trainLength;

        System.out.println("The length of the bridge is: " + bridgeLength + " meters");
    }
}

