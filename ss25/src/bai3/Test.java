package bai3;

public class Test {
    public static void main(String[] args) {
        // Tạo các đối tượng Car bằng Builder
        Car v = new CarBuilder().setEngine("vinfat luxA").setSeats(9).setColor("black").build();

        Car M = new CarBuilder().setEngine("MAybach").setSeats(2).setColor("white").build();


        v.showCarInfo();
        M.showCarInfo();
    }
}
