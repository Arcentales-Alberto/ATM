package atm;

import atm.BaseDatosBanco;





// SolicitudSaldo.java
// Representa una transacción de solicitud de saldo en el ATM

public class SolicitudSaldo extends Transaccion {

    // constructor de SolicitudSaldo
    public SolicitudSaldo(int numeroCuentaUsuario, Pantalla pantallaATM, BaseDatosBanco baseDatosBanco) {
        super(numeroCuentaUsuario, pantallaATM, baseDatosBanco);
    } // fin del constructor de SolicitudSaldo

    // realiza la transacción
    @Override
    public void ejecutar() {
        // obtiene referencias a la base de datos del banco y la pantalla
        BaseDatosBanco baseDatosBanco = obtenerBaseDatosBanco();
        Pantalla pantalla = obtenerPantalla();

        // obtiene el saldo disponible para la cuenta implicada
        double saldoDisponible = baseDatosBanco.obtenerSaldoDisponible(obtenerNumeroCuenta());

        // obtiene el saldo total para la cuenta implicada
        double saldoTotal = baseDatosBanco.obtenerSaldoTotal(obtenerNumeroCuenta());

        // muestra la información del saldo en la pantalla
        pantalla.mostrarLineaMensaje("\nInformacion de saldo:");
        pantalla.mostrarMensaje(" - Saldo disponible: ");
        pantalla.mostrarMontoDolares(saldoDisponible);
        pantalla.mostrarMensaje("\n - Saldo total: ");
        pantalla.mostrarMontoDolares(saldoTotal);
        pantalla.mostrarLineaMensaje("");
    } // fin del método ejecutar
} // fin de la clase SolicitudSaldo



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