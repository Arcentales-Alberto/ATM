package atm;

// Deposito.java
// Representa una transacción de depósito en el ATM

public class Deposito extends Transaccion {

    private double monto; // monto a depositar
    private Teclado teclado; // referencia al teclado
    private RanuraDeposito ranuraDeposito; // referencia a la ranura de depósito
    private final static int CANCELO = 0; // constante para la opción de cancelar

    // constructor de Deposito
    public Deposito(int numeroCuentaUsuario, Pantalla pantallaATM, BaseDatosBanco baseDatosBancoATM, Teclado tecladoATM, RanuraDeposito ranuraDepositoATM) {
        // inicializa las variables de la superclase
        super(numeroCuentaUsuario, pantallaATM, baseDatosBancoATM);

        // inicializa las referencias al teclado y la ranura de depósito
        teclado = tecladoATM;
        ranuraDeposito = ranuraDepositoATM;
    } // fin del constructor de Deposito

    // realiza la transacción
    @Override
    public void ejecutar() {
        BaseDatosBanco baseDatosBanco = obtenerBaseDatosBanco(); // obtiene la referencia
        Pantalla pantalla = obtenerPantalla(); // obtiene la referencia

        monto = pedirMontoADepositar(); // obtiene el monto a depositar del usuario

        // comprueba si el usuario introdujo un monto a depositar o canceló
        if (monto != CANCELO) {
            // solicita un sobre de depósito que contenga el monto especificado
            pantalla.mostrarMensaje("\nInserte un sobre que contenga ");
            pantalla.mostrarMontoDolares(monto);
            pantalla.mostrarLineaMensaje(".");

            // recibe el sobre de depósito
            boolean seRecibioSobre = ranuraDeposito.seRecibioSobre();

            // comprueba si se recibió el sobre de depósito
            if (seRecibioSobre) {
                pantalla.mostrarLineaMensaje("\nSe recibio su sobre de deposito.\n"
                        + "NOTA: El dinero que acaba de depositar no estara disponible hasta que "
                        + "hayamos verificado el monto del efectivo y cualquier cheque incluido.");
                // hace un abono a la cuenta para reflejar el depósito
                baseDatosBanco.abonar(obtenerNumeroCuenta(), monto);
            } // fin de if
            else // no se recibió el sobre de depósito
            {
                pantalla.mostrarLineaMensaje("\nNo inserto un sobre de deposito. Se ha cancelado su transaccion.");
            } // fin de else
        } // fin de if
        else // el usuario canceló en vez de introducir el monto
        {
            pantalla.mostrarLineaMensaje("\nCancelando transaccion...");
        } // fin de else
    } // fin del método ejecutar

    // pide al usuario que introduzca un monto a depositar en centavos
    private double pedirMontoADepositar() {
        Pantalla pantalla = obtenerPantalla(); // obtiene referencia a la pantalla

        // muestra el indicador
        pantalla.mostrarMensaje("\nIntroduzca un monto a depositar en CENTAVOS (o 0 para cancelar): ");
        int entrada = teclado.obtenerEntrada(); // recibe la entrada del monto de depósito

        // comprueba si el usuario canceló o introdujo un monto válido
        if (entrada == CANCELO) {
            return CANCELO;
        } else {
            return (double) entrada / 100; // devuelve el monto en dólares
        } // fin de else
    } // fin del método pedirMontoADepositar
} // fin de la clase Deposito


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