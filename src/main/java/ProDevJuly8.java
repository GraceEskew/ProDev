public class ProDevJuly8 {

    public boolean turnOff() {
        return false;
    }

    public boolean turnOn() {
        return true;
    }


    public int uniqueID;
    public static int rosieCount = 23;

    public ProDevJuly8() {
        this.uniqueID = incrementRosieCount();
    }

    private static int incrementRosieCount() {
        return ++rosieCount;
    }

    private int getRosieCount() {
        return this.uniqueID;
    }
}
