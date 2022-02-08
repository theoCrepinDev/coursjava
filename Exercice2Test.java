package Partie1.Exercice2;

public class Exercice2Test {
    public static void main(String[] args) {
        GenericStack pile1 = new GenericStack();

        pile1.push(12);
        pile1.push(16);
        pile1.push(10);

        GenericStack.addTo(pile1, 7);

        System.out.println(pile1.pop());
        System.out.println(pile1.pop());
    }
}
