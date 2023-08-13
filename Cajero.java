public class Cajero {

    public static void main (String args[]) {

        System.out.println("## BIENVENIDO AL CAJERO ##");
        Monedero monedero = new Monedero(500.00);
        monedero.mostrarSaldo();

        System.out.println("## BIENVENIDO AL CAJERO ##");
        monedero.depositarDinero(200.00);
        monedero.mostrarSaldo();

        System.out.println("## BIENVENIDO AL CAJERO ##");
        monedero.retirarDinero(800.00);
        monedero.retirarDinero(400.00);
        monedero.mostrarSaldo();
    }
}
