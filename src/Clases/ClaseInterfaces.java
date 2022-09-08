package Clases;

public class ClaseInterfaces {
    public static void main(String[] args) {

        Bicicleta b1 = new Bicicleta("Motanbike", true, "Prosegur");
        b1.setMarcha(true);

        b1.marchar(10);

    }
}
abstract class Vehiculo{
    public boolean marcha;
    public String marca;
    public int velocidad;
    public String seguro;

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}

class Bicicleta extends Vehiculo implements Conductor, Estructura, Proteccion{
    public boolean frenos;

    public Bicicleta(String marca, boolean frenos, String seguro){
        this.marcha = false;
        this.marca = marca;
        this.velocidad = 0;
        this.seguro = seguro;
        this.frenos = frenos;
    }

    public void setMarcha(boolean marcha) {
        this.marcha = marcha;
    }

    @Override
    public void marchar(int velocidad){
        this.velocidad = velocidad;
        if (this.marcha){
            System.out.println("La bici esta en movimiento a la velocidad: " + velocidad);
        }else{
            System.out.println(("La bici no esta en movimiento"));
        }

    }

    @Override
    public boolean tieneFrenos(){
        return this.frenos;
    }

    @Override
    public boolean seguro(){
        if (this.seguro == ""){
            return false;
        }
        return true;
    }
}

interface Conductor{
    public void marchar(int velocidad);

}

interface Estructura{
    public boolean tieneFrenos();
}

interface Proteccion{
    public boolean seguro();
}