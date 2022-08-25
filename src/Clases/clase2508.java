package Clases;

class Caja{
    private Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        System.out.println("Se esta atendiendo al cliente: " + this.cliente.toString());
    }

    public void depositar(double saldo){
        this.cliente.setCuenta(this.cliente.getCuenta() + saldo);
        System.out.println("Se a depositado " + saldo);
        System.out.println("Saldo nuevo: " + this.cliente.getCuenta());
    }

    public void extraer(double saldo){
        if (this.cliente.getCuenta() == 0)
            System.out.println("No posee dinero para la extraccion");
        else{
            if(saldo > this.cliente.getCuenta())
                System.out.println("No posee la cantidad de dinero que desea extraer");
            else {
                this.cliente.setCuenta(this.cliente.getCuenta() - saldo);
                System.out.println("Se a extraido " + saldo);
                System.out.println("Saldo restante: " + this.cliente.getCuenta());
            }
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo: " + this.cliente.getCuenta());
    }
}

class Cliente{
    private int nroCliente;
    private String nombre;
    private double cuenta;

    public Cliente(int nroCliente, String nombre, double cuenta){
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    public double getCuenta() {
        return cuenta;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", numero cliente: " +
                this.nroCliente;
    }
}

public class clase2508 {

    public static void main(String[] args) {
        Cliente clientes [] = {
                new Cliente(2, "a", 100),
                new Cliente(2,"b",1000)
        };

        Caja caja1 = new Caja();

        caja1.setCliente(clientes[0]);
        caja1.consultarSaldo();
        caja1.extraer(200);
        caja1.extraer(50);
        caja1.depositar(25.5);

        caja1.setCliente(clientes[1]);
        caja1.consultarSaldo();
        caja1.extraer(1000);
        caja1.extraer(200);
    }
}
