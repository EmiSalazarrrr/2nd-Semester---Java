
package proyectoexcepciones;

public class Banco {
    private Cuenta[] cuentas;

    public Banco(int NumCuentas) {
        cuentas = new Cuenta[NumCuentas];
    }

    public void agregarCuenta(Cuenta cuenta, int indice) throws RangoArray {
        if (indice < 0 || indice >= cuentas.length) {
            throw new RangoArray("No hay espacio para esta cuenta.");
        }
        if (cuentas[indice] != null) {
            throw new RangoArray("Ya existe una cuenta en este espacio.");
        }
        cuentas[indice] = cuenta;
    }

    // Método para mostrar la información de todas las cuentas
    public void mostrarInformacion() {
        for (Cuenta cuenta : cuentas) {
            if (cuenta != null) {
                System.out.println(cuenta);
            }
        }
    }
    
    public double totalSaldoMaxPenalizacion() {
        double totalSaldo = 0;
        double maxPenalizacion = 0;
        double penal;
        for (Cuenta cuenta : cuentas) {
            if (cuenta != null) {
                if (cuenta instanceof CuentaCorriente) {
                    totalSaldo += cuenta.getSaldo();
                }
                if (cuenta instanceof CuentaDeAhorroEsp) {
                     penal = ((CuentaDeAhorroEsp) cuenta).penalizacion;
                    if (penal > maxPenalizacion) {
                        maxPenalizacion = penal;
                    }
                }
            }
        }
        return totalSaldo + maxPenalizacion;
    }
}

