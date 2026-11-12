public class Main {
    public static void main(String[] args) {

        ControlAforo evento = new ControlAforo(3);

        evento.registrarIngreso();
        evento.registrarIngreso();
        evento.registrarIngreso();
        evento.registrarIngreso();
        evento.registrarIngreso();

        System.out.println("Asistentes actuales: " +
                evento.obtenerAsistentesActuales());

        evento.registrarSalida();

        System.out.println("Asistentes actuales: " +
                evento.obtenerAsistentesActuales());
    }
}