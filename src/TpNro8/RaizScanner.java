package TpNro8;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        double numero = sc.nextDouble();

        double resultado = Math.sqrt(numero);
        System.out.println("La raiz de " + numero + " es: " + resultado);

    }
}
