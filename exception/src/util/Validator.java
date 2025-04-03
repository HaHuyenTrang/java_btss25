package util;

import java.util.regex.Pattern;
import java.util.Scanner;

public class Validator {

    // Validate số nguyên
    public static boolean TestInteger() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Nhập số nguyên: ");
            input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println("Không được để trống");
                continue;
            }
            try {
                Integer.parseInt(input);
                System.out.println(input + " là số nguyên");
                return true;
            } catch (NumberFormatException e) {
                System.out.println(input + " không phải số nguyên");
            }
        }
    }

    // Validate số thực float
    public static boolean TestFloat() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Nhập số thực float: ");
            input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println("Không được để trống");
                continue;
            }
            try {
                Float.parseFloat(input);
                System.out.println(input + " là số float");
                return true;
            } catch (NumberFormatException e) {
                System.out.println(input + " không phải số thực");
            }
        }
    }

    // Validate số thực double
    public static boolean TestDouble() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Nhập số thực double: ");
            input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println("Không được để trống");
                continue;
            }
            try {
                Double.parseDouble(input);
                System.out.println(input + " là số double");
                return true;
            } catch (NumberFormatException e) {
                System.out.println(input + " sai định dạng");
            }
        }
    }

    // Validate Boolean
    public static boolean TestBoolean() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Nhập giá trị boolean (true/false): ");
            input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println("Không được để trống");
                continue;
            }
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                System.out.println(input + " là kiểu boolean hợp lệ");
                return true;
            } else {
                System.out.println("Kiểu dữ liệu khác boolean");
            }
        }
    }

    // Validate String
    public static boolean TestString() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Nhập chuỗi (không được trống): ");
            input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println("Không được để trống");
                continue;
            }
            input = input.trim();
            if (input.isEmpty()) {
                System.out.println("Không được để trống");
                continue;
            }
            System.out.println(input + " chuỗi đúng định dạng");
            return true;
        }
    }

    // Validate Email
    public static boolean TestEmail() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Nhập email: ");
            input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println("Không được để trống");
                continue;
            }
            String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
            if (Pattern.matches(emailRegex, input)) {
                System.out.println(input + " là email hợp lệ");
                return true;
            } else {
                System.out.println(input + " không phải email hợp lệ");
            }
        }
    }

    // Validate số điện thoại Việt Nam
    public static boolean TestPhone() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Nhập số điện thoại: ");
            input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println("Không được để trống");
                continue;
            }
            if (input.length() != 10) {
                System.out.println("Số điện thoại phải có 10 chữ số");
                continue;
            }
            String phoneRegex = "^(0[35789])[0-9]{8}$";
            if (Pattern.matches(phoneRegex, input)) {
                System.out.println(input + " là số điện thoại di động Việt Nam");
                return true;
            } else {
                System.out.println("Số điện thoại sai định dạng");
            }
        }
    }
}
