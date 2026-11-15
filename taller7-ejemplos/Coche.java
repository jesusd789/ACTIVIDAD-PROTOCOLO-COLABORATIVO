// Ejemplo correcto 1: atributos privados + métodos públicos de acceso
public class Coche {
    private String marca;
    private double velocidadMaxima;

    public Coche(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método público para obtener la marca del coche
    public String getMarca() {
        return marca;
    }

    // Método público para establecer la velocidad máxima (con validación)
    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    // Método público para mostrar la información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
