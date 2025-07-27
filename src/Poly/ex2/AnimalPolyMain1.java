package Poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    // 부모는 자식을 담을 수 있음
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        // 메서드 오버라이딩
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
