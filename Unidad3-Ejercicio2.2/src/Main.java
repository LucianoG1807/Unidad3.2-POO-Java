public class Main {
    public static void main(String[] args) {

        CajaFuerte caja = new CajaFuerte("1234");

        caja.abrir("1111");
        caja.abrir("2222");
        caja.abrir("1234");

        System.out.println("¿Está bloqueada? " + caja.estaBloqueada());

        caja.abrir("1234");
    }
}