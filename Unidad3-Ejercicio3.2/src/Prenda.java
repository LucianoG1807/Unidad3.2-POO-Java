import java.util.HashMap;

public class Prenda {

    private String modelo;
    private double precio;
    private HashMap<String, Integer> stock;

    public Prenda(String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;

        stock = new HashMap<>();

        stock.put("S", 0);
        stock.put("M", 0);
        stock.put("L", 0);
        stock.put("XL", 0);
    }

    public int consultarStock(String talle) {
        if (stock.containsKey(talle)) {
            return stock.get(talle);
        }

        return -1;
    }

    public void agregarStock(String talle, int cantidad) {

        if (stock.containsKey(talle) && cantidad > 0) {
            stock.put(talle, stock.get(talle) + cantidad);
            System.out.println("Stock agregado correctamente.");
        } else {
            System.out.println("Talle o cantidad inválida.");
        }
    }

    public void vender(String talle, int cantidad) {

        if (!stock.containsKey(talle) || cantidad <= 0) {
            System.out.println("Datos inválidos.");
            return;
        }

        if (stock.get(talle) >= cantidad) {
            stock.put(talle, stock.get(talle) - cantidad);
            System.out.println("Venta realizada correctamente.");
        } else {
            System.out.println("No hay suficiente stock.");
        }
    }

    public void mostrarInventario() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);

        for (String talle : stock.keySet()) {
            System.out.println(talle + ": " + stock.get(talle) + " unidades");
        }
    }
}