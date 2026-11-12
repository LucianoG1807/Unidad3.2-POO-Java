public class ControlAforo {

    private int capacidadMaxima;
    private int asistentesActuales;

    public ControlAforo(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.asistentesActuales = 0;
    }

    public boolean registrarIngreso() {

        if (asistentesActuales < capacidadMaxima) {
            asistentesActuales++;
            System.out.println("Ingreso permitido.");
            return true;
        }

        System.out.println("Ingreso rechazado. Aforo completo.");
        return false;
    }

    public void registrarSalida() {

        if (asistentesActuales > 0) {
            asistentesActuales--;
            System.out.println("Salida registrada.");
        } else {
            System.out.println("No hay asistentes para registrar una salida.");
        }
    }

    public int obtenerAsistentesActuales() {
        return asistentesActuales;
    }
}