// Clase definida como pública: accesible desde cualquier paquete
public class Persona {
    public String nombre; // atributo público (válido para datos NO sensibles)

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
