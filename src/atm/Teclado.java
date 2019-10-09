package atm;

// Teclado.java
// Representa el teclado del ATM

import java.util.Scanner; // el programa usa a Scanner para obtener la entrada del usuario
public class Teclado {

    private Scanner entrada; // lee datos de la línea de comandos

    // el constructor sin argumentos inicializa el objeto Scanner
    public Teclado() {
        entrada = new Scanner(System.in);
    } // fin del constructor sin argumentos de Teclado

    // devuelve un valor entero introducido por el usuario
    public int obtenerEntrada() {
        return entrada.nextInt(); // suponemos que el usuario introduce un entero
    } // fin del método obtenerEntrada
} // fin de la clase Teclado



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