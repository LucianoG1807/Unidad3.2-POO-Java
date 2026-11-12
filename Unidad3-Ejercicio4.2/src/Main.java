public class Main {
    public static void main(String[] args) {

        Piloto piloto = new Piloto("LIC123", "Carlos");

        piloto.registrarVuelo(5.5);
        piloto.registrarVuelo(3.0);
        piloto.registrarVuelo(-2);

        System.out.println("Horas acumuladas: " + piloto.obtenerHorasVuelo());
    }
}