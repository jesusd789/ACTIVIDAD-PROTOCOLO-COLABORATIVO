// Mala practica (compila): el constructor de Perro2 no recibe ni pasa datos a la base;
// Java inserta super() implicito, que requiere un constructor sin argumentos en Animal2.
class Animal2 {
    private String especie;

    public Animal2() {                 // constructor por defecto explicito para que compile
        this.especie = "desconocida";  // la especie queda con un valor generico
    }

    public Animal2(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }
}

// Clase derivada (MALA PRACTICA): no llama a super(especie)
class Perro2 extends Animal2 {
    public Perro2(String raza) {
        // No se llama al constructor de la clase base con datos: la especie queda "desconocida"
        System.out.println("Raza: " + raza);
    }
}
