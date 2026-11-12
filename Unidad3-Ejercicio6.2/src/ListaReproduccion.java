import java.util.ArrayList;

public class ListaReproduccion {

    private String nombreLista;
    private ArrayList<String> canciones;
    private int indiceActual;

    public ListaReproduccion(String nombreLista) {
        this.nombreLista = nombreLista;
        this.canciones = new ArrayList<>();
        this.indiceActual = 0;
    }

    public void agregarCancion(String cancion) {
        canciones.add(cancion);
    }

    public void siguiente() {

        if (indiceActual < canciones.size() - 1) {
            indiceActual++;
        } else {
            System.out.println("No hay más canciones.");
        }
    }

    public void anterior() {

        if (indiceActual > 0) {
            indiceActual--;
        } else {
            System.out.println("Ya estás en la primera canción.");
        }
    }

    public String obtenerPistaActual() {

        if (canciones.isEmpty()) {
            return "La lista está vacía.";
        }

        return canciones.get(indiceActual);
    }
}