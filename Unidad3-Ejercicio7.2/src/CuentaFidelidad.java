public class CuentaFidelidad {

    private String numeroSocio;
    private String nivelMembresia;
    private int puntosAcumulados;

    public CuentaFidelidad(String numeroSocio, String nivelMembresia) {
        this.numeroSocio = numeroSocio;
        this.nivelMembresia = nivelMembresia;
        this.puntosAcumulados = 0;
    }

    public void acumularPuntos(double montoCompra) {

        if (montoCompra > 0) {
            int puntos = (int) (montoCompra / 100);
            puntosAcumulados += puntos;

            System.out.println("Se acumularon " + puntos + " puntos.");
        } else {
            System.out.println("Monto de compra inválido.");
        }
    }

    public boolean canjearPremio(int puntosRequeridos) {

        if (puntosRequeridos > 0 && puntosAcumulados >= puntosRequeridos) {
            puntosAcumulados -= puntosRequeridos;
            System.out.println("Premio canjeado correctamente.");
            return true;
        }

        System.out.println("No hay suficientes puntos.");
        return false;
    }

    public int obtenerPuntos() {
        return puntosAcumulados;
    }
}