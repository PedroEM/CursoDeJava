package TpNro6;

import java.awt.desktop.SystemSleepEvent;

public class TpNro6 {
    public static void main(String[] args) {
        //Funciones trigonométricas
        System.out.println("Funciones trigonometricas");
        double seno = Math.sin(Math.PI/2);
        System.out.println("Seno de pi/2 = " + seno);
        double coseno = Math.cos(Math.PI);
        System.out.println("Coseno de pi = " + coseno);
        double tangente = Math.tan(Math.PI/4);
        System.out.println("Tangente de pi/4 = " + tangente);
        double arctangente = Math.atan(Math.PI/2);
        System.out.println("Arcotangente de pi/2 = " + arctangente);
        double arctangente2 = Math.atan2(75, 45);
        System.out.println("Theta de y=75 x=45 : " + arctangente2);
        //función exponencial y su inversa
        System.out.println("Funcion exponencial y su inversa");
        double exponencial = Math.exp(2);
        System.out.println("Exponencial de 2: " + exponencial);
        double logaritmo = Math.log(2);
        System.out.println("Logaritmo de 2: " + logaritmo);
        //Las dos constantes PI y e
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);
    }
}
