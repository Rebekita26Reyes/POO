/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Rebek
 */
public class Clase {
    public static void main(String[] args) {
    System.out.println("Ejecución finalizada.");
  }

 //Interfaces
  interface IA {
    final int MAX = 10;
    int suma();
  }

  interface IB {
    int multi();
  }

  interface IC extends IA, IB { //Esta interfaz hereda de las primeras dos interfaces ateriores (IA y IB), por lo tanto, hereda sus métodos. 
    int mayor();
  }

  interface Comparable { //Esta interfaz no hereda de nadie, está sola.
    int compareTo(Object uno, Object dos);
  }
//Fin interfaces

//Clases

//Explicación según mi humilde punto de vista:
/*
        La interfaz te dice que métodos "por obligación" vas a tener que usar en una clase que la implente. No estoy seguro si también con tipos o variables.


*/
class CA implements IC, Comparable { //Esta CLASE implementa a las interfaces anteriores, no es necesario implementar las interfaces IA ni IB porque IC ya las está heredando, por eso IC ya tiene todo lo que tiene IA e IB.
    int x, y;

    //A continuación, se define qué haran los métodos declarados en las interfaces, puesto que es obligación. En las interfaces solo se declaran, y en las clases se definen o sobreescriben (overriding se le dice).

    @Override
    public int suma() {
      return 0;
    }
    @Override
    public int multi() {
      return 0;
    }
    @Override
    public int mayor() {
      return 0;
    }
    @Override
    public int compareTo(Object uno, Object dos) {
      return 0;
    }
  }
}
    

