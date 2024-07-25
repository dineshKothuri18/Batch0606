public class Metro {
    String trainName;
    String speed;
    String colour;
    String startTime;
    String stopTime;
    String fStationname;
    String lStationname;
    void print(){
        System.out.println("Train name is  " +this.trainName );
        System.out.println("Speed of the train is  " +this.speed);
        System.out.println("Colour of the train is  " +this.colour);
        System.out.println("Start time of the train is  " +this.startTime);
        System.out.println("First station where the train is start  " +this.fStationname);
        System.out.println("Last station where the train is start " +this.lStationname);
        System.out.println("Stop time of the train is " +this.stopTime);
        System.out.println("*****************************************************************");
    }

    void start() {
        System.out.println("The train started in few minutes");
        System.out.println("////////////////////////////////////////////////////////////////");
    }
    void end(){
        System.out.println("The train stop here");
        System.out.println("..................................................................");
    }
    void stop(){
        System.out.println("In every station the  train stopped for 2 minutes");
        System.out.println("__________________________________________________________________");
    }
    void ticket(){
        System.out.println("Get your tickets from the ticket counter");
        System.out.println("Otherwise your are not allowed into the train");
        System.out.println("------------------------------------------------------------------");
    }
    void clean(){
        System.out.println("Maintain the train clean");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}