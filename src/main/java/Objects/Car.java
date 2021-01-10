package Objects;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Car implements Serializable {
    private final UUID carId = UUID.randomUUID();
    private String regnumber;
    private String brand;
    private String model;
    private LocalDate regDate;


    public Car( String regnumber, String brand, String model) {
        this.regnumber = regnumber;
        this.brand = brand;
        this.model = model;
        this.regDate = LocalDate.now();
    }

    public UUID getCarId() {
        return carId;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }
}
