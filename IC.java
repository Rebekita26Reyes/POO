/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Cesia
 */

/**Esta interfaz hereda de las primeras 
dos interfacesaterriores IA Y IB ,
Por lo tanto,hereda sus métodos...*/
public interface IC extends IA,IB {
    int mayor();

    @Override
    public int suma();

    @Override
    public int multi();
}
