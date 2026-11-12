public class Piloto {

    private String numeroLicencia;
    private String nombre;
    private double horasVuelo;

    public Piloto(String numeroLicencia, String nombre) {
        this.numeroLicencia = numeroLicencia;
        this.nombre = nombre;
        this.horasVuelo = 0;
    }

    public void registrarVuelo(double horas) {

        if (horas > 0) {
            horasVuelo += horas;
            System.out.println("Vuelo registrado correctamente.");
        } else {
            System.out.println("Las horas deben ser positivas.");
        }
    }

    public double obtenerHorasVuelo() {
        return horasVuelo;
    }
}