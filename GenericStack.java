package Partie1.Exercice2;

import java.util.List;
import java.rmi.Remote;
import java.util.ArrayList;

public class GenericStack {
    private List<Object> pile;
    private int top;

    public GenericStack(){
        pile = new ArrayList<>();
        top = 0;
    }

    public void push(Object i){
        pile.add(i);
        top++;
    }

    public Object pop(){
        Object pop = pile.get(top - 1);
        pile.remove(top - 1);
        top--;
        return pop;
    }

    public int sizeStack(){
        return top + 1;
    }

    public static void addTo(GenericStack pile, Object elements){
        pile.push(elements);
    }
}
