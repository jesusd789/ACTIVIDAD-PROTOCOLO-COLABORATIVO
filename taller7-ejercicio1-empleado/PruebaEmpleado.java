public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado e = new Empleado("Ana", 2500000);
        System.out.println("Nombre (publico): " + e.nombre);
        System.out.println("Salario (get): " + e.getSalario());

        e.nombre = "Ana Maria";          // permitido: nombre es public
        e.setSalario(3000000);           // valido
        e.setSalario(-100);              // rechazado por la validacion
        System.out.println(e.nombre + " -> " + e.getSalario());

        // e.salario = 5;                // ERROR de compilacion: salario es private
    }
}
