package bai2;

public class Test {
    public static void main(String[] args) {
        // Tạo động vật bằng Factory Method
        Animal animal1 = AnimalFactory.getAnimal("dog");
        Animal animal2 = AnimalFactory.getAnimal("cat");
        
        animal1.speak();

        animal2.speak();

    }
}
