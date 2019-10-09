package atm;

// Transaccion.java

import atm.BaseDatosBanco;

// La superclase abstracta Transaccion representa una transacción con el ATM

public abstract class Transaccion {

    private int numeroCuenta; // indica la cuenta implicada
    private Pantalla pantalla; // pantalla del ATM
    private BaseDatosBanco baseDatosBanco; // base de datos de información de cuentas

    // el constructor de Transaccion es invocado por las subclases mediante super()
    public Transaccion(int numeroCuentaUsuario, Pantalla pantallaATM, BaseDatosBanco baseDatosBancoATM) {
        numeroCuenta = numeroCuentaUsuario;
        pantalla = pantallaATM;
        baseDatosBanco = baseDatosBancoATM;
    } // fin del constructor de Transaccion

    // devuelve el número de cuenta
    public int obtenerNumeroCuenta() {
        return numeroCuenta;
    } // fin del método obtenerNumeroCuenta

    // devuelve una referencia a la pantalla
    public Pantalla obtenerPantalla() {
        return pantalla;
    } // fin del método obtenerPantalla

    // devuelve una referencia a la base de datos del banco
    public BaseDatosBanco obtenerBaseDatosBanco() {
        return baseDatosBanco;
    } // fin del método obtenerBaseDatosBanco

    // realiza la transacción (cada subclase sobrescribe este método)
    abstract public void ejecutar();
} // fin de la clase Transaccion



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