package TpNro9;

import java.util.Scanner;

public class TpNro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;
        String genero;


        System.out.println("Ingrese su genero h para hombre o m para mujer");
        genero = sc.nextLine();
        genero.toLowerCase();

        while (!genero.equals("h") && !genero.equals("m")){
            System.out.println(genero);
            System.out.println("Ingrese solo h o m");
            System.out.println("Ingrese su genero h para hombre o m para mujer");
            genero = sc.nextLine();
            genero.toLowerCase();
        }

        System.out.println("Ingrese su altura en cm");
        altura = sc.nextInt();

        if (genero == "h")
            System.out.println("Su peso ideal es: " + (altura-110));
        else
            System.out.println("Su peso ideal es: " + (altura-120));
    }
}
