public class PruebaEstudiante {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos", 40);
        p.mostrarDetalles();

        Estudiante e = new Estudiante("Maria", 20, "2024-0123");
        e.mostrarDetalles();

        Estudiante e2 = new Estudiante("Pedro", 22, "2023-0456");
        e2.mostrarDetalles();
    }
}
