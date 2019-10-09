package atm;

// Cuenta.java
// Representa a una cuenta bancaria

public class Cuenta {

    private int numeroCuenta; // número de cuenta
    private int nip; // NIP para autenticación
    private double saldoDisponible; // fondos disponibles para retirar
    private double saldoTotal; // fondos disponibles + depósitos pendientes

    // el constructor de Cuenta inicializa los atributos
    public Cuenta(int elNumeroDeCuenta, int elNIP, double elSaldoDisponible, double elSaldoTotal) {
        numeroCuenta = elNumeroDeCuenta;
        nip = elNIP;
        saldoDisponible = elSaldoDisponible;
        saldoTotal = elSaldoTotal;
    } // fin del constructor de Cuenta

    // determina si un NIP especificado por el usuario coincide con el NIP en la Cuenta
    public boolean validarNIP(int nipUsuario) {
        if (nipUsuario == nip) {
            return true;
        } else {
            return false;
        }
    } // fin del método validarNIP

    // devuelve el saldo disponible
    public double obtenerSaldoDisponible() {
        return saldoDisponible;
    } // fin de obtenerSaldoDisponible

    // devuelve el saldo total
    public double obtenerSaldoTotal() {
        return saldoTotal;
    } // fin del método obtenerSaldoTotal

    // abona un monto a la cuenta
    public void abonar(double monto) {
        saldoTotal += monto; // lo suma al saldo total
    } // fin del método abonar

    // carga un monto a la cuenta
    public void cargar(double monto) {
        saldoDisponible -= monto; // lo resta del saldo disponible
        saldoTotal -= monto; // lo resta del saldo total
    } // fin del método cargar

    // devuelve el número de cuenta
    public int obtenerNumeroCuenta() {
        return numeroCuenta;
    } // fin del método obtenerNumeroCuenta
} // fin de la clase Cuenta


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/