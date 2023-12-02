public class Car {

    String type;
    String  color;
    String plateNumber;
    boolean isVIP;

    public Car(String type, String color, String plateNumber, boolean isVIP) {
        this.type = type;
        this.color = color;
        this.plateNumber = plateNumber;
        this.isVIP = isVIP;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean getIsVIP() {
        return isVIP;
    }

    public void setIsVIP(boolean VIP) {
        isVIP = VIP;
    }
}
