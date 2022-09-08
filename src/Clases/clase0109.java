package Clases;

public class clase0109 {
    public static void main(String[] args) {

    }
}

abstract class AGeometria{
    public abstract double area();
    public abstract double perimetro();
}

class Geometria extends AGeometria{
    private double base;
    private double altura;

    @Override
    public double area(){
        return this.base * this.altura;
    }

    @Override
    public double perimetro(){
        return 0;
    }
}