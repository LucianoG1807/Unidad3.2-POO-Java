public class Main {
    public static void main(String[] args) {

        Contacto contacto = new Contacto(
                "Pedro",
                "2615551234",
                "pedro@gmail.com"
        );

        contacto.setTelefono("261ABC");
        contacto.setCorreo("pedro.com");

        contacto.setTelefono("2614445555");
        contacto.setCorreo("pedro@hotmail.com");

        System.out.println("\nDatos del contacto:");
        System.out.println(contacto.obtenerDatos());
    }
}