public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Estudiante -> Nombre: " + nombre + ", Edad: " + edad + ", Matricula: " + matricula);
    }
}
