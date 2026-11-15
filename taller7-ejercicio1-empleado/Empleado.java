public class Empleado {
    public String nombre;      // público según el enunciado
    private double salario;    // privado: se accede con get/set

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    // Validación: el salario no puede ser negativo ni cero
    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salario invalido: " + salario + " (se ignora)");
        }
    }
}
