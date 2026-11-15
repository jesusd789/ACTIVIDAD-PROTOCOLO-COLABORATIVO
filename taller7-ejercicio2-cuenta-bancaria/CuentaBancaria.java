public class CuentaBancaria {
    private String numeroCuenta;   // privado
    private double saldo;          // privado
    public String tipoCuenta;      // público

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo invalido, no se modifica.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta + " | Tipo: " + tipoCuenta + " | Saldo: " + saldo);
    }
}
