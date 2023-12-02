
public class Ride {

    Driver driver;
    Passenger passenger;
    String origin;
    String destination;
    Integer price;
    String status;


    public Ride(Driver driver, Passenger passenger, String origin, String destination, Integer price) {
        this.driver = driver;
        this.passenger = passenger;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.status = "CREATED";
    }

    public void start() {
        if (status.equals("CREATED")) {
            this.status = "IN_PROGRESS";
            driver.setStatus("IN_RIDE");
            passenger.setStatus("IN_RIDE");
        } else {
            this.status = "INVALID";
            driver.setStatus("AVAILABLE");
            passenger.setStatus("AVAILABLE");
        }
    }

    public void finish() {
        if(status.equals("IN_PROGRESS")) {
            this.status = "FINISHED";
            driver.setStatus("AVAILABLE");
            passenger.setStatus("AVAILABLE");
        }else{
            this.status = "INVALID";
            driver.setStatus("AVAILABLE");
            passenger.setStatus("AVAILABLE");

        }
    }

    public Driver getDriver() {
        return driver;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getStatus() {
        return status;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
