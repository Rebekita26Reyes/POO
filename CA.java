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

//En esta clase implementamos las interfaces IC Y Comparable
public class CA implements IC,Comparable{ 
  
//Estas son variable de esta clase, para llamarlas sin que haya conflicto,
// se usa this.(nombre de la misma)... Ejemplo: this.x
 
   private int x,y;

   //Constructor de esta clase:
   public CA(int x, int y)
   {
    this.setX(x);//Estos metodos se mandan a llamar con this,
// porque esos metodos estan dentro de esta clase o heredados.
    this.setY(y);//lo mismo.
}
   public CA(){this(0,0);}////Este es un constructor tambien, 
//que se "ejecuta" cuando no le pasamos ningun valor al momento de crear un objeto CA,
// son como los valores por defecto.
   
//Subrutinas finales (que no se podran heredar), void significa procedimiento, 
//es decir, que no devuelve nada, solo hace una operacion
  public final void setX(int x) { this.x = x; } //Aqui para no confudir la x que se pasa por parametro con la x 
//que se declaro alla arriba, se usa this.x (this.x es la x de alla arriba)
  public final void setY(int y) { this.y = y; } //si pusieramos y = y, no tendria sentido y
  //daria un error probablemente o simplemente no tamaria el valor y.
   
  //Metodos que si se pueden heredar y, en este caso, devuelven datos, donde dise public int, 
//int significa que devolvera un valor de numero entero.
   public int getX(){return this.x;}////devolvemos lo que vale x, x fue declarada alla
//arriba y le damos un valor cuando creamos una instancia de esta clase a traves
// del constructor .
   public int getY(){return this.y;}//lo mismo
     
    //un metodo que va a hacer esta operacion de la suma con los datos que le pasaremos
   //(X y Y) y devolvera el resultado si la llamamos
   public int suma() {
      return this.getX() + this.getY();
   }

   //Es te metodo es el que heredamos de interfaz IC
    @Override // indicar al compilador que tu intención es sobreescribir el método de la clase padre
    public int mayor() {
        return 0;
    }
    
//Es te metodo es el que heredamos de interfaz IB
    @Override//lo mismo.
    public int multi() {
       return 0;
    }
   
    //Es te metodo es el que heredamos de interfaz Comparable
    @Override //Permite sobrescribir un método al momento que se hereda de una Interface en Java.
    public int compareTO(Object uno,Object dos) {
        //Asi deberia de ser solo que da error en compareTO
  //return uno.compareTO(dos);
         if(uno.equals(dos)){
         return 0;   
        }
      else if(uno<dos){ // Aqui los genera un error en uno<dos
            return -1;
        } else {
             return +1;
       } 
    }
} 

    
