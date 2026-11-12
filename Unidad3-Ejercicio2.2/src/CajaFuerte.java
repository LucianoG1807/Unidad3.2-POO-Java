public class CajaFuerte {

    private String combinacionSecreta;
    private boolean bloqueada;
    private int intentosFallidos;

    public CajaFuerte(String combinacionSecreta) {
        this.combinacionSecreta = combinacionSecreta;
        this.bloqueada = false;
        this.intentosFallidos = 0;
    }

    public boolean abrir(String intentoClave) {

        if (bloqueada) {
            System.out.println("La caja fuerte está bloqueada.");
            return false;
        }

        if (combinacionSecreta.equals(intentoClave)) {
            intentosFallidos = 0;
            System.out.println("Caja fuerte abierta.");
            return true;
        } else {
            intentosFallidos++;
            System.out.println("Clave incorrecta.");

            if (intentosFallidos >= 3) {
                bloqueada = true;
                System.out.println("Caja fuerte bloqueada por seguridad.");
            }

            return false;
        }
    }

    public boolean cambiarCombinacion(String claveActual, String nuevaClave) {

        if (!bloqueada && combinacionSecreta.equals(claveActual)) {
            combinacionSecreta = nuevaClave;
            intentosFallidos = 0;
            System.out.println("Combinación modificada correctamente.");
            return true;
        }

        System.out.println("No se pudo cambiar la combinación.");
        return false;
    }

    public boolean estaBloqueada() {
        return bloqueada;
    }
}