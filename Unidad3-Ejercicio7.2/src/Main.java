public class Main {
    public static void main(String[] args) {

        CuentaFidelidad cuenta = new CuentaFidelidad("SOC001", "Oro");

        cuenta.acumularPuntos(5000);
        cuenta.acumularPuntos(3000);

        cuenta.canjearPremio(30);
        cuenta.canjearPremio(100);

        System.out.println("Puntos finales: " + cuenta.obtenerPuntos());
    }
}