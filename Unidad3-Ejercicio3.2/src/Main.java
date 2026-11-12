public class Main {
    public static void main(String[] args) {

        Prenda prenda = new Prenda("Remera básica", 15000);

        prenda.agregarStock("S", 10);
        prenda.agregarStock("M", 15);
        prenda.agregarStock("L", 8);
        prenda.agregarStock("XL", 5);

        prenda.vender("M", 3);
        prenda.vender("L", 20);

        prenda.mostrarInventario();
    }
}