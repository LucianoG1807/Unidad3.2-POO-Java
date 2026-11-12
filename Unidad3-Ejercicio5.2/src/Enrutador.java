public class Enrutador {

    private String identificador;
    private String direccionIP;
    private boolean conectado;

    public Enrutador(String identificador) {
        this.identificador = identificador;
        this.direccionIP = "0.0.0.0";
        this.conectado = false;
    }

    public boolean setDireccionIP(String nuevaIp) {

        String patron = "^([0-9]{1,3}\\.){3}[0-9]{1,3}$";

        if (nuevaIp.matches(patron)) {

            String[] partes = nuevaIp.split("\\.");

            for (String parte : partes) {
                int numero = Integer.parseInt(parte);

                if (numero < 0 || numero > 255) {
                    System.out.println("Dirección IP inválida.");
                    return false;
                }
            }

            direccionIP = nuevaIp;
            System.out.println("Dirección IP configurada correctamente.");
            return true;
        }

        System.out.println("Formato de IP inválido.");
        return false;
    }

    public String obtenerDireccionIP() {
        return direccionIP;
    }

    public boolean estaConectado() {
        return conectado;
    }
}