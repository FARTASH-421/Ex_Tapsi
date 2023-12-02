public class Driver {
    String firstName;
    String lastName;
    String phoneNumber;
    String status = "IN_RIDE";
    Car car;


    public Driver(String firstName, String lastName, String phoneNumber, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.car = car;
        this.status = "AVAILABLE";
    }

    public String getFullName() {
       return this.firstName +" "+ this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Car getCar() {
        return car;
    }

    public String getStatus() {
        return status;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
