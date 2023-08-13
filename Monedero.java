public class Monedero {

    double dinero;

    public Monedero(double dinero) {
        System.out.println("Deposite su dinero");
        this.dinero = dinero;
        System.out.println("Dinero depositado");
    }

    public void retirarDinero(double dinero) {
        System.out.println("Retirar dinero.");
        if (this.dinero >= dinero) {
            this.dinero = this.dinero - dinero;
            System.out.println("Tome su dinero de la bandeja.");
        } else {
            System.out.println("La cuenta no tiene suficiente dinero.");
        }
    }

    public void depositarDinero(double dinero) {
        System.out.println("Depositar dinero.");
        this.dinero = this.dinero + dinero;
        System.out.println("Su depósito ha sido recibido.");
    }

    public void mostrarSaldo() {
        System.out.println("---- ESTADO DE LA CUENTA X-XX-X");
        System.out.println("---- Saldo a la fecha:         ");
        System.out.println(String.format("----      %s", this.dinero));
        System.out.println("---- FIN DETALLE DE CUENTA");
    }
}
