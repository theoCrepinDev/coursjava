package Partie1.Exercice1;

public class MyFirstGeneric{
    private double X;
    private double Y;
    private double Z;

    public MyFirstGeneric(double X, double Y, double Z){
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    public MyFirstGeneric(){
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
    }

    //guetters
    public double getX(){
        return this.X;
    }

    public double getY(){
        return this.Y;
    }

    public double getZ(){
        return this.Z;
    }

    //setter
    public void setX(double X){
        this.X = X;
    }

    public void setY(double Y){
        this.Y = Y;
    }

    public void setZ(double Z){
        this.Z = Z;
    }

    public void display(){
        System.out.println("Valeur de l'objet : \nValeur de X : " + X + "\nValeur de Y : " + Y + "\nValeur de Z : " + Z);
    }
}