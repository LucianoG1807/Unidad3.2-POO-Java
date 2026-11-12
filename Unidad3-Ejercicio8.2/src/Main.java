public class Main {
    public static void main(String[] args) {

        TanqueReserva tanque = new TanqueReserva(1000);

        tanque.llenar(500);
        tanque.llenar(700);

        tanque.consumir(200);
        tanque.consumir(400);

        System.out.println("Nivel actual: " + tanque.obtenerNivelActual() + " litros.");
    }
}