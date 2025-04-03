package util;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  số nguyên
        System.out.println("Nhập số nguyên: "+Validator.TestInteger());

        //  số thực float
        System.out.println("Nhập số float: "+Validator.TestFloat());

        //  số thực double
        System.out.println("Nhập số double: "+Validator.TestDouble());

        //  boolean
        System.out.println("Nhập giá trị boolean : "+Validator.TestBoolean());

        //  chuỗi không rỗng
        System.out.println("Nhập chuỗi : "+Validator.TestString());


        //  email
        System.out.println("email"+Validator.TestEmail());


        //  số điện thoại
        System.out.println(" số điện thoại: "+Validator.TestPhone());

    }
}
