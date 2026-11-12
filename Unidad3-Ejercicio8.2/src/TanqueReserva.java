public class TanqueReserva {

    private double capacidadMaxima;
    private double nivelActual;

    public TanqueReserva(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.nivelActual = 0;
    }

    public void llenar(double litros) {

        if (litros <= 0) {
            System.out.println("Cantidad inválida.");
            return;
        }

        if (nivelActual + litros <= capacidadMaxima) {
            nivelActual += litros;
            System.out.println("Tanque llenado correctamente.");
        } else {
            System.out.println("No se puede superar la capacidad máxima.");
        }
    }

    public void consumir(double litros) {

        if (litros <= 0) {
            System.out.println("Cantidad inválida.");
            return;
        }

        if (nivelActual >= litros) {
            nivelActual -= litros;
            System.out.println("Agua consumida correctamente.");
        } else {
            System.out.println("No hay suficiente agua.");
        }
    }

    public double obtenerNivelActual() {
        return nivelActual;
    }
}