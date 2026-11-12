import java.util.ArrayList;

public class LibretaCalificaciones {

    private String nombreEstudiante;
    private ArrayList<Double> notas;

    public LibretaCalificaciones(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(double nota) {
        if (nota > 0.0 && nota < 10.0) {
            notas.add(nota);
            System.out.println("Nota agregada correctamente.");
        } else {
            System.out.println("Nota inválida. Debe ser mayor a 0 y menor a 10.");
        }
    }

    public double obtenerPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.size();
    }
}