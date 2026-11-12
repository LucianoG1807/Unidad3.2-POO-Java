public class Main {
    public static void main(String[] args) {

        ListaReproduccion lista = new ListaReproduccion("Favoritas");

        lista.agregarCancion("Canción 1");
        lista.agregarCancion("Canción 2");
        lista.agregarCancion("Canción 3");

        System.out.println("Reproduciendo: " + lista.obtenerPistaActual());

        lista.siguiente();
        System.out.println("Reproduciendo: " + lista.obtenerPistaActual());

        lista.siguiente();
        lista.siguiente();

        System.out.println("Reproduciendo: " + lista.obtenerPistaActual());

        lista.anterior();
        System.out.println("Reproduciendo: " + lista.obtenerPistaActual());
    }
}