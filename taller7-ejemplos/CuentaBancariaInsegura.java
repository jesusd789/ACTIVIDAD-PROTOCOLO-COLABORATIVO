// Ejemplo INCORRECTO (compila, pero es mala práctica):
// el atributo sensible "saldo" es público, cualquiera puede modificarlo sin control.
public class CuentaBancariaInsegura {
    public double saldo;

    public CuentaBancariaInsegura(double saldoInicial) {
        saldo = saldoInicial;
    }
}
