package Poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

//        Animal a = new Animal();
//        a.sound();

        Animal[] animalArr = {new Dog(),new Cat(),new Caw()};

        for(Animal eachAni:animalArr) {
            soundAnimal(eachAni);
        }
    }

    private static void soundAnimal(Animal eachAni) {
        System.out.println("동물 소리 테스트 시작");
        eachAni.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
