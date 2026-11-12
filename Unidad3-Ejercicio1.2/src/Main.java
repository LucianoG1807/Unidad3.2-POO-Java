public class Main {
    public static void main(String[] args) {

        LibretaCalificaciones libreta = new LibretaCalificaciones("Juan");

        libreta.agregarNota(8.5);
        libreta.agregarNota(7.0);
        libreta.agregarNota(9.0);
        libreta.agregarNota(11.0);
        libreta.agregarNota(0.0);

        System.out.println("Promedio final: " + libreta.obtenerPromedio());
    }
}