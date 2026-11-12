public class Main {
    public static void main(String[] args) {

        Enrutador enrutador = new Enrutador("ROUTER01");

        enrutador.setDireccionIP("192.168.1.1");
        enrutador.setDireccionIP("192.168.1.300");
        enrutador.setDireccionIP("IP incorrecta");

        System.out.println("Dirección IP actual: " + enrutador.obtenerDireccionIP());
        System.out.println("Conectado: " + enrutador.estaConectado());
    }
}