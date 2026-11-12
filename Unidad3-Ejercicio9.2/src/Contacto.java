public class Contacto {

    private String nombre;
    private String telefono;
    private String correo;

    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        setTelefono(telefono);
        setCorreo(correo);
    }

    public void setTelefono(String telefono) {

        if (telefono != null && telefono.matches("[0-9+\\- ]+")) {
            this.telefono = telefono;
            System.out.println("Teléfono actualizado.");
        } else {
            System.out.println("Teléfono inválido.");
        }
    }

    public void setCorreo(String correo) {

        if (correo != null && correo.contains("@")) {
            this.correo = correo;
            System.out.println("Correo actualizado.");
        } else {
            System.out.println("Correo inválido.");
        }
    }

    public String obtenerDatos() {
        return "Nombre: " + nombre +
                "\nTeléfono: " + telefono +
                "\nCorreo: " + correo;
    }
}