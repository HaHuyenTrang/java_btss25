package bai3;


public class CarBuilder {
    public String engine;
    public int seats;
    public String color;

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return engine;
    }

    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }
    public int getSeats() {
        return seats;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return color;
    }

    public Car build() {
        return new Car(this);
    }
}
