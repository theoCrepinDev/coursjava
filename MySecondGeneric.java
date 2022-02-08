package Partie1.Exercice1;

public class MySecondGeneric extends MyFirstGeneric {
    private double W;

    public MySecondGeneric(){
        super();
        W = 0;
    }

    public MySecondGeneric(double x, double y, double z, double w){
        super(x,y,z);
        W = w;
    }

    public double getW(){
        return W;
    }

    public void setW(double w){
        W = w;
    }

    public void display(){
        super.display();
        System.out.println("Valeur de W : " + W);
    }
}
