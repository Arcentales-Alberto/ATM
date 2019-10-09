package atm;

// Pantalla.java
// Representa a la pantalla del ATM

public class Pantalla {

    // muestra un mensaje sin un retorno de carro
    public void mostrarMensaje(String mensaje) {
        System.out.print(mensaje);
    } // fin del método mostrarMensaje

    // muestra un mensaje con un retorno de carro
    public void mostrarLineaMensaje(String mensaje) {
        System.out.println(mensaje);
    } // fin del método mostrarLineaMensaje

    // muestra un monto en dólares
    public void mostrarMontoDolares(double monto) {
        System.out.printf("$%,.2f", monto);
    } // fin del método mostrarMontoDolares
} // fin de la clase Pantalla



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