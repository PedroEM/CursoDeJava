package TpNro11;

import java.util.Random;

public class UsoCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("cuenta1",5000);
        CuentaCorriente cuenta2 = new CuentaCorriente("cuenta2", 0);
        cuenta1.transferir(cuenta2, 2500);
        System.out.println(cuenta1.datos() + " Saldo: " + cuenta1.getSaldo());
        System.out.println(cuenta2.datos() + " Saldo: " + cuenta2.getSaldo());
    }
}

class CuentaCorriente{
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;
    Random random = new Random();

    public CuentaCorriente(String nombreTitular, double saldo){
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = random.nextLong(Long.MAX_VALUE);
    }

    public void ingresarSaldo(double saldo){
        this.saldo += saldo;
    }

    public void reintegro(double saldo){
        if (this.saldo < saldo){
            System.out.println("No se puede hacer el reintegro");
        }else{
            this.ingresarSaldo(saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String datos(){
        return "Titular: " + this.nombreTitular +
                " Numero de cuenta: " + this.numeroCuenta;
    }

    public void transferir(CuentaCorriente cuenta, double saldo){
        if (this.saldo == 0){
            System.out.println("No posee saldo en la cuenta");
        }else{
            if (this.saldo < saldo){
                System.out.println("No posee la cantidad de saldo que desea transferir");
            }else{
                this.saldo -= saldo;
                cuenta.ingresarSaldo(saldo);
                System.out.println("Se a transferido "+saldo+" a la cuenta "+cuenta.datos());
            }
        }
    }
}
