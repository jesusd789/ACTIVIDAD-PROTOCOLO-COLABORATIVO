// EJERCICIO 4 - PARTE 1: Herencia multiple (NO compila en Java)
// Para ver el error, compila este archivo:  javac HerenciaMultiple.java
// Error esperado: '{' expected  (Java solo permite extender UNA clase)

class ClaseA {
}

class ClaseB {
}

// class ClaseC extends ClaseA, ClaseB {   // ERROR de compilacion
// }

public class HerenciaMultiple {
    public static void main(String[] args) {
        System.out.println("Descomenta ClaseC para ver el error de compilacion.");
    }
}
