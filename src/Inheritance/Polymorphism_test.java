package Inheritance;

class Animal {
    public void move() {
        System.out.println("동물이 움직임");
    }
}
class Human extends Animal {
    public void move() {
        System.out.println("두발로 걷기");
    }
}
class Tiger extends Animal {
    public void move() {
        System.out.println("네발로 걷기");
    }
}
class Eagle extends Animal {
    public void move() {
        System.out.println("날아가기");
    }
}
public class Polymorphism_test {
    public static void main(String[] args) {
        Polymorphism_test test = new Polymorphism_test();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());
    }
    public void moveAnimal(Animal animal) {
        animal.move();
    }
}

