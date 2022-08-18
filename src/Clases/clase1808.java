package Clases;

import com.sun.source.tree.ArrayAccessTree;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;

public class clase1808 {
    public static void main(String[] args) {
        int a,b;
        a = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero:"));

        int result = a + b;

        System.out.println(a + " + " + b + " = " + result);
        JOptionPane.showMessageDialog(null,a + " + " + b + " = " + result);
        System.out.println();

        if (result == 100){
            System.out.println("El numero es igual a 100");
            JOptionPane.showMessageDialog(null,"El numero es igual a 100");
        }else if (result > 100){
            System.out.println("El numero es mayor a 100");
            JOptionPane.showMessageDialog(null,"El numero es mayor a 100 ya que es " + result);
        }else if (result < 0){
            System.out.println("El numero es negativo");
            JOptionPane.showMessageDialog(null,"El numero es negativo");
        }

        System.out.println();

        String bandera = "s";
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner escaner = new Scanner(System.in);
        while (!bandera.equals("f")){
            System.out.println("ingrese un numero (f para detener el programa)");
            bandera = escaner.nextLine();
            try{
                numeros.add(Integer.parseInt(bandera));
            }
            catch (Exception e){}
        }

       //agregar foreach

    }
}
