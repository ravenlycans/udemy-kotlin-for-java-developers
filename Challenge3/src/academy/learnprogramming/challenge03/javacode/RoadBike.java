package academy.learnprogramming.challenge03.javacode;

public class RoadBike extends Bicycle {
    // In millimeters
    private int tireWidth;

    public RoadBike(int cadence, int speed, int gear, int tireWidth) {
        super(cadence, speed, gear);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("This Road Bike has a tire width of " + tireWidth + "mm.");
    }
}
