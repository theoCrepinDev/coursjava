package Partie1.Exercice1;

public class Exercice1Test {
    public static void main(String[] args) {
        MyFirstGeneric obj1 = new MyFirstGeneric();
        MyFirstGeneric obj2 = new MyFirstGeneric(10,11,13);

        obj1.setX(14);
        obj1.setY(15);
        obj1.setZ(16);

        obj1.display();
        obj2.display();

        MySecondGeneric obj3 = new MySecondGeneric(16,17,18,19);
        obj3.display();
    }
}
