package bai3;

public class Car {
    public String engine;
    public int seats;
    public String color;

    // Constructor private để chỉ có thể tạo từ Builder
    public Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.color = builder.color;
    }

    // Hiển thị thông tin xe
    public void showCarInfo() {
        System.out.println("Car hãng: " + engine + ", ghế: " + seats + ", màu: " + color );
    }
}
